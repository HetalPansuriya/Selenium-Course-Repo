package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {	//to check whether we are loggin or elements are present or not

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://www.google.com/");

	//	if(driver.findElement(By.linkText("About")).isDisplayed()) {
	//		System.out.println("Element Present");
	//	}else {
	//		System.out.println("Element Not Present");
	//	}
	
	//we can not verify Element present or not using WebElement /bottom code..WebElement must be present	
	//	if(driver.findElement(By.linkText("Aboutbycgvhh")).isDisplayed()) {
	//		System.out.println("Element Present");
	//	}else {
	//		System.out.println("Element Not Present");
	//	}}
	
	List<WebElement>element = driver.findElements(By.linkText("About"));
	System.out.println(element.size());
	
	if(element.size()>0) {
		System.out.println("Element Present");
	}else {
		System.out.println("Element Not Present");
	}
	}
}
