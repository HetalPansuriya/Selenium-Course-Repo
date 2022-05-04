package practiceTest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginUsingXpath {


	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		
		
	}
}
