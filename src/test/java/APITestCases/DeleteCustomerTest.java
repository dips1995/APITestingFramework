package APITestCases;

import static io.restassured.RestAssured.given;

import java.util.Hashtable;

import org.testng.Assert;
import org.testng.annotations.Test;

import APIS.DeleteCustomerAPI;
import Listners.ExtentListeners;
import SetupPackage.base;
import io.restassured.response.Response;
import io.restassured.response.Response.*;
import utilities.DataUtils;
import utilities.TestUtil;

public class DeleteCustomerTest extends base{
	
	@Test(dataProviderClass=DataUtils.class, dataProvider="Data")
	public void deleteCustomer(Hashtable<String, String> data) {
		
		Response response = DeleteCustomerAPI.SendDeleteRequestToDeleteCustomerAPIWithValidID(data);
		ExtentListeners.testReport.get().info(data.toString());
		response.prettyPrint();
		
		Assert.assertEquals(response.statusCode(), 200);
		
		boolean actual_id = TestUtil.JsonHasKey(response.asString(), "id");
		Assert.assertEquals(actual_id,data.get("id"), "id is not matched");
		
	}
	
	

}
