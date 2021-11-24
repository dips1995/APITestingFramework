package APITestCases;

import org.testng.annotations.Test;

import APIS.CreateCustomerAPI;

import org.testng.AssertJUnit;
import static io.restassured.RestAssured.*;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import SetupPackage.base;
import io.restassured.response.Response;
import utilities.DataUtils;

public class CreateCustomerPostReqTest extends base {

	@Test(dataProviderClass = DataUtils.class , dataProvider = "Data")
	public void validateCreateCustomerAPIWithValidSecretKey(Hashtable<String, String> data) {
		System.out.println("Test,,,,,,,,,,");
		Response responsePost = CreateCustomerAPI.PostRequestCreateCustomerWithValidKey(data);
		responsePost.prettyPrint();

		Assert.assertEquals(responsePost.statusCode(), 200);
	}

	//@Test
	/*
	 * public void customercreationwithInvalidkey() {
	 * 
	 * Response response = given().auth().basic(config.getProperty("sceratKey"), "")
	 * .formParams("email", "tailord48@gmail.com") .formParam("description",
	 * "First Customer creation by post api") .post("CustomerEndPoint");
	 * 
	 * response.prettyPrint(); Assert.assertEquals(response.statusCode(), 403);
	 * 
	 * }
	 */

	

}
