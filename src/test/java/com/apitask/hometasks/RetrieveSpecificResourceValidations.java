package com.apitask.hometasks;

import main.data.PayloadsAndEndPoint;
import main.utility.ValidationMethod;
import org.testng.annotations.Test;

public class RetrieveSpecificResourceValidations {

    @Test
    public void getSpecificPosts() {
        System.out.println("Specific resource is "+ ValidationMethod.getSpecificResourceData(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.postsEndPoint,"userId","10"));

    }
    @Test
    public void getSpecificComments() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.commentsEndPoint,"postId","99"));

    }
    @Test
    public void getSpecificAlbums() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.albumsEndPoint,"userId", "7"));

    }
    @Test
    public void getSpecificPhotos() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.photosEndPoint,"albumId","299"));

    }
    @Test
    public void getSpecificToDos() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.todosEndPoint,"userId","1"));

    }
    @Test
    public void getSpecificUsers() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(PayloadsAndEndPoint.baseURI, PayloadsAndEndPoint.usersEndPoint,"name", "Leanne Graham"));

    }


}
