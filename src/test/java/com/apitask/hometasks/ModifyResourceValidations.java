package com.apitask.hometasks;

import Resource.Data.PayloadsAndEndPoint;
import Resource.Utility.ValidationMethod;
import org.testng.annotations.Test;

public class ModifyResourceValidations {

    PayloadsAndEndPoint peData= new PayloadsAndEndPoint();

    @Test
    public void modifyPosts() {
        System.out.println("Updated Response is "+ ValidationMethod.modifyResourceData(peData.baseURI,peData.postsEndPoint,peData.payloadPosts(), 2));
    }

    @Test
    public void modifyComments() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(peData.baseURI,peData.commentsEndPoint,peData.payloadComments(), 30));
    }
    @Test
    public void modifyAlbums() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(peData.baseURI,peData.albumsEndPoint,peData.payloadAlbums(), 100));
    }
    @Test
    public void modifyPhotos() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(peData.baseURI,peData.photosEndPoint,peData.payloadPhotos(), 4888));
    }
    @Test
    public void modifyToDos() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(peData.baseURI,peData.todosEndPoint,peData.payloadToDos(), 10));
    }

    @Test
    public void modifyUsers() {
        System.out.println("Updated Response is "+ValidationMethod.modifyResourceData(peData.baseURI,peData.usersEndPoint,peData.payloadUsers(), 9));
    }
}
