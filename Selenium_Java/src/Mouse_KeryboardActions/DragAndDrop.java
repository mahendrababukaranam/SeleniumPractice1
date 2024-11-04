package Mouse_KeryboardActions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("D:\\VCUBE\\Tutorials\\Batch 49_50\\Batch49_50_Testing Tools_11AM-20240522T075545Z-001\\Videos\\5.1. Selenium Elements\\Selenium Elements\\Drag and Drop.html");
		
		
		WebElement S = driver.findElement(By.id("drag1"));
		WebElement T = driver.findElement(By.id("draghere"));
		
		Actions A = new Actions(driver);
		
		A.dragAndDrop(S,T).perform();
		
	}

}
