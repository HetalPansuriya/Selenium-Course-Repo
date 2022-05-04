package selenium;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	//refer Array Test
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		Thread.sleep(7000);

		driver.findElement(By.cssSelector("a[href='https://support.google.com/accounts?hl=en']")).click();
		
		Set<String> allWindows = (Set<String>) driver.getWindowHandles();
	    System.out.println(allWindows.size());
	    
	    //we can't use .getText()..as this is not a list or a webElement..its a String List so we have to pass Iterator
		
	    Iterator<String> itr = allWindows.iterator();
	    String mainWindow = itr.next();
	    String childWindow = itr.next();
	    System.out.println(mainWindow);
	    System.out.println(childWindow);
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().window(childWindow);
	    System.out.println(driver.getTitle());		//help page
	    driver.close();     							//.close() /will close that specific window
	    
	    driver.switchTo().window(mainWindow);
	    System.out.println(driver.getTitle());    	//gMail page
	    driver.quit();     							//.quit()will close all windows
	}
}
