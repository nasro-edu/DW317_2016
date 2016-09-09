/**
 * 
 */
package dw317.lib;
import static java.lang.System.out;
/**
 * @author your name
 *
 */
public class AddressTest {

	public static void main(String[] args) {
		testTheThreeParameterConstructor();
	}

	public static void testTheThreeParameterConstructor() {
		out.println("\nTesting the three parameter constructor.");
		//**  test 1
		testTheThreeParameterConstructor(
			"Case 1 - Valid data (3040 Sherbrooke Westmount)", "3040",
				"Sherbrooke", "Westmount", true);
		//**  test 2 - empty civicNumber
		testTheThreeParameterConstructor(
				"Case 2 - Invalid data – empty civicNumber ( Sherbrooke Westmount)","",
					"Sherbrooke","Westmount", false);
		//**  test 3 - civicNumber with 5 empty spaces
		testTheThreeParameterConstructor(
				"Case 3 - Invalid data – civicNumber  spaces ( Sherbrooke Westmount)","     ",
					"Sherbrooke","Westmount", false);

		//**  test 4 - empty street name 
		testTheThreeParameterConstructor(
				"Case 4 - Invalid data – empty streetName  ( 123456  Westmount)"," 1 2 345",
					"","Westmount", false);
		//**  test 8 - null civicNumber
		testTheThreeParameterConstructor(
				"Case 8 - Invalid data – null civicNumber (null Sherbrooke Westmount)",
						null,"Sherbrooke","Westmount",false);
		//Step 4. testing getCivicNumber
		testGetCivicNumber();
		//Step 5. testing setCivicNumber
		testSetCivicNumber();
		//step 6. empty constructor
		Address addressRef = new Address();
		out.println(" ===="+addressRef.getCivicNumber().length());
	
	//testing Name
		Name aName = new Name ("peter", "Hanson");
		out.println("fll name = "+aName);
		out.println("test name = ");
		
	}
/*--------------------------------------------------------------------------*/
	private static void testTheThreeParameterConstructor(String testCase,
			String civicNumber, String streetName, String city,
			boolean expectValid) {

		out.println("   " + testCase);

		try{Address theAddress = new Address(civicNumber, streetName, city);
		out.print("\tThe Address instance was created: " + theAddress);
		
		if (!expectValid)
			out.print("  Error! Expected Invalid shoudl have been true. ==== FAILED TEST ====");
		}
		catch(IllegalArgumentException iae)
		{
			out.println(iae.getMessage());
			if(expectValid) out.println(" ERROR in specifying expected Valid (should have been false)=== FAILED TEST =====");
		}
		catch (Exception e)
		{ out.println("unexcpected exception type ...."+ e.getClass() +" - "+e.getMessage());
		if(expectValid) out.println(" ERROR in specifying expected Valid (should have been false)=== FAILED TEST =====");
			
		}
		out.println("\n");
	}
//--------------------------------------------//
	public static void testGetCivicNumber()
	{
		out.println("\nTesting the getCivicNumber method.");
		testGetCivicNumber("Case 1: 3040 without leading/trailing spaces",
				"3040","3040");
		testGetCivicNumber("Case 2: 3040 with leading/trailing spaces",
				"    3040    ","3040");
	}
	
	private static void testGetCivicNumber(String testCase, 
			String civicNumber, String expectedCivicNumber)
	{
		out.println("   " + testCase);
		Address theAddress = 
				new Address (civicNumber, "Sherbrooke","Westmount");
		out.print("\tThe Address instance was created: " + theAddress);

		if (!theAddress.getCivicNumber().equals(expectedCivicNumber))
			out.print("  Error! Expected Invalid. ==== FAILED TEST ====");

		out.println("\n");
	}

//----------------------------------------/
	public static void testSetCivicNumber() {
		out.println("\nTesting the setCivicNumber method.");
		testSetCivicNumber("Case 1: Valid - 2086 without leading/trailing spaces",
				"2086","2086",true);
		testSetCivicNumber("Case 2: Invalid null civic number",
				null,"",false);
	}
	
	private static void testSetCivicNumber(String testCase, 
			String civicNumber, String expectedCivicNumber,boolean expectValid){
		out.println("   " + testCase);
		Address theAddress = 
				new Address ("3040", "Sherbrooke","Westmount");
		try {
			theAddress.setCivicNumber(civicNumber);
			out.print("\tThe Address instance was created: " + theAddress);
			
			if (!theAddress.getCivicNumber().equals(expectedCivicNumber))
				out.print("  Error! Expected Invalid. ==== FAILED TEST ====");
		}
		catch (IllegalArgumentException iae) {
			out.print("\t"+ iae.getMessage());
			if (expectValid)
				out.print("  Error! Expected Valid. ==== FAILED TEST ====");
		}
		catch (Exception e) {
			out.print("\tUNEXPECTED EXCEPTION TYPE! " + e.getClass() + " " +
					e.getMessage() + " ==== FAILED TEST ====");
			if (expectValid)
				out.print(" Expected Valid.");
		}

		out.println("\n");
	}


}
