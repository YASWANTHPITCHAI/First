package Com.selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Practice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement confirm = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		Thread.sleep(4000);
		
		WebElement confirm1 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		confirm1.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		WebElement prompt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		Thread.sleep(3000);
		
		WebElement prompttwo= driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		prompttwo.click();
		Thread.sleep(4000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("yaswanth");
		alert.accept();
		
	}

}
