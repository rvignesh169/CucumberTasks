package toolsQA.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toolsQA.cucumber.base.BaseClass;

public class CorporateInformationPage extends BaseClass{
	
	public CorporateInformationPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//p)[1]")
	private WebElement para;

	public WebElement getPara() {
		return para;
	}
	
	

}
