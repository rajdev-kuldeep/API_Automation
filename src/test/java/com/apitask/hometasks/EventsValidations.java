package com.apitask.hometasks;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import main.data.PayloadsAndEndPoint;
import static main.utility.ValidationMethod.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class EventsValidations {

    @Test
    public void validateEvents() {
        Response response = getResource(PayloadsAndEndPoint.eventURI, PayloadsAndEndPoint.eventsEndPoint);
        String engEventsName= response.path("events.find{it.language=='En'}.title");
        System.out.println("Print is  --- "+engEventsName);
        Assert.assertTrue(engEventsName.equals("Check-in app guide"), "Title of the event is not matching");

    }
}
