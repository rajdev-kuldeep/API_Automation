package com.apitask.hometasks;

import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import org.testng.annotations.Test;

public class DeleteResourceValidations {

    @Test
    public void deletePosts() {
        System.out.println("Deleted Response is "+ ValidationMethod.deleteResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.postsEndPoint,2));
    }
    @Test
    public void deleteComments() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.commentsEndPoint,30));
    }
    @Test
    public void deleteAlbums() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.albumsEndPoint,100));
    }
    @Test
    public void deletePhotos() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.photosEndPoint,4888));
    }
    @Test
    public void deleteToDos() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.todosEndPoint, 10));
    }
    @Test
    public void deleteUsers() {
        System.out.println("Deleted Response is "+ValidationMethod.deleteResource(PayloadsAndEndPoint.baseURI,PayloadsAndEndPoint.usersEndPoint, 9));
    }
}
