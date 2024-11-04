package RobotPack;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HTAccessWithRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		
		//Robot Class
		Robot R = new Robot();
		//Username
        R.keyPress(KeyEvent.VK_A);
        R.keyPress(KeyEvent.VK_D);
        R.keyPress(KeyEvent.VK_M);
        R.keyPress(KeyEvent.VK_I);
        R.keyPress(KeyEvent.VK_N);
        R.keyRelease(KeyEvent.VK_A);
        R.keyRelease(KeyEvent.VK_D);
        R.keyRelease(KeyEvent.VK_M);
        R.keyRelease(KeyEvent.VK_I);
        R.keyRelease(KeyEvent.VK_N);

        Thread.sleep(2000);
        
        //Tab
        R.keyPress(KeyEvent.VK_TAB);
        R.keyRelease(KeyEvent.VK_TAB);
        
        Thread.sleep(2000);

        //Password
        R.keyPress(KeyEvent.VK_A);
        R.keyPress(KeyEvent.VK_D);
        R.keyPress(KeyEvent.VK_M);
        R.keyPress(KeyEvent.VK_I);
        R.keyPress(KeyEvent.VK_N);
        R.keyRelease(KeyEvent.VK_A);
        R.keyRelease(KeyEvent.VK_D);
        R.keyRelease(KeyEvent.VK_M);
        R.keyRelease(KeyEvent.VK_I);
        R.keyRelease(KeyEvent.VK_N);
        
        Thread.sleep(2000);

        //Enter (	Optional)
        R.keyPress(KeyEvent.VK_TAB);
        R.keyRelease(KeyEvent.VK_TAB);
        
        Thread.sleep(2000);
        
        R.keyPress(KeyEvent.VK_ENTER);
        R.keyRelease(KeyEvent.VK_ENTER);




	}

}
