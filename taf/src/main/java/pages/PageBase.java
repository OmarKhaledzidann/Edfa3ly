package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

// This class contains the main common functions we can use in our automation script.
public class PageBase {

	protected WebDriver drvier ; 
	public JavascriptExecutor jse ; 
	public Select select ; 
	public Actions action ; 

	// create constructor 
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//function to click a button. It takes button web element and click on it using click() function.
	protected static void clickButton(WebElement button) 
	{
		button.click();
	}
	
	//function to write inside a textField. It takes the specified textField and the value that will be written inside it.
	protected static void setTextElementText(WebElement textElement , String value) 
	{
		textElement.sendKeys(value);
	}
	
	//function to scrollDown the page.
	public void scrollToBottom() 
	
	{
		jse.executeScript("scrollBy(0,2500)"); 
	}
	
	public void clearText(WebElement element) 
	{
		element.clear();
	}
	
	

}
