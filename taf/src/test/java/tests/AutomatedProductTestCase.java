package tests;


import org.testng.annotations.Test;

import pages.CartPage;

// This class have to extend TestBase Class to use the functions inside it as start the driver to connect to chrome and navigate to the specified url.
public class AutomatedProductTestCase extends TestBase {
	
	CartPage cartPageObject;
	
	
	// TestCase for Adding Automated Product in Cart.
	@Test
	public void userAddAutomatedItemsProducts() throws InterruptedException
	{
		// Creating new object from CartPage and sending the driver.
		cartPageObject = new CartPage(driver);
		
		// Writing the automated product link
		cartPageObject.writeInItemUrlTextBox("https://www.shein.com/CUCCOO-The-Everyone-Sneakers-p-1187851-cat-1913.html");
		
		// Wait for 3 seconds
		Thread.sleep(3000);
		
		// Select the item size
		cartPageObject.SelectItemSize();
		
		// click add item button.
		cartPageObject.ClickAddItemButton();
		
		Thread.sleep(5000);
		
	}
	
}
