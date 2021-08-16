package com.apitask.hometasks;

import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PetDogValidations {

    @Test
    public void createPetDogResource() {
        System.out.println("Created Response is "+ ValidationMethod.createResource(PayloadsAndEndPoint.swaggerPetURI,PayloadsAndEndPoint.petEndPoint,PayloadsAndEndPoint.payloadSwagger(),HttpStatus.SC_OK));
    }

    @Test
    public void validatePetResource() {
        createPetDogResource();
        Response response = ValidationMethod.getResource(PayloadsAndEndPoint.swaggerPetURI, "/v2/pet/12345");
        ValidationMethod.validateStatusCode(response, 200);
        ValidationMethod.validateContentType(response, "application/json");
        String categoryName = ValidationMethod.getEmbeddedPathValue(response, "category", "name");
        System.out.println("categoryName is "+categoryName);
        if (categoryName.equalsIgnoreCase("dog")){
            String dogName = ValidationMethod.getSpecificPathValue(response, "name");
            String status = ValidationMethod.getSpecificPathValue(response, "status");
            System.out.println("dogName is "+dogName+" & Status is "+status);
            Assert.assertTrue(dogName.equalsIgnoreCase("snoopie")&&status.equalsIgnoreCase("pending"),
                            "Expected condition does not match");
            System.out.println("Validation is completed");
        }
        else
        Assert.fail();
    }

}
