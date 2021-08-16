package main.utility;

import io.restassured.response.Response;
import main.data.PayloadsAndEndPoint;
import org.apache.http.HttpStatus;
import org.testng.Assert;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import static io.restassured.RestAssured.*;

public class ValidationMethod {

    public static int getResourcesNumber(String baseURI, String endPoint) {
        return getResource( baseURI, endPoint).jsonPath().getList("id").size();
    }

    public static int getResourcesCount(Response response) {
        return response.body().path("data.size()");
    }

    public static String modifyResourceData(String baseURI, String endPoint, String payload, Object pathParam) {
        Response response = given().baseUri(baseURI).headers("Content-Type","application/json")
                .pathParam("id", pathParam).log().all().and().body(payload).put(endPoint+"/{id}");
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response.asString();
    }

    public static String deleteResource(String baseURI, String endPoint, Object pathParam) {
        Response response = given().baseUri(baseURI).pathParam("id", pathParam).when().delete(endPoint+"/{id}");
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response.asString();
    }

    public static String createResource(String baseURI, String endPoint, String payload, int expectedStatus) {
        Response response = given().baseUri(baseURI).headers("Content-Type","application/json").and().body(payload).post(endPoint);
        response.then().log().all().assertThat().statusCode(expectedStatus);
        return response.asString();
    }

    public static Response createResourceResponse(String baseURI, String endPoint, String payload, int expectedStatus) {
        Response response = given().baseUri(baseURI).headers("Content-Type","application/json").and().body(payload).post(endPoint);
        response.then().log().all().assertThat().statusCode(expectedStatus);
        return response;
    }

    public static Response getSpecificResourceData(String baseURI, String endPoint, String queryParamKey, String queryParam) {
        Response response = given().baseUri(baseURI).queryParam(queryParamKey, queryParam).log().all().when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response;
    }

    public static Response getResource(String baseURI, String endPoint) {
        Response response = given().baseUri(baseURI).headers("Content-Type", "application/json" ).when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response;
    }

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Status code is not matching expected value");
        System.out.println("Validation is completed");
    }

    public static void validateStatusLine(Response response, String expectedStatusLine) {
        Assert.assertEquals(response.getStatusLine(), expectedStatusLine, "Status line is not matching expected value");
        System.out.println("Validation is completed");
    }

    public static void validateContentType(Response response, String expectedContentType) {
        Assert.assertEquals(response.getContentType(), expectedContentType, "Response Content type is not matching expected value");
        System.out.println("Validation is completed");
    }

    public static String getSpecificPathValue(Response response, String pathKey) {
       return response.jsonPath().get(pathKey).toString();
    }

    public static String getEmbeddedPathValue(Response response, String pathKey, String embeddedPathKey) {
        LinkedHashMap embeddedPath = response.jsonPath().get(pathKey);
        return embeddedPath.get(embeddedPathKey).toString();

    }

    public static String returnEmployeeID(String employeeURI, String createEmployeeEndPoint,  String payloadEmployee, int expectedStatus) {
        Response response = createResourceResponse(employeeURI, createEmployeeEndPoint, payloadEmployee, expectedStatus);
        String employeeID = getEmbeddedPathValue(response,"data","id");
        System.out.println("Employee is created with id -- "+employeeID);
        return employeeID;
    }

    public static int returnEmployeeCount(Response response) {
        int currentEmployeeCount = getResourcesCount(response);
        System.out.println("Employee Count is -- "+currentEmployeeCount);
        return currentEmployeeCount;
    }

    public static boolean verifyResponseHeaders(Response response, String headerKey, String expectedValue) {
        String headerValue = response.header(headerKey);
        return headerValue.equals(expectedValue);
    }

    public static Response getResourceTwoQueryParam(String baseURI, String endPoint,  String queryParamKey1, String queryParam1, String queryParamKey2, String queryParam2) {
        Response response = given().baseUri(baseURI).queryParam(queryParamKey1, queryParam1).queryParam(queryParamKey2, queryParam2).log().all().when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response;

    }

    public static Response getResourceThreeQueryParam(String baseURI, String endPoint,  String queryParamKey1, Object queryParam1, String queryParamKey2, Object queryParam2, String queryParamKey3, String queryParam3) {
        Response response = given().baseUri(baseURI).queryParam(queryParamKey1, queryParam1).queryParam(queryParamKey2, queryParam2).queryParam(queryParamKey3, queryParam3).log().all().when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response;

    }

    public static Object getPathValue(Response response, String path){
        Object returnValue =  response.path("\"" +path+ "\"");
        return returnValue;
    }

}
