package Com.selinium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions as = new Actions(driver);
		as.moveToElement(women).perform();
	
		WebElement tshirt = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a"));
		tshirt.click();
		
		WebElement findElement = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		findElement.click();
		driver.switchTo().frame(0);
		
		WebElement findElement2 = driver.findElement(By.name("Submit"));
		findElement2.click();	
		
		driver.switchTo().defaultContent();
		WebElement findElement3 = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		findElement3.click();
		
		Thread.sleep(3000);
		WebElement findElement4 = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		findElement4.click();
		
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yaswanth1234@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yas123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='bankwire']")).click();
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		
	}
	
	
	
	
	
	
}
