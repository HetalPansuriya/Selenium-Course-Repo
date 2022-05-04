package selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> allList = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allList.size());
		
		for (WebElement a : allList) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"...."+a.isSelected());//to select default option like "all Categories" which we want to keep default
		}}
	//	for (WebElement a : allList) {			will only get size and text
	//		System.out.println(a.getText());}    
		
		
	//or	for(int i=0; i<allList.size(); i++) {			//will gest size, text + default selected tab of searching elements
	//		System.out.println(allList.get(i).getText()+"-------"+allList.get(i).isSelected());
		
			WebElement box = driver.findElement(By.id("gh-cat"));
			Select s = new Select(box);
			
			s.selectByIndex(1);    //selects "Antique"
			Thread.sleep(3000);
			
			s.selectByValue("2984");	//selects "Baby"
			Thread.sleep(3000);
		
			s.selectByVisibleText("Books");
			Thread.sleep(3000);				//selects "Books"
			
			System.out.println("........After Selection......");
			
			for (WebElement a : allList) {
				if(a.isSelected()) {
				System.out.println(a.getText()+"...."+a.isSelected());
	}
			}
	}}

