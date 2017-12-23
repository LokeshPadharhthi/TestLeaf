package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement eleTypeFirstName;
	public FindLeadsPage enterFirstName() {
		type(eleTypeFirstName, "Lokesh");
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleClickFindLead;
	public FindLeadsPage clickFindLeadsBtn() {
		click(eleClickFindLead);
		return this;
	}

	public FindLeadsPage saveLeadId(){
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
