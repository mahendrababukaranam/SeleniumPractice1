package Frames_Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_Dropdown_Verify_selected_value {
	public static void main(String[] args) {
		//Open Browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Application
		driver.get("http://127.0.0.1/orangehrm-2.5.0.2/login.php");
		
		//Get current page title
		String title = driver.getTitle();
		
		//Print current page title
		System.out.println(title);
		
		//Validating current page title
		if (title.equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title is verified");
		}
		else {
			System.out.println("Title is not verified");
		}
		
		//Identify user name field and enter user name
		driver.findElement(By.name("txtUserName")).sendKeys("selenium");
		
		//Identify password field and enter password
		driver.findElement(By.name("txtPassword")).sendKeys("selenium");
		
		//Identify button and click on button
		driver.findElement(By.name("Submit")).click();
		
		//Identify welcome page text
		String text = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]")).getText();
		
		//Print welcome page text
		System.out.println(text);
		
		//Validating welcome page text
		if(text.equals("Welcome selenium")) {
			System.out.println("Welcome text is verified");
		}
		else {
			System.out.println("Welcome text is not verified");
		}
		
		//Switch to frame
		driver.switchTo().frame(driver.findElement(By.name("rightMenu")));
		
		//Identify Dropdown and dropdown list
		WebElement dropdown = driver.findElement(By.name("loc_code"));
		List<WebElement> dropdownlist = dropdown.findElements(By.tagName("option"));
		
		//Getting dropdown list size
		System.out.println(dropdownlist.size());
		
		//Print all the dropdown list values
		for(int initial_value = 0; initial_value<dropdownlist.size(); initial_value++) {
			//System.out.println(dropdownlist);
			//System.out.println(dropdownlist.get(initial));
			//System.out.println(dropdownlist.get(initial).getText());
			System.out.println("index "+initial_value+" dropdown list value is : "+" "+dropdownlist.get(initial_value).getText());
		}
		
		//Select dropdown list
		Select select_dropdown_list = new Select(dropdown);
		//select_dropdown_list.selectByIndex(4);
		//select_dropdown_list.selectByVisibleText("Job Title");
		select_dropdown_list.selectByValue("2");
		
		//Verify Selected dropdown value
		String selected_value = select_dropdown_list.getFirstSelectedOption().getText();
		
		//Print selected value
		System.out.println(selected_value);
		
		//Verify Selected Value
		if(selected_value.equals("Emp. Last Name")) {
			System.out.println("Selected Value is Matched");
		}
		else {
			System.out.println("Selected Value is not Matched");
		}

		//Exit from the frame
		driver.switchTo().defaultContent();
		
		//Logout
		driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[3]/a")).click();
		
		//Close active window
		driver.close();
	}
}
