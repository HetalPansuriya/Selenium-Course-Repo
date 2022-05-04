package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");

		//check element present?
		//when u see tagName iFrame while inspecting means that's different page
		//so to perform action on newFrame..we have to switch to new Frame
		
		List<WebElement>Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable Not Present");
		} 
		
		
		List<WebElement>draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Present");
		}
		
		System.out.println("...............Switching to the Frame.............");
		
		
		//we can find element using these three ways
		//driver.switchTo().frame(0);	//with index
		//driver.switchTo().frame(")); //we can't use because we don't have it
		
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //code from iFrame Tag

		Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable Not Present");
		} 

		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Present");
		}
		System.out.println("..............Switch To Main Page............");
		driver.switchTo().defaultContent();
		
		Sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(Sortable.size());
		
		if(Sortable.size()>0) {
			System.out.println("Sortable Present");
		}else {
			System.out.println("Sortable Not Present");
		} 

		
		draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable Not Present");
		}
		// when we have multiple frame then to switch to main we cane use this..
		//driver.switchTo().parentFrame();
		//we have to switch to default to jump from one to other frame
	}

}
