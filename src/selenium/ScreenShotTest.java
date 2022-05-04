package selenium;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;


	//use this to take shots of fail test or errors
public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://www.ebay.ca/");

		File scrFile = driver.getScreenshotAs(OutputType.FILE);		//this is for FireFoxDriver, Chrome or any other driver
		//file scrFile = ((TakeScreenshot)driver).getScreenshotAs(OutputType.FILE);   //we should use this line while using webdrive...this line is for WebDriver
		FileUtils.copyFile(scrFile,  new File("C:\\Testing\\Screenshot.png"));
	
		
	}

}
/*//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File scrFile = driver.getScreenshotAs(OutputType.FILE);	// This is for FirefoxDriver, Chrodriver or any class driver	
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  // This line is for WebDriver
		FileUtils.copyFile(scrFile, new File("C:\\testing\\screenshot.png"));
*/
