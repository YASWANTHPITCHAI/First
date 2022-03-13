package Com.selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement email = driver.findElement(By.linkText("Gmail"));
		Actions ac = new Actions(driver);
		ac.contextClick(email).perform();
		
     Robot r = new Robot();
     Thread.sleep(3000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
     
	}

		
	}

		
	

		
	


	
	
	
	
	
	
	

