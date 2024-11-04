package Multi_Checkbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Checkbox2 {

	public static void main(String[] args) {
		//Browser
		WebDriver driver = new FirefoxDriver();
		
		//Open Application
		driver.get("https://demo.guru99.com/test/radio.html");
		
		//Identifying list of check boxes
		List<WebElement> mul_select = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		//Get the Size of the check boxes
		System.out.println(mul_select.size());
		
		//Check the check box index value one by one
		for(int index_value = 0; index_value<mul_select.size(); index_value++) {
			
			//Click on Checkbox
			mul_select.get(index_value).click();
			
			//Verifying Check box selected or not
			if(mul_select.get(index_value).isSelected()) {
				System.out.println(index_value+" index check box is selected");
			}
			else {
				System.out.println(index_value+" index check box is not selected");
			}
		}
			
				
	}
}
