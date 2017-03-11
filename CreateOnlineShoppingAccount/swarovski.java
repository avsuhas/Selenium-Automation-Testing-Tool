package Handsonselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class swarovski {
	public static void main(String[] args) throws InterruptedException{
		//System.setProperty("webdriver.firefox.marionette", "G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");	
		System.setProperty("webdriver.gecko.Driver","G:\\Downloads\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		
		 FirefoxDriver Driver = new FirefoxDriver();
		
		Driver.get("https://www.swarovski.com/Web_US/en/login");
		Driver.manage().window().maximize();
		
		Thread.sleep(4000);
	
		Driver.findElementByXPath(".//*[@id='loginregister-groupbox']/div[2]/form/div/input").click();
		Thread.sleep(4000);
		Driver.findElementByXPath(".//*[@id='loginregister-groupbox']/div[2]/form/div/input").click();
		Thread.sleep(4000);
		
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_Title-mirror']/a").click();
		Thread.sleep(4000);
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_Title-mirror-pd']/li[3]/a").click();
		

		Driver.findElement(By.id("InvoiceToAddressForm_FirstName")).sendKeys("Suhas");
		Driver.findElement(By.id("InvoiceToAddressForm_LastName")).sendKeys("Arudi");	
		Driver.findElement(By.id("InvoiceToAddressForm_Street")).sendKeys("125 Cottage Street");
		Driver.findElement(By.id("InvoiceToAddressForm_PostalCode")).sendKeys("02740");
		Driver.findElement(By.id("InvoiceToAddressForm_City")).sendKeys("New Bedford");

	
		
		//state province code here
		
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_County-mirror']/a/span").click();
		Thread.sleep(4000);
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_County-mirror-pd']/li[23]/a").click();
		
		Driver.findElement(By.id("InvoiceToAddressForm_Email")).sendKeys("avsuhas@gmail.com");
		Driver.findElement(By.id("InvoiceToAddressForm_ConfirmMail")).sendKeys("avsuhas@gmail.com");
		
		
		Driver.findElement(By.id("InvoiceToAddressForm_Mobile")).sendKeys("2482600764");
		
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_BirthdateD']").sendKeys("12");
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_BirthdateM']").sendKeys("05");
		Driver.findElementByXPath(".//*[@id='InvoiceToAddressForm_BirthdateY']").sendKeys("1991");
		
		
		Driver.findElement(By.id("CredentialForm_Password")).sendKeys("Abc123!@#");
		//Driver.findElement(By.id("CredentialForm_PasswordConfirmation")).sendKeys("Abc123!@#");
		
	
		Driver.findElementByXPath("	.//*[@id='contentwrap']/div/div[2]/div/form/div/input").click();
		
		
	}
	
	
}
