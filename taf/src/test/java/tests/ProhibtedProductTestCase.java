package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.CartPage;

//This class have to extend TestBase Class to use the functions inside it as start the driver to connect to chrome and navigate to the specified url.
public class ProhibtedProductTestCase extends TestBase {

	CartPage cartPageObject;
	
		//TestCase for Adding Prohibited Product in Cart.
		@Test 
		public void userAddProhibtedItemsProducts() throws InterruptedException 
		{
			
			// Creating new object from CartPage and sending the driver.
			cartPageObject = new CartPage(driver);
			
			// Writing the prohibited product link
			cartPageObject.writeInItemUrlTextBox("https://www.goat.com/sneakers/shane-sb-premium-light-orewood-brown-cv5500-200");
			
			//Check if the error message after adding the prohibited product link displayed or not.
			assertTrue(cartPageObject.ProhibtedErrorMessage.isDisplayed());
			
			Thread.sleep(5000);
		}
}
