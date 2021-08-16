package main.data;

public class PayloadsAndEndPoint {

    public static final String baseURI = "https://jsonplaceholder.typicode.com";
    public static final String postsEndPoint ="/posts";
    public static final String commentsEndPoint ="/comments";
    public static final String albumsEndPoint ="/albums";
    public static final String photosEndPoint ="/photos";
    public static final String todosEndPoint ="/todos";
    public static final String usersEndPoint ="/users";

    public static final String swaggerPetURI = "https://petstore.swagger.io";
    public static final String petEndPoint = "/v2/pet";

    public static final String employeeURI ="http://dummy.restapiexample.com/api/v1";
    public static final String allEmployeeEndPoint = "/employees";
    public static final String createEmployeeEndPoint = "/create";
    public static final String employeeEndPoint = "/employee";
    public static final String updateEmployeeEndpoint = "/update";
    public static final String deleteEmployeeEndpoint = "/delete";

    public static final String eventURI = "https://events.epam.com/api/v2";
    public static final String eventsEndPoint = "/events";


    public static String payloadPosts() {
        String payload="{\n" +
                "        \"userId\": 1,\n" +
                "        \"title\": \" Posts Payload Updated\",\n" +
                "        \"body\": \"Posts body created\"\n" +
                "    }";
        return payload;
    }

    public static String payloadComments() {
        String payload="{\n" +
                "        \"postId\": 1,\n" +
                "        \"name\": \"Kuldeep\",\n" +
                "        \"email\": \"Kuldeep@gardner.biz\",\n" +
                "        \"body\": \"Posts body created\"\n" +
                "    }";

        return payload;

    }
    public static String payloadAlbums() {
        String payload="{\n" +
                "        \"userId\": 1,\n" +
                "        \"title\": \"Album title created\"\n" +
                "    }";

        return payload;

    }
    public static String payloadPhotos() {
        String payload="{\n" +
                "        \"albumId\": 1,\n" +
                "        \"title\": \"Photo Title Created\",\n" +
                "        \"url\": \"https://via.KuldeepRajdev.com/123/a76ugg\",\n" +
                "        \"thumbnailUrl\": \"https://via.kuldeeprajdev.com/098/iutu77\"\n" +
                "    }";

        return payload;

    }
    public static String payloadToDos() {
        String payload="{\n" +
                "        \"userId\": 1,\n" +
                "        \"title\": \"Todo Title created\",\n" +
                "        \"completed\": true\n" +
                "    }";
        return payload;

    }
    public static String payloadUsers() {
        String payload="{\n" +
                "        \"name\": \"Kuldeep\",\n" +
                "        \"username\": \"BKuldeep\",\n" +
                "        \"email\": \"Kuldeep@april.biz\",\n" +
                "        \"address\": {\n" +
                "            \"street\": \"MG Road\",\n" +
                "            \"suite\": \"Apt. 556\",\n" +
                "            \"city\": \"Bangalore\",\n" +
                "            \"zipcode\": \"560001\",\n" +
                "            \"geo\": {\n" +
                "                \"lat\": \"-37.3159\",\n" +
                "                \"lng\": \"81.1496\"\n" +
                "            }\n" +
                "        },\n" +
                "        \"phone\": \"8861928111\",\n" +
                "        \"website\": \"kuldeep.org\",\n" +
                "        \"company\": {\n" +
                "            \"name\": \"EPAM\",\n" +
                "            \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
                "            \"bs\": \"harness real-time e-markets\"\n" +
                "        }\n" +
                "    }";

        return payload;
    }

    public static String payloadSwagger() {
        String payload="{\n" +
                "  \"id\": 12345,\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"dog\"\n" +
                "  },\n" +
                "  \"name\": \"snoopie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"pending\"\n" +
                "}";
        return payload;

    }

    public static String payloadEmployee(){
        String payload ="{\"name\":\"Kuldeep Rajdev\",\"salary\":\"54600\",\"age\":\"23\"}";
        return payload;
    }

    public static String payloadUpdatedEmployee(){
        String payload ="{\"name\":\"Kuldeep Rajdev\",\"salary\":\"546001\",\"age\":\"47\"}";
        return payload;
    }


}
