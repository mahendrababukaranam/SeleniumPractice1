package Multi_Selected_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Select_List {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://apps.fas.usda.gov/esrquery/esrq.aspx");
		
		//Identify 
		WebElement list_identification = driver.findElement(By.id("ctl00_MainContent_lbCountry"));

		//Select multiple values
		Select multi_select = new Select(list_identification);
		multi_select.selectByValue("10:7210");
		multi_select.selectByValue("11:3570");
		
		//Verify Multiple Selection Allowed or not
		if(multi_select.isMultiple()) {
			System.out.println("Multiple Seletion Allowed");
		}
		else {
			System.out.println("Multiple Seletion not Allowed");
		}
	}

}
