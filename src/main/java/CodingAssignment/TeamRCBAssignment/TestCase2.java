package CodingAssignment.TeamRCBAssignment;

import org.testng.annotations.Test;
/**
 * @description - This class validates the team has Alteast one Wicket Keeper
 * @author - Zainab Firdos
 *
 */
public class TestCase2 extends BaseClass{

	@Test(dataProvider = "dataProviderdp")
	public void test2(String data) {

		if (data.contains("Wicket-keeper")) {
			System.out.println("Wicket-keeper is::" + data);
		}

	}

	
}
