package toolsQA.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toolsQA.cucumber.base.BaseClass;

public class MediaCentrePage extends BaseClass{
	public MediaCentrePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='Press Releases and Blogs']")
	private WebElement pressreleasebtn;

	public WebElement getPressreleasebtn() {
		return pressreleasebtn;
	}
	
}
