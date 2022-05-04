package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScotiaBankLoginTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();		//open Firefox
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=dKnSQVM8fbU&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiZEtuU1FWTThmYlUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY0NTk3NzYyNywiaWF0IjoxNjQ1OTc2NDI3LCJqdGkiOiI4Y2ZjYjc1NS05N2EwLTRiMjctYjIzOS02MmJkN2JmYWIyNGIiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.emL2RUpxNtPwvnM0wxHnBkHRWKBYaXw1nSmApqn7M9c76uuWM7Lwn_9Z3v00bv3xB-xyrh_1ATPCxFzpM73i5q-2TyKOMKDNkVAwXqZsY5wTcYziYROEIhjW19HfwGXpp2dOPv1BuCEl1NngMl4Rwd32LlQqn8REOeEzNpr1HYJ3ghchQ0JdCFHwiBotUXZ13g8kM72yo4FzEwq2uh_zbogTAzNpVbI_bWSK7VVnVHpYLrzLdYZ6lqR9xm3TPnHGszA7K_9U65J-vpXcYpOBuRcr_KFWS5JeowlHh5acA_zUuUtDpGDKYiF2Gz0MY7Itx8NG_WUchLZPHlxelfrzhQ&preferred_environment=");
		
		driver.findElement(By.name("usernameInput")).sendKeys("hvgcg");	//or
		driver.findElement(By.id("usernameInput-input")).sendKeys("vdwddnwj");
		driver.findElement(By.name("password")).sendKeys("vdhw");
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(3000); //helps to display error 
		
		String expected = "Please check your card number / username or password and try again.";
		String actual = driver.findElement(By.id("globalError")).getText();
		System.out.println(actual);
		
		if(expected.equals(actual)) {
			System.out.println("Test Pass");}
			else {
				System.out.println("Test Fail");
		}
	}

}
