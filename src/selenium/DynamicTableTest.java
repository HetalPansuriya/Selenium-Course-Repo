package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DynamicTableTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		//get number of rows	//table[@id='customers']//tr
		//get number of cols	//tablWebElementtomers']//tr[2]/td
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Number of Rows:" + rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println("Number of cols:" + cols.size());
		
		//this call nested forloop..forloop inside forloop
		for(int i=2; i<=rows.size(); i++) {
			for(int j=1; j<=cols.size(); j++) {
			System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
			System.out.print(" | ");
			}
		System.out.println();
	}
}}

/*
for(int i=2; i<=rows.size(); i++) {

for(int j =1; j<=cols.size(); j++) {
	String first = "//table[@id='customers']//tr[";
	String second = "]/td[";
	String third = "]";
	//System.out.println(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
	System.out.println(driver.findElement(By.xpath(first+i+second+j+third)).getText());
}

}
List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("Number of Rows: "+ rows.size());
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']//tr[2]/td"));
		System.out.println("Number of cols: "+ cols.size());
			
		
		for(int i=2; i<=rows.size(); i++) {
			
			for(int j =1; j<=cols.size(); j++) {
				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]/td["+j+"]")).getText());
				System.out.print("  |  ");
			}
			System.out.println();
			
		}

*/