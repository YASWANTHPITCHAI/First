package Com.selinium;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;



public class Base_Class {

	private static final TakesScreenshot Takesscreenshot = null;
	public static WebDriver driver;

	public static void setup1 (String browser) {
	
		if(browser.equalsIgnoreCase(browser)) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else {
				System.out.println("Invalid browser");
		}
		
	}		
		
		public static void Urlget(String Url) {
			driver.get(Url);
	
	}
		public static void nav(String Url2) {
			driver.navigate().to(Url2);
			
		}	
		public static void forward() {	
			driver.navigate().forward();
			
		}	
			
		public static void ref() {
			driver.navigate().refresh();
		
		}
		
		public static void bk() {
			driver.navigate().back();
		
		}	
		public static void clo() {
			driver.close();
		}
			
		public static String title() {	
			return driver.getTitle();
			
		}
		public static void qu() {
			driver.quit();
			
		}
		public static boolean selected(WebElement element) {
		return element.isSelected();	
		}	
		public static boolean display(WebElement element) {
		return element.isDisplayed();
		}
		
		public static boolean enable(WebElement element) {
		return element.isEnabled();
	
		}
		public static void sen(WebElement element) {
		 element.sendKeys("yaswanth");
		}	
		
		public static void cl(WebElement element) {
		element.click();
		}	

		
		public static void simplealert(WebElement simple) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
			
		}		
		public static void confirmalert(WebElement confirm) {
		Alert alert = driver.switchTo().alert();	
		alert.dismiss();	
			
		}
		public static void promptalert(WebElement prompt) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		}
		
		public static void day(WebElement day,int index) {
		Select b = new Select(day);
		b.selectByIndex(index);
		}	
		public static void month(WebElement month,String value) {
		Select b = new Select(month);
		b.selectByValue(value);
		}
		public static void year(WebElement year,String value) {
		Select b = new Select(year);
		b.selectByVisibleText(value);
		}	
		
		public static void screen_short(WebElement screen_short) throws IOException {
		TakesScreenshot ts =(Takesscreenshot);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("element");
		Files.copy(src,des);
		}		
		
		public static void mouse_over(WebElement women) {
		Actions as = new Actions(driver);	
		as.moveToElement(women).perform();	
			
		}
		public static void scroil_down(WebElement element) {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			js.executeScript("window.scrollTo(0,document.body.scrollTop)");
			js.executeScript("window.scrollBy(0,1000)");
			js.executeScript("window.scrollBy(0,1000)");
			js.executeScript("window.scrollBy(0,1000)");
			
		}
		
		public static void Robot(WebElement email) throws AWTException {
			
			
			
			
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_ENTER);
		s.keyPress(KeyEvent.VK_DOWN);
		s.keyRelease(KeyEvent.VK_ENTER);
		
		}	
		public static void WindowHandles() {
		Set<String> element = driver.getWindowHandles();
		for(String st:element) {
			String title=driver.switchTo().window(st).getTitle();
			
		}
		}
		public void frameMethod(String option,String value,WebElement element) {
			if(option.equalsIgnoreCase("byIndex")) {
				int index=Integer.parseInt(value);
				driver.switchTo().frame(index);
			}
			else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(value);
				
			}
			
			else if (option.equalsIgnoreCase("byElement")) {
				driver.switchTo().frame(value);
			}
			else {
				System.out.println("Invalid frame selection");
			}
			
		}
		
		
}				
	
		
		

		
		
		
		
		

	
	
	
	
	
	
	
	