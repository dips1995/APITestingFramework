package utilities;

import org.json.JSONObject;

import Listners.ExtentListeners;

public class TestUtil {
	
	public static boolean JsonHasKey(String json, String key) {
		
		JSONObject jsonObject = new JSONObject(json);
		ExtentListeners.testReport.get().info("Validating presence of Key " + key);
		return jsonObject.has(key);
		
	}
	
public static String getJsonHasKey(String json, String key) {
		
		JSONObject jsonObject = new JSONObject(json);
		ExtentListeners.testReport.get().info("Validating presence of valus of key  " + key);
		return jsonObject.get(key).toString();
		
	}
}
