# Overview

Edfa3ly shopping cart is a way to submit an order, by adding product's URL which has been gotten from any store like Amazon, eBay, etc… to the cart then check out the cart.

***There are 3 different types of URL covered in Edfa3ly Shopping Cart.***
1. Automated Products Links.
2. Non-Automated Products Links.
3. Prohibted Products Links.


This scenario contains repeated steps to test the fucntionality of **Edfa3ly Shopping Cart**.

So, I wrote an automated testcases which covers **Automated and Prohibted Product Links** using **Selenium Webdriver using Java Programming Language**.

# Why Automated Tests?

Automated tests can be written once and then run many times, for example every day, or, every time we change our code.

Refactoring, optimising and parallelising code without automated tests can be done, but it is like climbing without a rope, only for the brave and skilled!

# IDE and Tools used.

- **Eclipse**.
- **Maven** for configuring the project configuration and dependencies.
- **Selenuim Web driver** to write the automation script and automate the browser.
- **Chrome Driver** **version 85** it's differs based on chrome version, to connect and execute the code on Chrome.
- **TestNg** to run the code.

# Design Pattern used.
Page Object Model.**POM**

# Why Page Object Model?

- To make script maintenance easy.
- When changing some locators we don't need to go over the whole source code to adjust locators. Only go to the specified page object model which holds the required locator and edit inside it.


# Structure of the code
**1. Pages** package.
- *PageBase Class*, This class contains all the main common functions we can use in our automation script *Click button, Scroll down, write in text box*.

- *CartPage*, This class allocates all the elements of the Cart Page *URL TextBox, Error Message of Prohibited products, AddItem Button, Size Dropdown menu*. It extends the PageBase class to be able to use the functions.

**2. tests** package. **This Package contains test cases of Automated and Prohibited Product links**
- *TestBase Class*, This class contains the configuration of test *driver of chrome, starting driver and navigate to **Edfa3ly Shopping Cart website**, stop driver and quit the page, taking screenshots in failure case and put it in screenshots folder found in project hirerachy*.

- *AutomatedProductTestCase Class*, This class contains the test case of **Adding Automated product links scenario**. It extends the *TestBase Class*.
- *ProhibitedProductTestCase Class*, This class contains the test case of **Adding Prohibited product links scenario**. It extends the *TestBase Class*.

# How To Run The Code.

1. To run the scenario of *Adding Automated product links*, go to *AutomatedProductTestCase Class*
  - Right Click and Run as **TestNg**, It will open the Chrome browser and start simulating the scenario.
  
2. To run the scenario of *Adding Prohibited product links* go to *ProhibitedProductTestCase Class*
  - Right Click and Run as **TestNg**, It will open the Chrome browser and start simulating the scenario.
