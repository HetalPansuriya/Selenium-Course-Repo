package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws InterruptedException {

		String browser = "chrome";// chrome,safari
		WebDriver driver;

		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\seleniumJars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\seleniumJars\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.setProperty("webdriver.safari.driver", "C:\\seleniumJars\\s.exe");
			driver = new FirefoxDriver();
		}

		driver.get("https://www.facebook.com/");

		Thread.sleep(3000);

		driver.findElement(By.name("email")).sendKeys("dggfhgfhgh");
		driver.findElement(By.name("pass")).sendKeys("bbfjddfkdgkjgjrtejk");
		driver.findElement(By.name("login")).click();

	}

}
