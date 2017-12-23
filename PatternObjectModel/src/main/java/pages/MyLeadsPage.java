package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleClickCreLead;
	public CreateLeadPage createLeads() {
		click(eleClickCreLead);
		return new CreateLeadPage(driver, test);
		
	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Lead")
	private WebElement eleClickFindLead;
	public FindLeadsPage findLeads() {
		click(eleClickFindLead);
		return new FindLeadsPage(driver, test);
		
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
