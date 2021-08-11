package Resource.Utility;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.*;

public class ValidationMethod {

    public static int getResourcesNumber(String baseURI, String endPoint) {
        Response response = given().baseUri(baseURI).when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        int resourcesCount = response.jsonPath().getList("id").size();
        return resourcesCount;
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

    public static String createResource(String baseURI, String endPoint, String payload) {
        Response response = given().baseUri(baseURI).headers("Content-Type","application/json").and().body(payload).post(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_CREATED);
        return response.asString();
    }

    public static String getSpecificResourceData(String baseURI, String endPoint, String queryParamKey, String queryParam) {
        Response response = given().baseUri(baseURI).queryParam(queryParamKey, queryParam).log().all().when().get(endPoint);
        response.then().log().all().assertThat().statusCode(HttpStatus.SC_OK);
        return response.asString();
    }
}
