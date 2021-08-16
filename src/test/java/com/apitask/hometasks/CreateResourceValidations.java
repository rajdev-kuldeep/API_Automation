package com.apitask.hometasks;

import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class CreateResourceValidations {

     @Test
    public void createPosts() {
        System.out.println("Created Response is "+ ValidationMethod.createResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.postsEndPoint,PayloadsAndEndPoint.payloadPosts(),HttpStatus.SC_CREATED));
    }

    @Test
    public void createComments() {
        System.out.println("Created Response is "+ValidationMethod.createResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.commentsEndPoint,PayloadsAndEndPoint.payloadComments(),HttpStatus.SC_CREATED));
    }
    @Test
    public void createAlbums() {
        System.out.println("Created Response is "+ValidationMethod.createResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.albumsEndPoint,PayloadsAndEndPoint.payloadAlbums(),HttpStatus.SC_CREATED));
    }
    @Test
    public void createPhotos() {
        System.out.println("Created Response is "+ValidationMethod.createResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.photosEndPoint,PayloadsAndEndPoint.payloadPhotos(),HttpStatus.SC_CREATED));
    }
    @Test
    public void createToDos() {
        System.out.println("Created Response is "+ValidationMethod.createResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.todosEndPoint,PayloadsAndEndPoint.payloadToDos(),HttpStatus.SC_CREATED));
    }

    @Test
    public void createUsers() {
        System.out.println("Created Response is "+ValidationMethod.createResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.usersEndPoint,PayloadsAndEndPoint.payloadUsers(),HttpStatus.SC_CREATED));
    }
}
