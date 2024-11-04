package HandlingChecklist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChecklistMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\VCUBE\\Tutorials\\Jar Files or Drivers\\Drivers\\Browser Packs\\Extracted Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\VCUBE\\Tutorials\\Batch 49_50\\Batch49_50_Testing Tools_11AM-20240522T075545Z-001\\Videos\\5.1. Selenium Elements\\Selenium Elements\\Country Name.Htm");
		WebElement P = driver.findElement(By.id("CheckList"));
		
		Select S = new Select(P);
	
		S.selectByIndex(2);
		S.selectByVisibleText(" Philippines");
		S.selectByIndex(22);
		S.selectByIndex(55);
		

	}

}
