package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeadPage extends ProjectMethods{

	public ViewLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}
	
	@FindBy(how = How.ID, using ="viewLead_firstName_sp")
	private WebElement eleVerifyFName;
	public ViewLeadPage verifyFName(String fName){
		verifyExactText(eleVerifyFName, fName);
		return this;
	}
	
	/*@FindBy(how=How.CLASS_NAME,using="decorativeSubmit")
	private WebElement eleLogOut;
	public LoginPage clickLogout() {
		click(eleLogOut);
		return new LoginPage(driver, test);
	}
*/


	}















