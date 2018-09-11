package toolsQA.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toolsQA.cucumber.base.BaseClass;

public class FastnetPage extends BaseClass{
	
	public FastnetPage(){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id ="speed-value")
	private WebElement speed;
	
	@FindBy(id="show-more-details-link")
	private WebElement detailsbtn;

	public WebElement getSpeed() {
		return speed;
	}

	public WebElement getDetailsbtn() {
		return detailsbtn;
	}
	
	
}
