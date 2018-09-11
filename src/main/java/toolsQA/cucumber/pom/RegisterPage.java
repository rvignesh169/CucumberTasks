package toolsQA.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toolsQA.cucumber.base.BaseClass;

public class RegisterPage extends BaseClass {
	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="name_3_firstname")
	private WebElement fname;
	
	@FindBy(id="name_3_lastname")
	private WebElement lname;
	
	@FindBy(xpath="//input[@value='single']")
	private WebElement single;
	@FindBy(xpath="//input[@value='married']")
	private WebElement married;
	@FindBy(xpath="//input[@value='divorced']")
	private WebElement divorced;
	
	@FindBy(xpath="//input[@value='dance']")
	private WebElement dance;
	@FindBy(xpath="//input[@value='reading']")
	private WebElement reading;
	@FindBy(xpath="//input[@value='cricket ']")
	private WebElement cricket ;
	
	@FindBy(id="phone_9")
	private WebElement phone;
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="email_1")
	private WebElement email;
	
	
	public WebElement getDance() {
		return dance;
	}
	public WebElement getReading() {
		return reading;
	}
	public WebElement getCricket() {
		return cricket;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getUsername() {
		return username;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getFname() {
		return fname;
	}
	public WebElement getLname() {
		return lname;
	}
	public WebElement getSingle() {
		return single;
	}
	public WebElement getMarried() {
		return married;
	}
	public WebElement getDivorced() {
		return divorced;
	}
	
	
}
