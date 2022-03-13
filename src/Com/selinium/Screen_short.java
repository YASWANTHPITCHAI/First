package Com.selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screen_short {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace\\Alatt\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=486462777326&hvpos=&hvnetw=g&hvrand=8650098980160330414&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061972&hvtargid=kwd-64107830&hydadcr=14452_2154371&gclid=EAIaIQobChMIi8XPtMmS9gIV7pNmAh0g_Qr1EAAYASAAEgKbevD_BwE");
		driver.manage().window().maximize();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\USER\\eclipse-workspace\\Alatt\\shot\\test1.png");
		Files.copy(src,des);
	
		
	}
	
	
}
