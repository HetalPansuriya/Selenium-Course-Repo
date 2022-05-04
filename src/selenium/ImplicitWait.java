package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create New Account")).click();		//click on create new account

		Thread.sleep(3000);	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	//Max time
	
		driver.findElement(By.name("lastname")).sendKeys("bevh");		//fill last name
		driver.findElement(By.name("reg_email__")).sendKeys("vevh");	//fill mobile number
		driver.findElement(By.id("password_step_input")).sendKeys("dgwhwd");	//fill password
		
		List<WebElement> allDays = driver.findElements(By.xpath("//select[@id='day']/option"));		//select day
		System.out.println(allDays.size());
		for (WebElement a : allDays) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"...."+a.isSelected());//to select default option like "all Categories" which we want to keep default
		}}
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByValue("20");    //selects "Antique"
		Thread.sleep(3000);
		
		
		List<WebElement> allMonths = driver.findElements(By.xpath("//select[@id='month']/option"));		//select month
		System.out.println(allMonths.size());
		for (WebElement a : allMonths) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"...."+a.isSelected());//to select default option like "all Categories" which we want to keep default
		}}
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByValue("7");    //selects "Antique"
		Thread.sleep(3000);
		
		
		List<WebElement> allYears = driver.findElements(By.xpath("//select[@id='year']/option"));		//select year
		System.out.println(allYears.size());
		for (WebElement a : allYears) {
			if(a.isSelected()) {
			System.out.println(a.getText()+"...."+a.isSelected());//to select default option like "all Categories" which we want to keep default
		}}
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2000");    //selects "Antique"
		Thread.sleep(3000);
		
		driver.findElement(By.name("websubmit")).click();	
	}

}
