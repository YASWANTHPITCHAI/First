package Com.selinium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement mobile2 = driver.findElement(By.linkText("Mobiles"));
		Actions as = new Actions(driver);
		as.contextClick(mobile2).perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);

		WebElement todaydeals1 = driver.findElement(By.linkText("Today's Deals"));
		Actions as1 = new Actions(driver);
		as1.contextClick(todaydeals1).perform();

		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> s = new ArrayList<>(windowHandles);
		String title = driver.switchTo().window(s.get(0)).getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		String title1 = driver.switchTo().window(s.get(1)).getTitle();
		System.out.println(title1);
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iphone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
		
		Thread.sleep(3000);
		String title3 = driver.switchTo().window(s.get(2)).getTitle();
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("samsung mobile");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.close();
		
		System.out.println(title3);
		Thread.sleep(3000);
		driver.quit();
	}
}






