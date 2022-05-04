package practiceTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("C:\\Testing\\Prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser  = prop.getProperty("browser");  //Chrome, Safari//we still have to change String value..so this is also not the problem
		WebDriver driver;
		
		if(browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\SeleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		}else {
		    System.setProperty("webdriver.safari.driver", "C:\\SeleniumJars\\safaridriver.exe");
		    driver = new FirefoxDriver();
		    }
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("bevhtgvhh");		//fill last name
		driver.findElement(By.name("pass")).sendKeys("vevhvhv");	//fill mobile number
		driver.findElement(By.name("login")).click();
	}

	}

