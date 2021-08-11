package com.apitask.hometasktwo;

import Resource.Data.PayloadsAndEndPoint;
import Resource.Utility.ValidationMethod;
import org.testng.annotations.Test;

public class RetrieveSpecificResourceValidations {

    PayloadsAndEndPoint peData= new PayloadsAndEndPoint();

    @Test
    public void getSpecificPosts() {
        System.out.println("Specific resource is "+ ValidationMethod.getSpecificResourceData(peData.baseURI, peData.postsEndPoint,"userId","10"));

    }
    @Test
    public void getSpecificComments() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(peData.baseURI, peData.commentsEndPoint,"postId","99"));

    }
    @Test
    public void getSpecificAlbums() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(peData.baseURI, peData.albumsEndPoint,"userId", "7"));

    }
    @Test
    public void getSpecificPhotos() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(peData.baseURI, peData.photosEndPoint,"albumId","299"));

    }
    @Test
    public void getSpecificToDos() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(peData.baseURI, peData.todosEndPoint,"userId","1"));

    }
    @Test
    public void getSpecificUsers() {
        System.out.println("Specific resource is "+ValidationMethod.getSpecificResourceData(peData.baseURI, peData.usersEndPoint,"name", "Leanne Graham"));

    }


}
