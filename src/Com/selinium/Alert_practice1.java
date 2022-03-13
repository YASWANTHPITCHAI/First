package Com.selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement simple= driver.findElement(By.xpath("//button[contains(text(),'button to display')]"));
		simple.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		WebElement conform = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		conform.click();
		WebElement clickalert = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		clickalert.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		WebElement prompt = driver.findElement(By.xpath("(//a[contains(text(),'Alert')])[4]"));
		prompt.click();
	WebElement si = driver.findElement(By.xpath("//button[contains(text(),' button to demonstrate')]"));
		si.click();
		driver.switchTo().alert().sendKeys("yaswanth");
		driver.switchTo().alert().accept();
	}
		
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	



