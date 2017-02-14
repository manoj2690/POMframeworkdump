package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class FindMergeLeadsPage extends OpentapsWrappers {

	public FindMergeLeadsPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("Opentaps Open Source ERP + CRM"))
			reportStep("This is not Login Page", "FAIL");
	}

	public FindMergeLeadsPage MergeLeadFname(String data) {
		enterByName(prop.getProperty("FindMergeLead.FirstName.Name"), data);
		return this;
	}

	public FindMergeLeadsPage clickFindLeads() {
		clickByLink(prop.getProperty("FindMergeLead.FindLeads.Link"));
		return this;
	}

	public MergeLeadPage clickFirstResultingLead() {
		clickByXpath(prop.getProperty("FindMergeLead.FindLeads.Xpath"));
		return new MergeLeadPage(driver, test);
	}

}
