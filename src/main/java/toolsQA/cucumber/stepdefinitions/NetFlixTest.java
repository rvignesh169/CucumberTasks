package toolsQA.cucumber.stepdefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.events.AttachmentEvent.Media;
import junit.framework.Assert;
import toolsQA.cucumber.base.BaseClass;
import toolsQA.cucumber.pom.CorporateInformationPage;
import toolsQA.cucumber.pom.MediaCentrePage;
import toolsQA.cucumber.pom.NetFlixPage;

public class NetFlixTest {
	BaseClass b = new BaseClass();
	public static WebDriver driver;
	@Given("^the user is in netflix home page$")
	public void the_user_is_in_netflix_home_page() {
	      driver = b.getDriver("https://www.netflix.com/in/");
	}

	@When("^the user clicks the terms of use link$")
	public void the_user_clicks_the_terms_of_use_link() {
		NetFlixPage n = new NetFlixPage();
	    b.click(n.getTertmsofuse());
	}
	
	@Then("^the user verifies the various points in terms of use$")
	public void the_user_verifies_the_various_points_in_terms_of_use(DataTable value) {
		NetFlixPage n = new NetFlixPage();
	    Map<String, String> m = value.asMap(String.class, String.class);
	    Set<String> keySet = m.keySet();
	    for(String k :keySet){
	    	int i = Integer.parseInt(k);
	    	switch (i){
	    		case 1:
	    			Assert.assertEquals(m.get(k), n.getUse1().getText());
	    			 break; 
	    		case 2:
	    			Assert.assertEquals(m.get(k), n.getUse2().getText());
	    			 break; 
	    		case 3:
		    		Assert.assertEquals(m.get(k), n.getUse3().getText());
		    		 break; 
	    		case 4:
		    		Assert.assertEquals(m.get(k), n.getUse4().getText());
		    		 break; 
	    		case 5:
		    		Assert.assertEquals(m.get(k), n.getUse5().getText());
		    		 break; 
	    		case 6:
		    		Assert.assertEquals(m.get(k), n.getUse6().getText());
		    		 break; 
	    		case 7:
		    		Assert.assertEquals(m.get(k), n.getUse7().getText());
		    		 break; 
	    		case 8:
		    		Assert.assertEquals(m.get(k), n.getUse8().getText());
		    		 break; 
	    		default: 
	               System.out.println("invalid key combinations"); 
	                break; 
	    	}
	    }
	    b.browserClose();
	}
	
	@When("^the user clicks the Corporate Information link$")
	public void the_user_clicks_the_Corporate_Information_link() {
		NetFlixPage n = new NetFlixPage();
	    b.click(n.getCorporateinformation());
	}

	@Then("^the user verifies the first para$")
	public void the_user_verifies_the_first_para(DataTable paratxt) {
		CorporateInformationPage c = new CorporateInformationPage();
	    List<String> l = paratxt.asList(String.class);
	    Assert.assertEquals(l.get(0), c.getText(c.getPara()));
	    b.browserClose();
	}
	
	@When("^the user clicks the Media Centre link$")
	public void the_user_clicks_the_Media_Centre_link() {
		NetFlixPage n = new NetFlixPage();
	    b.click(n.getMediacentre());
	}

	@Then("^the user verifies the Press Releases and Blogs button is displayed$")
	public void the_user_verifies_the_Press_Releases_and_Blogs_button_is_displayed() {
		 MediaCentrePage m = new MediaCentrePage();
		 Assert.assertTrue(m.checkElementIsDisplayed(m.getPressreleasebtn()));
		 b.browserClose();
	}


}
