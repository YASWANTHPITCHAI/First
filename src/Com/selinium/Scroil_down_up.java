package Com.selinium;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroil_down_up {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMIrIWDy8-Q9gIVr5hmAh2sUw-pEAAYASAAEgJi8fD_BwE");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	JavascriptExecutor js = (JavascriptExecutor)driver;
	Thread.sleep(3000);	
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	Thread.sleep(3000);
	js.executeScript("window.scrollTo(0,document.body.scrollTop)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(3000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
