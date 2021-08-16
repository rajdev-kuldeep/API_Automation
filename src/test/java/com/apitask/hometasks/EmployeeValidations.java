package com.apitask.hometasks;

import io.restassured.response.Response;
import main.data.PayloadsAndEndPoint;
import org.apache.http.HttpStatus;
import static main.utility.ValidationMethod.*;
import static main.utility.ValidationMethod.verifyResponseHeaders;
import org.testng.Assert;
import org.testng.annotations.Test;



public class EmployeeValidations {

    @Test
    public void getEmployeeCount() {
        Response response= getResource(PayloadsAndEndPoint.employeeURI, PayloadsAndEndPoint.allEmployeeEndPoint);
        int currentEmployeeCount = getResourcesCount(response);
        Assert.assertTrue(verifyResponseHeaders(response, "Content-Type", "application/json"), "Response Header is not matching");
        Assert.assertTrue(verifyResponseHeaders(response, "content-encoding", "gzip"), "Response Header is not matching");
        validateStatusLine(response, "HTTP/1.1 200 OK");
        System.out.println("Employee Count is -- "+currentEmployeeCount);
    }

    @Test
    public void createEmployee() {
        Response response = createResourceResponse(PayloadsAndEndPoint.employeeURI, PayloadsAndEndPoint.createEmployeeEndPoint, PayloadsAndEndPoint.payloadEmployee(), HttpStatus.SC_OK);
        Assert.assertTrue(verifyResponseHeaders(response, "Content-Type", "application/json"), "Response Header is not matching");
        Assert.assertTrue(verifyResponseHeaders(response, "content-encoding", "gzip"), "Response Header is not matching");
        validateStatusLine(response, "HTTP/1.1 200 OK");
        String employeeID = getEmbeddedPathValue(response,"data","id");
        System.out.println("Employee is created with id -- "+employeeID);
    }

    @Test
    public void validateEmployeeCount() {
        createEmployee();
        Response response= getResource(PayloadsAndEndPoint.employeeURI, PayloadsAndEndPoint.allEmployeeEndPoint);
        int increasedEmployeeCount = getResourcesCount(response);
        Assert.assertTrue(returnEmployeeCount(response)+1==increasedEmployeeCount, "Employee Count is not increased by 1");
    }

    @Test
    public void verifyCreatedEmployee() {
        String employeeID = returnEmployeeID(PayloadsAndEndPoint.employeeURI,PayloadsAndEndPoint.createEmployeeEndPoint, PayloadsAndEndPoint.payloadEmployee(), HttpStatus.SC_OK);
        Assert.assertTrue(getResource(PayloadsAndEndPoint.employeeURI,PayloadsAndEndPoint.employeeEndPoint+"/"+employeeID).jsonPath().get("employee_name").equals("Kuldeep Rajdev")
        , "Employee details does not match");
    }

    @Test
    public void updateCreatedEmployee () {
        String employeeID = returnEmployeeID(PayloadsAndEndPoint.employeeURI,PayloadsAndEndPoint.createEmployeeEndPoint, PayloadsAndEndPoint.payloadEmployee(), HttpStatus.SC_OK);
        modifyResourceData(PayloadsAndEndPoint.employeeURI, PayloadsAndEndPoint.updateEmployeeEndpoint, PayloadsAndEndPoint.payloadUpdatedEmployee(),employeeID);

    }

    @Test
    public void deleteCreatedEmployee () {
        Response response = getResource(PayloadsAndEndPoint.employeeURI, PayloadsAndEndPoint.allEmployeeEndPoint);
        Assert.assertTrue(verifyResponseHeaders(response, "Content-Type", "application/json"), "Response Header is not matching");
        Assert.assertTrue(verifyResponseHeaders(response, "content-encoding", "gzip"), "Response Header is not matching");
        validateStatusLine(response, "HTTP/1.1 200 OK");
        String employeeID = returnEmployeeID(PayloadsAndEndPoint.employeeURI,PayloadsAndEndPoint.createEmployeeEndPoint, PayloadsAndEndPoint.payloadEmployee(), HttpStatus.SC_OK);
        deleteResource(PayloadsAndEndPoint.employeeURI, PayloadsAndEndPoint.deleteEmployeeEndpoint,employeeID);
        int decreasedEmployeeCount = getResourcesCount(response);
        Assert.assertTrue(returnEmployeeCount(response)-1==decreasedEmployeeCount, "Employee Count is not increased by 1");
    }
}
