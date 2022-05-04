package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	//to find element and click it

	public static void main(String[] args) throws InterruptedException  {
	
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();	
		driver.get("https://echoecho.com/javascript4.htm");

	//	List<WebElement>element = driver.findElements(By.xpath("//input[@value='confirm box']"));
	//	System.out.println(element.size());
		
	//	if(element.size()>0) {
	//		System.out.println("Element Present");
	//	}else {
	//		System.out.println("Element Not Present");}

			driver.findElement(By.className("B2")).click();
		
			Thread.sleep(2000);
			Alert al = driver.switchTo().alert();
			System.out.println(al.getText());
			
			al.accept();	//or
			//al.dismiss();
		
	}

}
