package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

// This class contains all the elements of the Cart Page. It extends the PageBase class to be able to use the functions.
public class CartPage extends PageBase {

	public CartPage(WebDriver driver) {
		super(driver);
		
		}
	
	//Allocate URL input text box.
	@FindBy(xpath="//*[@id=\"cart-basic-box\"]/div[2]/div[2]/div[2]/input")
	public WebElement AutomatedItemUrl;
	
	//Allocate text field of the size. 
	@FindBy(name = "size")
	public WebElement AutomatedItemSize;
	
	//Allocate AddItem Button.
	@FindBy(css= "input.containueButtom.borderRadius3.F18")
	public WebElement AddItemButton;
	
	//Allocate Error Message of Prohibited Products Links
	@FindBy(css= "label.visibility.ng-binding.ng-scope")
	public WebElement ProhibtedErrorMessage;
	
	// Write the Automated URL Product in the text box by calling function setTextElementText from PageBase Class.
	public void writeInItemUrlTextBox(String AutomatedProductUrl)
	{
		setTextElementText(AutomatedItemUrl, AutomatedProductUrl);
	}
	
	// Click on Add Item Button after writing the automated URL Product.
	public void ClickAddItemButton()
	{
		clickButton(AddItemButton);
	}
	
	
	// One of the links need the size, So we can select the first size in drop down list using this function. This function contains select object from a defined class called Select.
		public void SelectItemSize()
		{
			select = new Select(AutomatedItemSize);
			select.selectByIndex(1);
		}
	

}
