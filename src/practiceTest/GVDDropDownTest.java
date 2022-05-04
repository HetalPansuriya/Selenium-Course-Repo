package practiceTest;  //on way


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class GVDDropDownTest {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.gvdirect.com/");

		WebElement Products = driver.findElement(By.linkText("Products"));
		Actions builder = new Actions(driver);
		builder.moveToElement(Products).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> allList = driver.findElements(By.xpath("//ul[@class='dropdown topnavProductsMenu']/li"));
		System.out.println(allList.size());
		for (WebElement a : allList) {
			System.out.println((a.getText()));
		}
	}

}
