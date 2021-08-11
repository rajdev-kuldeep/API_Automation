package com.apitask.hometasktwo;

import Resource.Data.PayloadsAndEndPoint;
import Resource.Utility.ValidationMethod;
import org.testng.annotations.Test;

public class CreateResourceValidations {

    PayloadsAndEndPoint peData= new PayloadsAndEndPoint();

    @Test
    public void createPosts() {
        System.out.println("Created Response is "+ ValidationMethod.createResource(peData.baseURI,peData.postsEndPoint,peData.payloadPosts()));
    }

    @Test
    public void createComments() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.commentsEndPoint,peData.payloadComments()));
    }
    @Test
    public void createAlbums() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.albumsEndPoint,peData.payloadAlbums()));
    }
    @Test
    public void createPhotos() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.photosEndPoint,peData.payloadPhotos()));
    }
    @Test
    public void createToDos() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.todosEndPoint,peData.payloadToDos()));
    }

    @Test
    public void createUsers() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.usersEndPoint,peData.payloadUsers()));
    }
}
