package Com.selinium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blowser_lounch {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement simple = driver.findElement(By.xpath("//button[contains(text(),'button ')]"));
		simple.click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		
		
	}
	
	
}
