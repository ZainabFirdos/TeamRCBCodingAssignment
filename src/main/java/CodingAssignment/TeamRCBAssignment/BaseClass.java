package CodingAssignment.TeamRCBAssignment;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

/**
 * @description - This is the base class with has dataprovider - to handle Json file
 * @author - Zainab Firdos
 *
 */
public class BaseClass 
{
	@DataProvider(name = "dataProvider")
	public String[] readJson() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonFile\\TeamRCB.json");
		Object obj = jsonParser.parse(reader);

		JSONObject team = (JSONObject) obj;
		JSONArray playersRole = (JSONArray) team.get("player");

		String arr[] = new String[playersRole.size()];
		for (int i = 0; i < playersRole.size(); i++) {
			JSONObject roles1 = (JSONObject) playersRole.get(i);
			String name1 = (String) roles1.get("name");
			String country = (String) roles1.get("country");
			String role = (String) roles1.get("role");
			String price = (String) roles1.get("price-in-crores");

			arr[i] = name1 + "," + country + "," + role + "," + price;
			
		}
		return arr;
	}
}
