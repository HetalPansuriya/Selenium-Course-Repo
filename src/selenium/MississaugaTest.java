package selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MississaugaTest {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://www.mississauga.ca");
		
		Thread.sleep(2000);

		List<WebElement> popUP = driver.findElements(By.id("dialog-description"));
		System.out.println(popUP.size());
		
		if(popUP.size()>0) {
			driver.findElement(By.id("closeButton")).click();
		}
		
		driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();	//from empty box find tag name
		Thread.sleep(2000);

		//get size(10) and text
		List<WebElement> organization = driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
		System.out.println(organization.size());
		
		for(WebElement a : organization) {
			System.out.println(a.getText());
			
			if(a.getText().equals("Jobs and volunteer")) {
				a.click();
				Thread.sleep(2000);
				System.out.println(driver.getTitle());
				break;
			}
	}
	}}


