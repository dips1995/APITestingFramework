package APIS;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import SetupPackage.base;
import io.restassured.response.Response;
import io.restassured.RestAssured.*;

public class CreateCustomerAPI extends base{
	
	
	public static Response PostRequestCreateCustomerWithValidKey(Hashtable<String, String> data) {
		
		Response response = given().auth().basic(config.getProperty("sceratKey"), "")
				.formParam("name", data.get("name"))
				.formParam("email", data.get("email"))
				// .formParam("balance", balance)
				.formParam("description", data.get("description"))
				//.formParam("phone", phone_no)
				// .formParam("address[city]", "Delhi")
				.post(config.getProperty("customerEndPoint"));
		return response;
		
	}

}
