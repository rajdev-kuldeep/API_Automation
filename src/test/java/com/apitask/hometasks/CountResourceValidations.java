package com.apitask.hometasks;

import io.restassured.response.Response;
import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import static main.utility.ValidationMethod.*;
import org.testng.annotations.Test;

public class CountResourceValidations {

   @Test
    public void validatePostsResourceCount() {
       Response response = getResource(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.postsEndPoint);
       System.out.println("Resource Count is "+ ValidationMethod.getResourcesCount(response));
    }
    @Test
    public void validateCommentsResourceCount() {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.commentsEndPoint));
    }
    @Test
    public void validateAlbumsResourceCount() {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.albumsEndPoint));
    }
    @Test
    public void validatePhotosResourceCount() {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.photosEndPoint));
    }
    @Test
    public void validateToDosResourceCount() {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.todosEndPoint));
    }
    @Test
    public void validateUsersResourceCount() {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.usersEndPoint));
    }

}
