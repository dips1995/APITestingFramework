package APIS;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import SetupPackage.base;
import io.restassured.response.Response;

public class DeleteCustomerAPI extends base{
	
public static Response SendDeleteRequestToDeleteCustomerAPIWithValidID(Hashtable<String, String> data) {
		
		Response response = given().auth().basic(config.getProperty("sceratKey"), "")
				
				.delete(config.getProperty("customerEndPoint")+"/"+data.get("id"));
		return response;
		
	}


}
