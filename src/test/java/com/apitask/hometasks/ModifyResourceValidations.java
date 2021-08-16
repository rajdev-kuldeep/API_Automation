package com.apitask.hometasks;

import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import org.testng.annotations.Test;

public class ModifyResourceValidations {

    @Test
    public void modifyPosts() {
        System.out.println("Updated Response is "+ ValidationMethod.modifyResourceData(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.postsEndPoint,PayloadsAndEndPoint.payloadPosts(), 2));
    }

    @Test
    public void modifyComments() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.commentsEndPoint,PayloadsAndEndPoint.payloadComments(), 30));
    }
    @Test
    public void modifyAlbums() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.albumsEndPoint,PayloadsAndEndPoint.payloadAlbums(), 100));
    }
    @Test
    public void modifyPhotos() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.photosEndPoint,PayloadsAndEndPoint.payloadPhotos(), 4888));
    }
    @Test
    public void modifyToDos() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.todosEndPoint,PayloadsAndEndPoint.payloadToDos(), 10));
    }

    @Test
    public void modifyUsers() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.usersEndPoint,PayloadsAndEndPoint.payloadUsers(), 9));
    }
}
