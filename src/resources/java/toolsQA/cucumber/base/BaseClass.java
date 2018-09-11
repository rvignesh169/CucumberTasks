package toolsQA.cucumber.base;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public WebDriver getDriver(String url){
		System.setProperty("webdriver.chrome.driver","D:\\Tasks\\GreensTasks\\FrameWorkTasks\\org.sifyitest.com\\libd\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}
	
	public void type(WebElement element, String value){
		if(checkElementIsDisplayed(element)==true && checkElementIsEnabled(element)==true ){
			element.sendKeys(value);
		}
	}
	
	public void click(WebElement element){
		if(checkElementIsDisplayed(element)==true && checkElementIsEnabled(element)==true ){
			element.click();
		}
	}
	
	public String getPageTitle(){
		return driver.getTitle();
	}
	
	public String getText(WebElement element){
		return element.getText();
	}
	
	public boolean checkElementIsDisplayed(WebElement element){
		return element.isDisplayed();
	}
	
	public boolean checkElementIsEnabled(WebElement element){
		return element.isEnabled();
	}
	
	public boolean checkElementIsSelected(WebElement element){
		return element.isSelected();
	}
	
	public void clearValueOfElement(WebElement element){
		element.clear();
	}
	
	public void elementSubmit(WebElement element){
		element.submit();
	}
	
	public String getValueOfElement(WebElement element , String attvalue){
		return element.getAttribute(attvalue);
	}
	
	
	public void scrollDown(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public void scrollUp(WebElement element){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public void switchToWindow(String winid){
		driver.switchTo().window(winid);
	}

	public String getParentWindow(){
		return driver.getWindowHandle();
	}
	
	public Set<String> getAllWindows(){
		return driver.getWindowHandles();
	}
	
	public void switchToFrameByframeName(String framename){
		driver.switchTo().frame(framename);
	}
	
	public void switchToFrameByframeid(int id){
		driver.switchTo().frame(id);
	}
	
	public void switchToFrameByelement(WebElement element){
		driver.switchTo().frame(element);
	}
	
	public void switchToAlertAndAccept(){
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	public void switchToAlertAndEnterAlertTextbox(String value){
		Alert a = driver.switchTo().alert();
		a.sendKeys(value);
	}
	
	public void switchToAlertAndDismiss(){
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	public void mouseOver(WebElement element){
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void dragAndDrop(WebElement src, WebElement des){
		Actions a = new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	
	public void doubleClick(){
		Actions a = new Actions(driver);
		a.doubleClick().perform();
	}
	
	public void rightClick(){
		Actions a = new Actions(driver);
		a.contextClick().perform();;
	}
	
	public void doubleClickElement(WebElement element){
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	public void rightClickElement(WebElement element){
		Actions a = new Actions(driver);
		a.contextClick().perform();
	}
	
	public void clickandHold(){
		Actions a = new Actions(driver);
		a.clickAndHold().perform();
	}
	
	public void clickandHoldElement(WebElement element){
		Actions a = new Actions(driver);
		a.clickAndHold(element).perform();
	}
	
	public void release(){
		Actions a = new Actions(driver);
		a.release().perform();
	}
	
	public void releaseElement(WebElement element){
		Actions a = new Actions(driver);
		a.release(element).perform();
	}
	
	public void selectOptionByValue(WebElement element, String value){
		Select sel = new Select(element);
		sel.selectByValue(value);
		
	}
	
	public void selectOptionByIndex(WebElement element, int index){
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public void selectOptionByVisibleText(WebElement element, String text){
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public void deselectAllOption(WebElement element){
		Select sel = new Select(element);
		sel.deselectAll();
	}
	
	public void getOptions(WebElement element){
		Select sel = new Select(element);
		sel.getOptions();
		
	}
	
	public WebElement getFirstSelectedOptions(WebElement element){
		Select sel = new Select(element);
		WebElement fs = sel.getFirstSelectedOption();
		return fs;
	}
	
	public void deselectOptionByValue(WebElement element, String value){
		Select sel = new Select(element);
		sel.deselectByValue(value);
		
	}
	
	public void deselectOptionByIndex(WebElement element, int index){
		Select sel = new Select(element);
		sel.deselectByIndex(index);
	}
	
	public void deselectOptionByVisibleText(WebElement element, String text){
		Select sel = new Select(element);
		sel.deselectByVisibleText(text);
	}
	
	public boolean checkIsMultipleSelect(WebElement element){
		Select sel = new Select(element);
		return sel.isMultiple();
	}
	
	public void browserClose(){
		driver.quit();
	}
}
