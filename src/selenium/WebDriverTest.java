package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver(); 
		//InterfaceName (ParentClass) obJName = new ClassName();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("yhvhbhbb");
		driver.findElement(By.id("pass")).sendKeys("buvhvjvhj");
		driver.findElement(By.name("login")).click();
		
	}

}
