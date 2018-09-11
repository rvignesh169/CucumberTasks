package toolsQA.cucumber.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import toolsQA.cucumber.base.BaseClass;
import toolsQA.cucumber.pom.FastnetPage;

public class NetSpeedStepdefinition {
	BaseClass b = new BaseClass();
	public static WebDriver driver;
	@Given("^The user is in  fast\\.com$")
	public void the_user_is_in_fast_com() {
	   driver = b.getDriver("https://fast.com/");
	}

	@When("^the user waits to see the network speed$")
	public void the_user_waits_to_see_the_network_speed() {
		FastnetPage f = new FastnetPage();
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(f.getDetailsbtn()));
	}

	@Then("^the user validates the actual network speed with expected \"([^\"]*)\"$")
	public void the_user_validates_the_actual_network_speed_with_expected(String speed) {
		FastnetPage f = new FastnetPage();
		String netspeed = f.getSpeed().getText();
		int actspeed = Integer.parseInt(netspeed);
		int	expspeed = Integer.parseInt(speed);
	    Assert.assertTrue(actspeed >= expspeed);
	    b.browserClose();
	}
}
