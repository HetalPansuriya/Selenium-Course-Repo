package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	
//impliment implicite and explicite wait

public class DragAndDropTest {

	public static void main(String[] args) {
		
		//create 2 webElements which are in other frame

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));	//id of box 1..located under frame
		WebElement droppable = driver.findElement(By.id("droppable"));	//id of box 2..located under frame
		System.out.println(droppable.getText());
		

		Actions builder = new Actions(driver);
		builder.dragAndDrop(draggable, droppable).build().perform();
		System.out.println(droppable.getText());
		
		if(droppable.getText().equals("Dropped!")) {
			System.out.println("Test Pass");
		}else {
			System.out.println("Test Fail");
				
		}
	}

}
