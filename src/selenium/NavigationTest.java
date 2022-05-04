package selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationTest {

	//driver.get and .navigate are same..we can use either of these
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get{"https://www.google.com/"}
					//or
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
	}

}
