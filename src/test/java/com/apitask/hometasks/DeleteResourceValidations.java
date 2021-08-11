package com.apitask.hometasks;

import Resource.Data.PayloadsAndEndPoint;
import Resource.Utility.ValidationMethod;
import org.testng.annotations.Test;

public class DeleteResourceValidations {
    PayloadsAndEndPoint peData= new PayloadsAndEndPoint();

    @Test
    public void deletePosts() {
        System.out.println("Deleted Response is "+ ValidationMethod.deleteResource(peData.baseURI,peData.postsEndPoint,2));
    }
    @Test
    public void deleteComments() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(peData.baseURI,peData.commentsEndPoint,30));
    }
    @Test
    public void deleteAlbums() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(peData.baseURI,peData.albumsEndPoint,100));
    }
    @Test
    public void deletePhotos() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(peData.baseURI,peData.photosEndPoint,4888));
    }
    @Test
    public void deleteToDos() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(peData.baseURI,peData.todosEndPoint, 10));
    }
    @Test
    public void deleteUsers() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(peData.baseURI,peData.usersEndPoint, 9));
    }
}
