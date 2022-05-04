package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");

		//size text..put attribute value instead of text
		
		//input[@name="group1"]
		
		List<WebElement> allRadioButtons = driver.findElements(By.name("group1"));
		System.out.println(allRadioButtons.size());
	
	for(WebElement a : allRadioButtons) {
		System.out.println(a.getAttribute("value")+"........"+a.isSelected());
}
	//fine cheeze and .click
	//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
	
	allRadioButtons.get(2).click();
	System.out.println(".............");
	
	for(WebElement a : allRadioButtons) {
		System.out.println(a.getAttribute("value")+"........"+a.isSelected());
}
		}
	}

