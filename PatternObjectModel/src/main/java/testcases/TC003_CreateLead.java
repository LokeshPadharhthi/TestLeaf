package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLead";
		testDescription = "To Create Lead";
		category= "Smoke";
		authors	="Lokesh";
		browserName ="chrome";
	}
	
	@Test(dataProvider="fetchData")
	public void logInLogOut(String userName, String passWord, String cName, String fName, String lName) {
		
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.createLeads()
		.enterCompanyName(cName)
		.enterFName(fName)
		.enterLName(lName)
		.submitLeads();
		//.verifyFName(fName);
		//.clickLogout();
		
		
		
		
		
		
		
	}

}
