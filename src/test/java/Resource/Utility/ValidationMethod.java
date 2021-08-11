package Resource.Utility;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.Assert;

import java.util.LinkedHashMap;

import static io.restassured.RestAssured.*;

public class ValidationMethod {

    public static int getResourcesNumber(String baseURI, String endPoint) {
        return getResource( baseURI, endPoint).jsonPath().getList("id").size();
    }


    public static String modifyResourceData(String baseURI, String endPoint, String payload, int pathParam) {
        Response response = given().baseUri(baseURI).headers("Content-Type","application/json")
                .pathParam("id", pathParam).log().all().and().body(payload).put(endPoint+"/{id}");
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response.asString();
    }

    public static String deleteResource(String baseURI, String endPoint, int pathParam) {
        Response response = given().baseUri(baseURI).pathParam("id", pathParam).when().delete(endPoint+"/{id}");
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response.asString();
    }

    public static String createResource(String baseURI, String endPoint, String payload, int expectedStatus) {
        Response response = given().baseUri(baseURI).headers("Content-Type","application/json").and().body(payload).post(endPoint);
        response.then().log().all().assertThat().statusCode(expectedStatus);
        return response.asString();
    }

    public static Response getSpecificResourceData(String baseURI, String endPoint, String queryParamKey, String queryParam) {
        Response response = given().baseUri(baseURI).queryParam(queryParamKey, queryParam).log().all().when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response;
    }

    public static Response getResource(String baseURI, String endPoint) {
        Response response = given().baseUri(baseURI).when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response;
    }

    public static void validateStatusCode(Response response, int expectedStatusCode) {
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode, "Status code is not matching expected value");
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




}
