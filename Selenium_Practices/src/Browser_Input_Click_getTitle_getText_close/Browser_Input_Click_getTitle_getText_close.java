package Browser_Input_Click_getTitle_getText_close;

import org.openqa.selenium.By;
//Package: It contains some specific classes to use their functions/methods in the test script.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser_Input_Click_getTitle_getText_close {

	public static void main(String[] args) {
	/*
	 * WebDriver: WebDriver is an interface in between automation script and test application.
	 * driver: driver is a instance of WebDriver
	 */
		
		// Open the FireFox browser
		WebDriver driver = new FirefoxDriver();
		
		//Navigate the application URL
		//get method is used to navigate the application URL in the current browser window. 
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//******************Verify title of the WebPage******************
		//******************Operation Code*******************************
		
		//Get the Title of the WebPage
		String title = driver.getTitle();
		
		//Print the title of the WebPage
		System.out.println(title); // OrangeHRM - New Level of HR Management
		
		//********************Verification Code***************************
		
		//Verify Title of the WebPage using conditional statement
		// Here equals method/function is used to compare two strings(Actual string and Expected string)
		if(title.equals("OrengeHRM - New Level of HR Management")) {
			System.out.println("WebPage title is Verified");
		}
		else {
			System.out.println("WebPage title is not Verified");
		}
		
		// Identify the user name and enter the user name
		//Here findElement is used to get the web elements by using locators
		//sendKeys method/function is used to enter values into the input/text field.
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		//Identify the password and enter the password
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		
		// Click on Login Button--Here Login is a button
		//Click method is used to perform clicking action on buttons/links.
		driver.findElement(By.name("Submit")).click();
		
		// *********************Verify Welcome Page (Welcome Text with dynamic name)********************
		// operation code
		// Identify and get the Welcome selenium Text
		//Here getText method is used to get the text in the WebPage.
		String welcometext = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		
		//Print the Welcome Text of the WebPage
		System.out.println(welcometext); // Welcome selenium
		
		//*****************Verification Code******************
		// Verify welcome page welcome text
		if(welcometext.equals("Welcome selenium")) {
			System.out.println("Welcome text is verified");
		}
		else {
			System.out.println("Welcome text is not verified");
		}
		
		// Click on Logout Button--Here Logout is a link.
		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		
		//Close the active window/tab from the browser
		//close method is used to close the active window/tab from the browser
		driver.close();
		
	}

}
