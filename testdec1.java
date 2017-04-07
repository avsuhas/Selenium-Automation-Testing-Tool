/*

Script for Gmail Login

*/




package Handsonselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testdec1 {
	
	public static void main(String[] args) throws InterruptedException{
	//System.setProperty("webdriver.firefox.marionette", "G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");	
	System.setProperty("webdriver.gecko.Driver","G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
	
	 FirefoxDriver Driver = new FirefoxDriver();
	
	Driver.get("https://accounts.google.com");

	
	Driver.manage().window().maximize();
	
	//Driver.findElement(By.id("Email")).clear();
	Driver.findElement(By.id("Email")).clear();
	
	Driver.findElement(By.id("Email")).click();
	
	Driver.findElement(By.id("Email")).sendKeys("wireclass2@gmail.com");
	Driver.findElement(By.id("next")).click();
	
	Thread.sleep(1000);
	
	Driver.findElement(By.id("Passwd")).clear();
	Driver.findElement(By.id("Passwd")).click();
	
	Driver.findElement(By.id("Passwd")).sendKeys("wireclass222");
	Driver.findElement(By.id("signIn")).click();
	
	Thread.sleep(4000);
	
	Driver.getTitle();
	
	
	Driver.close();
	
	
	}
	

}
