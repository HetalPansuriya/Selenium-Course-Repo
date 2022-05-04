package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); // open Firefox
		driver.get("https://www.adidas.ca/en/");

		Thread.sleep(7000);

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement Careers = driver.findElement(By.linkText("Careers"));

		// option 1(to scroll scrollbar) & to bring the element into the view
		// System.out.println(Careers.getLocation());
		// jse.executeScript("window.scrollBy(0, 4000)"); //u have to type into double
		// quote by own
		// Careers.click();

		// option 2(scroll this element until its in the view
		//jse.executeScript("arguments[0].scrollIntoView(true)", Careers); // u have to type into double quote by
		//Careers.click();												// own..argument[0] is fix..whole line is																	// line into double is fix
	
		//option 3(Direct Click using Javascript executor
		jse.executeScript("arguments[0].click();", Careers);  //when we want to click on element
		jse.executeScript("arguments[0].value, bhbwjjnknkn", Careers);
	}
}
