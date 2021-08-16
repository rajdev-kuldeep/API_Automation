package com.apitask.hometasks;

import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidations {

    @Test
    public void validateUser() {
        Response response = ValidationMethod.getResource(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.usersEndPoint);
        ValidationMethod.validateStatusCode(response, HttpStatus.SC_OK);
        Assert.assertTrue(response.jsonPath().getList("id").size()>=3, "There are not 3 or More user available");
        Assert.assertTrue(ValidationMethod.getSpecificPathValue(response, "name").contains("Ervin Howell"), "User Ervin Howell is not not present");
        System.out.println("Validation is completed");
    }
}
