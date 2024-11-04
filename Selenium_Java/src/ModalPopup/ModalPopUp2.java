package ModalPopup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ModalPopUp2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/tryit.asp?filename=tryhow_css_modal");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"myBtn\"]")).click();
		driver.switchTo().activeElement();
		Thread.sleep(2000);
		driver.findElement(By.className("close")).click();
		
	}

}
