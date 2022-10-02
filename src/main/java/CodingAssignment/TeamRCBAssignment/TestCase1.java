package CodingAssignment.TeamRCBAssignment;

import org.testng.annotations.Test;
/**
 * @description - This class validates the team has 4 foreign players
 * @author - Zainab Firdos
 *
 */
public class TestCase1 extends BaseClass{

	@Test(dataProvider = "dataProvider")
	public void test1(String data) {
		
		  if(data.contains("South Africa")||data.contains("Australia")||data.contains("Srilanka")) { 
			  System.out.println("The foreign Player::"+data);
		  }
	}
}
