package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe"); //paste gecko driver path instead of null in double quote
	
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();  //opens new window in firefox..its a constructor//error because we don't have firefox class ..this is selenium's
	 // we need to add selenium library from selenium.dev..download..4.1.2..save in SeleniumJar ..follow steps from note

		//for each browser we require to create Driver..like ChromeDriver..+ create object for DriverClass (ChromeDriver driver = new ChromeDriver();
		// for paths either 2 backward slash \\or 1 forward slash/
		
		driver.get("https://www.facebook.com/"); //its a generic method/string/ ..to pass url/open url
		driver.findElement(By.id("email")).sendKeys("yhvhbhbb");	//we fond "email" from inspecting fb email box..got to id=email,double click to select email word
		driver.findElement(By.id("pass")).sendKeys("buvhvjvhj");
		driver.findElement(By.name("login")).click();
	
	}

}
