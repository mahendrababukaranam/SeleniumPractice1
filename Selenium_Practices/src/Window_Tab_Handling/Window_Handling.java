package Window_Tab_Handling;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		
		//Getting/Handling multiple windows
		Set<String> Total_windows = driver.getWindowHandles();
		
		//Printing the count of all windows which are opened through driver
		System.out.println(Total_windows.size());
		
		//Storing total windows in to the array list
		ArrayList<String> all_windows = new ArrayList<String>(Total_windows);
		
		//Switching to child window
		driver.switchTo().window(all_windows.get(1));
		
		System.out.println(driver.getTitle());
		
		
		//Switching to Main window
		driver.switchTo().window(all_windows.get(0));
		System.out.println(driver.getTitle());	
	}

}
