package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindLeadPage extends OpentapsWrappers{

	public FindLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not Create Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	
	//FirstName
	public FindLeadPage enterFirstName(String data){
		enterByName(prop.getProperty("FindLead.LeadID.Name"), data);
		return this;
	}
	
	//FindLeads
	public FindLeadPage clickByFindLeads(){
		clickByXpath(prop.getProperty("FindLead.FindLeads.Xpath"));
		return this;
	}
	
	//PhoneTab
	public FindLeadPage clickByPhoneTab(){
		clickByXpath(prop.getProperty("FindLead.PhoneTab.Xpath"));
		return this;
	}
	//PhoneNumber
	public FindLeadPage enterByPhoneNumber(String data){
		enterByName(prop.getProperty("FindLead.PhoneNumber.Name"), data);
		return this;
		}
	//FirstResultingLead
	public ViewLeadPage clickByFirstResultLead(){
		clickByXpath(prop.getProperty("FindLead.FirstResultingLead.Xpath"));
		return new ViewLeadPage(driver,test);
	}
	
	//No Records
	
	
}
