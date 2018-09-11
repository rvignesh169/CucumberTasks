package toolsQA.cucumber.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import toolsQA.cucumber.base.BaseClass;

public class NetFlixPage extends BaseClass{

	public NetFlixPage()  {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Terms of Use']")
	private WebElement tertmsofuse;
	
	@FindBy(xpath="//span[text()='Corporate Information']")
	private WebElement corporateinformation;
	
	@FindBy(xpath="//span[text()='Media Centre']")
	private WebElement mediacentre;

	@FindBy(xpath="(//li//strong)[1]")
	private WebElement use1;
	
	@FindBy(xpath="(//li//strong)[2]")
	private WebElement use2;
	
	@FindBy(xpath="(//li//strong)[3]")
	private WebElement use3;
	
	@FindBy(xpath="(//li//strong)[4]")
	private WebElement use4;
	
	@FindBy(xpath="(//li//strong)[5]")
	private WebElement use5;
	
	@FindBy(xpath="(//li//strong)[6]")
	private WebElement use6;
	
	@FindBy(xpath="(//li//strong)[7]")
	private WebElement use7;
	
	@FindBy(xpath="(//li//strong)[8]")
	private WebElement use8;
	
	public WebElement getTertmsofuse() {
		return tertmsofuse;
	}
	
	
	public WebElement getCorporateinformation() {
		return corporateinformation;
	}


	public WebElement getMediacentre() {
		return mediacentre;
	}


	public WebElement getUse1() {
		return use1;
	}

	public WebElement getUse2() {
		return use2;
	}

	public WebElement getUse3() {
		return use3;
	}

	public WebElement getUse4() {
		return use4;
	}

	public WebElement getUse5() {
		return use5;
	}

	public WebElement getUse6() {
		return use6;
	}

	public WebElement getUse7() {
		return use7;
	}

	public WebElement getUse8() {
		return use8;
	}

	
	
}
