package com.apitask.hometasks;

import Resource.Data.PayloadsAndEndPoint;
import Resource.Utility.ValidationMethod;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class CreateResourceValidations {

    PayloadsAndEndPoint peData= new PayloadsAndEndPoint();

    @Test
    public void createPosts() {
        System.out.println("Created Response is "+ ValidationMethod.createResource(peData.baseURI,peData.postsEndPoint,peData.payloadPosts(),HttpStatus.SC_CREATED));
    }

    @Test
    public void createComments() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.commentsEndPoint,peData.payloadComments(),HttpStatus.SC_CREATED));
    }
    @Test
    public void createAlbums() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.albumsEndPoint,peData.payloadAlbums(),HttpStatus.SC_CREATED));
    }
    @Test
    public void createPhotos() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.photosEndPoint,peData.payloadPhotos(),HttpStatus.SC_CREATED));
    }
    @Test
    public void createToDos() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.todosEndPoint,peData.payloadToDos(),HttpStatus.SC_CREATED));
    }

    @Test
    public void createUsers() {
        System.out.println("Created Response is "+ValidationMethod.createResource(peData.baseURI,peData.usersEndPoint,peData.payloadUsers(),HttpStatus.SC_CREATED));
    }
}