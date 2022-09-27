package com.example.testmethods.tests;


import com.example.testmethods.models.Department;
import com.example.testmethods.models.Users;
import com.google.gson.*;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.json.ParseException;
import org.springframework.boot.configurationprocessor.json.JSONException;

@Slf4j
public class Json {

//    Object json = new Object();
//
    Users user = new Users("fghh", "Lokesh");
//
//    Gson gson = new GsonBuilder()
//            .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
//            .setPrettyPrinting().create();
//
//
//         System.out.println(gson.toJson(user));

//    GsonBuilder gsonBuilder = new GsonBuilder();
//    gsonBuilder.setDateFormat("MM-dd-yyyy HH:mm"); // setting custom date format
//    Gson gson = gsonBuilder.create();
//    String jsonString = gson.toJson(product);


//    Gson gson = new GsonBuilder()
//            .setPrettyPrinting()
//            .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
//            .create();
//
//    String jsonString = gson.toJson(user);
//
//    private static final String TAG = "Json";
//
//    (jsonString);

    public static void main(final String[] args) throws JSONException, ParseException {

        String response = """
      {  
        "department": {
          "id": 2,
          "name": "IT",
          "active": true
        }
      }""";
        String response2 = """
      {
      "statusCode": "TGEN0002", 
      "statusDescription": "User is not enabled or does not exist." 
      }""";

        String eol = "\"{<EOL><EOL>\"statusCode\": \"TGEN0002\", <EOL><EOL>\"statusDescription\": \"User is not enabled or does not exist.\" <EOL><EOL>}<EOL><EOL>\"";
        String noEol = eol.replace("<EOL><EOL>","");

        System.out.println(response);
        System.out.println("Replaced string ===>"+ noEol);


        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.IDENTITY)
                .create();

        JsonObject json = gson.fromJson(response,JsonObject.class);
        log.info("My json object {}",json);
        Department department = gson.fromJson(json.get("department"),Department.class);


        JsonObject jsonObj = (JsonObject) json.get("department");
        String name = String.valueOf(jsonObj.getAsJsonObject().get("name").getAsString());


//        Object obj= JsonParser.parseString(noEol);
//creating an object of JSONObject class and casting the object into JSONObject type
//        JSONObject jsonObject = (JSONObject) obj;
//        JSONObject jsonObj1 = new JSONObject(noEol);

//        JSONParser parser= new JSONParser(noEol);
//        Gson wewe = new Gson();
//        wewe.fromJson(noEol, JsonObject.class);

//        JsonObject asJsonObject = JsonParser.parseString(noEol).getAsJsonObject();
//        Gson gson2 = new GsonBuilder()
//                .setLenient()
//                .create();
//
//         JsonObject jsonResponse = response;
////        JsonObject json2 = gson.fromJson(noEol,JsonObject.class);

//        JsonElement jsonJavaRootObject =gson2.fromJson(noEol, JsonElement.class);
//        System.out.println(jsonJavaRootObject.get("statusCode"));
//        JsonParser jsonParser = new JsonParser();
//        String code = String.valueOf(jsonParser.parse(eol.replace("<EOL><EOL>","")).getAsJsonObject().get("statusCode"));
//        JsonObject res = jsonParser.parse(noEol).getAsJsonObject().get();

//        Gson gson1 = new Gson();
//        gson1.fromJson( jsonJavaRootObject,JsonObject.class);

        JsonObject json2= gson.fromJson(response2,JsonObject.class);

        System.out.println(" Haaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaa =====>"+json2.getAsJsonObject().get("statusCode"));

//        JSONObject jsonResponse = (JSONObject) parser.parseObject().get(parser);

//        System.out.println(" Haaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaa =====>"+jsonResponse);

        System.out.println(" Jsoooooooooooooooon =====>"+name);

//        Gson jj = new Gson();
//        JsonObject json1 = gson.fromJson(noEol,JsonObject.class);

//        log.info("Jsoooooooooon object {}",json1);

//        response.getJSONObject("department");


//        JSONObject businessesJson = response1.getJSONObject("department");
//        String sampleResponse = gson.toJson(businessesJson);
//        Gson json = new Gson();

        System.out.println("================="+department.getName());
    }
}
