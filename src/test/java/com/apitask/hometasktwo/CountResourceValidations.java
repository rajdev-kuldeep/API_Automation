package com.apitask.hometasktwo;

import Resource.Data.PayloadsAndEndPoint;
import Resource.Utility.ValidationMethod;
import org.testng.annotations.Test;

public class CountResourceValidations {

    PayloadsAndEndPoint peData= new PayloadsAndEndPoint();

    @Test
    public void validatePostsResourceCount()
    {
       System.out.println("Resource Count is "+ ValidationMethod.getResourcesNumber(peData.baseURI, peData.postsEndPoint));

    }
    @Test
    public void validateCommentsResourceCount()
    {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(peData.baseURI, peData.commentsEndPoint));

    }
    @Test
    public void validateAlbumsResourceCount()
    {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(peData.baseURI, peData.albumsEndPoint));

    }
    @Test
    public void validatePhotosResourceCount()
    {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(peData.baseURI, peData.photosEndPoint));

    }
    @Test
    public void validateToDosResourceCount()
    {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(peData.baseURI, peData.todosEndPoint));

    }
    @Test
    public void validateUsersResourceCount()
    {
        System.out.println("Resource Count is "+ValidationMethod.getResourcesNumber(peData.baseURI, peData.usersEndPoint));

    }

}
