package Model_Popup_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Modal_Popup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://mdbootstrap.com/docs/standard/components/modal/#docsTabsOverview");
		
		Thread.sleep(4000);
		//Click on accept cookies button
		driver.findElement(By.id("accept_cookies_btn")).click();
		
		//Click on login to get model popup
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"gtmDC-login-button\"]/a[2]")).click();
		
		//Switch to window
		WebDriver modal = driver.switchTo().window(driver.getWindowHandle());
		Thread.sleep(3000);
		modal.close();
		
		
	}

}
