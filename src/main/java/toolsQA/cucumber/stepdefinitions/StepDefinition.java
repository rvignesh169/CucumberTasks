package toolsQA.cucumber.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import toolsQA.cucumber.base.BaseClass;
import toolsQA.cucumber.pom.RegisterPage;

public class StepDefinition {
	BaseClass b = new BaseClass();
	public static WebDriver driver;
	@Given("^The User is in Registration Page$")
	public void the_User_is_in_Registration_Page() {
		 driver = b.getDriver("http://demoqa.com/registration/");
	}

	@When("^The User is entering the firstname and lastname$")
	public void the_User_is_entering_the_firstname_and_lastname(DataTable name) {
		RegisterPage r= new RegisterPage();
		List<String> l = name.asList(String.class);
	   b.type(r.getFname(), l.get(0));
	   b.type(r.getLname(), l.get(1));
	}

	@Then("^The User is verifying the entered values in firstname and lastname$")
	public void the_User_is_verifying_the_entered_values_in_firstname_and_lastname() {
		RegisterPage r= new RegisterPage();
		Assert.assertEquals(r.getFname().getAttribute("value"), "firstname");
	    Assert.assertEquals(r.getLname().getAttribute("value"), "lastname");
	   b.browserClose();
	}

	@When("^The user selects the marital status \"([^\"]*)\"$")
	public void the_user_selects_the_marital_status(String value) {
		RegisterPage r= new RegisterPage();
		System.out.println(value);
		if(value.equals("single")){
			System.out.println(value);
			b.click(r.getSingle());
		}else if(value.equals("married")){
			b.click(r.getMarried());
		}else if(value.equals("divorced")){
			b.click(r.getDivorced());
		}else{
			System.out.println("invalid Marital Status");
		}
	}

	@Then("^The user verifies the selected value \"([^\"]*)\"$")
	public void the_user_verifies_the_selected_value(String value) {
		RegisterPage r= new RegisterPage();
		System.out.println(value);
		if(value.equals("single")){
			Assert.assertTrue(r.getSingle().isSelected());
		}else if(value.equals("married")){
			Assert.assertTrue(r.getMarried().isSelected());
		}else if(value.equals("divorced")){
			Assert.assertTrue(r.getDivorced().isSelected());
		}else{
			System.out.println("invalid Marital Status");
		}
		 b.browserClose();
	}

	@When("^The user selects the Hobby  \"([^\"]*)\"$")
	public void the_user_selects_the_Hobby(String value) {
		RegisterPage r= new RegisterPage();
		System.out.println(value);
		if(value.equals("dance")){
			b.click(r.getDance());
		}else if(value.equals("reading")){
			b.click(r.getReading());
		}else if(value.equals("cricket")){
			b.click(r.getCricket());
		}else{
			System.out.println("invalid Hobby");
		}
	}

	@Then("^The user verifies the selected value in hobby \"([^\"]*)\"$")
	public void the_user_verifies_the_selected_value_in_hobby(String value) {
		RegisterPage r= new RegisterPage();
		System.out.println(value);
		if(value.equals("dance")){
			Assert.assertTrue(r.getDance().isSelected());
		}else if(value.equals("reading")){
			Assert.assertTrue(r.getReading().isSelected());
		}else if(value.equals("cricket")){
			Assert.assertTrue(r.getCricket().isSelected());
		}else{
			System.out.println("invalid Hobby");
		}
		 b.browserClose();
	}

	@When("^The User is entering the phoneno username and email$")
	public void the_User_is_entering_the_phoneno_username_and_email(DataTable name) {
		RegisterPage r= new RegisterPage();
		List<String> l = name.asList(String.class);
	   b.type(r.getPhone(), l.get(0));
	   b.type(r.getUsername(), l.get(1));
	   b.type(r.getEmail(), l.get(2));
	}

	@Then("^The User is verifying the entered values in phoneno password and email$")
	public void the_User_is_verifying_the_entered_values_in_phoneno_password_and_email() {
		RegisterPage r= new RegisterPage();
		Assert.assertEquals(r.getPhone().getAttribute("value"), "9999954265");
	    Assert.assertEquals(r.getUsername().getAttribute("value"), "password");
	    Assert.assertEquals(r.getEmail().getAttribute("value"), "a@aol.in");
	    b.browserClose();
	}

}
