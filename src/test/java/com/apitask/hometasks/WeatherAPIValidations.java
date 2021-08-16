package com.apitask.hometasks;

import io.restassured.response.Response;
import main.data.PayloadsAndEndPoint;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.ArrayList;

import static main.utility.ValidationMethod.*;
import static main.utility.ValidationMethod.getPathValue;

public class WeatherAPIValidations {

    @Test
    public void getCityWeather() {

        Response response = getResourceTwoQueryParam(PayloadsAndEndPoint.weatherURI, PayloadsAndEndPoint.weatherEndPoint,"q", "hyderabad", "appid", PayloadsAndEndPoint.weatherAPIKey);
        ArrayList weather = response.path("weather.description");
        Assert.assertTrue(response.path("name").equals("Hyderabad"), "City is not matching");
        Assert.assertTrue(response.path("sys.country").equals("IN"), "Country is not matching");
        System.out.println("weather is "+weather);
    }

    @Test
    public void validateWeatherData() {
        Response weatherResponse = getResourceTwoQueryParam(PayloadsAndEndPoint.weatherURI, PayloadsAndEndPoint.weatherEndPoint,"q", "hyderabad", "appid", PayloadsAndEndPoint.weatherAPIKey);
        float longitude = weatherResponse.path("coord.lon");
        System.out.println("longitude -- "+longitude);
        float latitude  = weatherResponse.path("coord.lon");
        System.out.println("latitude -- "+latitude);
        Response lanLatResponse = getResourceThreeQueryParam(PayloadsAndEndPoint.weatherURI, PayloadsAndEndPoint.weatherEndPoint,"lat", latitude,"lon", longitude, "appid", PayloadsAndEndPoint.weatherAPIKey);
        float minTemp = lanLatResponse.path("main.temp_min");
        float temp = lanLatResponse.path("main.temp");
        Assert.assertTrue(minTemp>0, "Minimum Temp is not greater than Zero");
        Assert.assertTrue(temp>0, "Temp is not greater than Zero");
    }




}
