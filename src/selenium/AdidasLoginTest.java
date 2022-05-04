package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://www.adidas.ca/en/account-login\r\n");
	
		Thread.sleep(3000);
		driver.findElement(By.id("login-email")).sendKeys("hvvgvhbvgcr@cgbv.com");
		driver.findElement(By.id("login-password")).sendKeys("cgcghcg");
		driver.findElement(By.xpath("//button[@type='submit']")).click();	//or we can use bottom line
		
		Thread.sleep(5000);
	
		String expectedErr = "Incorrect email/password – please check and retry";
		String actualErr = driver.findElement(By.xpath("//div[@data-auto-id='login-error-message']")).getText();
		System.out.println(actualErr);
	
		if(expectedErr.equals(actualErr)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

	}

}
