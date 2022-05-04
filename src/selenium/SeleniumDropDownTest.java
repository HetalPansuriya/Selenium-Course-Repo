package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDropDownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 		
		driver.get("https://www.ebay.ca/");
		
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		System.out.println(allOptions.size());

		for(WebElement a : allOptions) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"......"+a.isSelected());}}
			
			WebElement box = driver.findElement(By.id("gh-cat"));
			Select s = new Select(box);				//"select is from html code and id attribute is also from the same tag-select
													//select means its a tagname.......//a means its link
			s.selectByIndex(1); //Antiques
			Thread.sleep(3000);
			
			s.selectByValue("2984"); //baby................value numbers take from html code
			Thread.sleep(3000);
			
			s.selectByVisibleText("Books"); //Books
			
			System.out.println(".......after selection..........");
			for(WebElement b : allOptions) {	//to get only selected options..
				if(b.isSelected()) {				
				System.out.println(b.getText()+"......"+b.isSelected());
				}
	}
	}
}
