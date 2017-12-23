package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	@FindBy(how = How.ID,using="createLeadForm_companyName")
	private WebElement eleComName;
	
	public CreateLeadPage enterCompanyName(String cName){
		type(eleComName, cName);
		return this;		
	
	}
	
	@FindBy(how = How.ID,using="createLeadForm_firstName")
	private WebElement eleFName;
	
	public CreateLeadPage enterFName(String fName){
		type(eleFName, fName);
		return this;		
	
	}
	
	@FindBy(how = How.ID,using="createLeadForm_lastName")
	private WebElement eleLName;
	
	public CreateLeadPage enterLName(String lName){
		type(eleLName, lName);
		return this;		
	
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleClickSub;
	public ViewLeadPage submitLeads() {
		click(eleClickSub);
		return new ViewLeadPage(driver, test);
		
	
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
