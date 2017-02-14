package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class MergeLeadPage extends OpentapsWrappers {

	public MergeLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("Merge Leads | opentaps CRM")){
			reportStep("This is not Merge Lead Page. Look at the SnapShot", "FAIL");
		}
	}

	public FindMergeLeadsPage fromLead() {
		clickByXpath(prop.getProperty("MergeLead.FromLead.Xpath"));
		return new FindMergeLeadsPage(driver,test);

	}
	
	public FindMergeLeadsPage toLead() {
		
		clickByXpath(prop.getProperty("MergeLead.ToLead.Xpath"));
		return new FindMergeLeadsPage(driver,test);
	}
	
	public MergeLeadPage switchToMergeLead(){
		switchToParentWindow();
		return this;
	}
	
	public MergeLeadPage mergeLead() {
		clickByLink(prop.getProperty("MergeLead.Merge.Link"));
		return this;
	}
	
	public ViewLeadPage confirmMerge(){
		acceptAlert();
		return new ViewLeadPage(driver,test);
	}
}