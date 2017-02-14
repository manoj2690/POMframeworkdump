package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.OpentapsWrappers;

public class ViewLeadPage extends OpentapsWrappers {

	public ViewLeadPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		if(!verifyTitle("View Lead | opentaps CRM")){
			reportStep("This is not View Lead Page. Look at the SnapShot", "FAIL");
		}
	}
	    public EditLeadPage editLead() //Edit Lead page name should be updated
	    {
		    clickByLink(prop.getProperty("ViewLeadPage.Edit.Link"));
		    return new EditLeadPage(driver,test);	
	    }
		public MyLeadsPage deleteLead()
		{
			clickByLink(prop.getProperty("ViewLeadPage.Delete.Link"));
			return new MyLeadsPage(driver,test);
		}
		public String getFirstname()
		{
			String firstName=getTextById(prop.getProperty("ViewLeadPage.FirstName.Id"));
			return firstName; //This method will return the value of firstname
		}
		public String getSource()
		{
			String source=getTextById(prop.getProperty("ViewLeadPage.Source.Id"));
			return source; //Value of source will be returned
		}
		public String getMarketingCampaigns()
		{
		   String MarketingCampaigns= getTextById(prop.getProperty("ViewLeadPage.MarketingCampaigns.Id"));
			return MarketingCampaigns;
		}
	}


	


	
























