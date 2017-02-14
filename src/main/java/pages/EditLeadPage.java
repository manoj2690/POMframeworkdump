package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class EditLeadPage extends OpentapsWrappers {

	public EditLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("opentaps CRM")){
			reportStep("This is not Edit Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	
	public EditLeadPage selectMarketingcampaign(String data) {
		selectVisibileTextById(prop.getProperty("EditLead.MarketingCampaign.Id"),data);
		return this;
	}
	
	public EditLeadPage clickAddcampaign() {
		clickByXpath(prop.getProperty("EditLead.MarketingCampaign.xpath"));
		return this;
	}
	
	public EditLeadPage selectSource(String data) {
		selectVisibileTextById(prop.getProperty("EditLead.DataSource.Id"),data);
		return this;
	}
	
	public EditLeadPage clickAddsource() {
		clickByXpath(prop.getProperty("EditLead.AddSource.xpath"));
		return this;
	}
	
	public ViewLeadPage clickUpdate() {
		clickByXpath(prop.getProperty("EditLead.Update.xpath"));
		return new ViewLeadPage(driver,test);
	}
	
}
