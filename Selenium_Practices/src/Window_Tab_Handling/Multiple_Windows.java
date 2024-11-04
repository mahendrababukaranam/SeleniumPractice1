package Window_Tab_Handling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.kosmiktechnologies.com/seleniumLiveProject/kosmik-hms/index.php?msg=Successfully%20Logged%20out");
		driver.findElement(By.name("username")).sendKeys("kosmik");
		driver.findElement(By.name("password")).sendKeys("kosmik");
		driver.findElement(By.name("submit")).click();
		driver.findElement(By.xpath("//*[@id=\"navigation\"]/li[3]/a")).click();
		
		//Getting/Handling multiple windows
		Set<String> Total_windows = driver.getWindowHandles();
				
		//Printing the count of all windows which are opened through driver
		System.out.println(Total_windows.size());
				
		//Storing total windows in to the array list
		ArrayList<String> all_windows = new ArrayList<String>(Total_windows);
				
		//Switching to child window
		driver.switchTo().window(all_windows.get(1));
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
					
		//Switching to Main window
		driver.switchTo().window(all_windows.get(0));
		System.out.println(driver.getTitle());	
		

	}

}
