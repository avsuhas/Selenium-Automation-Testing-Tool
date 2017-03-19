package Handsonselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {
	
	public static void main(String[] args) throws InterruptedException
	{	
		System.setProperty("webdriver.gecko.Driver","G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		
		 FirefoxDriver Driver = new FirefoxDriver();
		 
		 Driver.get("https://accounts.google.com/SignUp");
		 Driver.manage().window().maximize();
			
		Thread.sleep(4000);
		 
		 WebElement a = Driver.findElement(By.id("Firstname"));
		 Actions action=new Actions(Driver);
		 action.moveToElement(a).build().perform();
		 Driver.findElement(By.id("Firstname")).click();
		
	}
	

}
