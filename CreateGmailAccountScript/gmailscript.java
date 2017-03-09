package Handsonselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailscript {
	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.firefox.marionette", "G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");	
		System.setProperty("webdriver.gecko.Driver","G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		
		 FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.get("https://accounts.google.com/SignUp");
		Driver.manage().window().maximize();
		
		
		//Driver.findElement(By.id("Email")).clear();
		//Driver.findElement(By.xpath("html/body/nav/div/a[3]")).click();
		Thread.sleep(10000);
		
		Driver.findElement(By.id("FirstName")).sendKeys("Suhas");
		Driver.findElement(By.id("LastName")).sendKeys("aa");
		
		
		Driver.findElement(By.id("GmailAddress")).sendKeys("wireclass9");
		Driver.findElement(By.id("Passwd")).sendKeys("wireclass@9");
		Driver.findElement(By.id("PasswdAgain")).sendKeys("wireclass@9");
		
		
		//Driver.findElement(By.id("HiddenBirthMonth")).sendKeys("5");
	
		Driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).sendKeys("May");
		Driver.findElement(By.id("BirthDay")).sendKeys("5");
		Driver.findElement(By.id("BirthYear")).sendKeys("1992");
		
	
		Driver.findElement(By.xpath(".//*[@id='Gender']/div[1]")).sendKeys("Male");
	/*	
		Driver.findElement(By.xpath("//div[@aria-activedescendant=':d']")).sendKeys();
		
		Driver.findElement(By.name("RecoveryPhoneNumber")).sendKeys();
		 
        // Type your recovery email address here
        Driver.findElement(By.name("RecoveryEmailAddress")).sendKeys();
 
        // Skipping the verification by clicking the check box
        Driver.findElement(By.name("SkipCaptcha")).click();
 
        // Agree the gmail terms of service by clicking the check box
        Driver.findElement(By.xpath("//input[@id='TermsOfService']")).click();
 
        // Clicking next button
        Driver.findElement(By.name("submitbutton")).click();
         
        // Closing the browser
        Driver.quit();
		
	/*	Driver.findElement(By.id("next")).click();
		
		Thread.sleep(1000);
		
		Driver.findElement(By.id("Passwd")).clear();
		Driver.findElement(By.id("Passwd")).click();
		
		Driver.findElement(By.id("Passwd")).sendKeys("wireclass222");
		Driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(4000);
		
		Driver.getTitle();
		
		
		Driver.close();
		
		*/
		Thread.sleep(3000);
		
		Driver.findElement(By.id("submitbutton")).click();
		
		}
		
}
