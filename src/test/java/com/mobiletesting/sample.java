package com.mobiletesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class sample {
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("DeviceName", "emulator-5554");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformversion", "13");
	capabilities.setCapability("appPackage", "com.omr_branch");
	capabilities.setCapability("appActivity", "com.omr_branch.MainActivity");
	capabilities.setCapability("automationName", "UiAutomator2");
		WebDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),capabilities);
			
//			(new URL(" http://127.0.0.1:4723/"),capabilities);
	
	WebElement txtemail = driver.findElement(By.xpath("//*[@resource-id='login_email_input']"));
	txtemail.sendKeys("sbsrinivas240499@gmail.com");
	
	WebElement txtpass = driver.findElement(By.xpath("//*[@resource-id='login_password_input']"));
	
	txtpass.sendKeys("Srinivas@48");
	
	WebElement btLogin = driver.findElement(By.xpath("//*[@resource-id='login_button']"));
	
	btLogin.click();
//	WebElement state = driver.findElement(By.xpath("//*[@text='Select State']"));
	WebElement element = driver.findElement(By.xpath("click state"));
	element.click();
//	Select select = new Select(state);
//     select.selectByIndex(1);
//	//*[@text='Select State']
//	state.click();
//	Thread.sleep(3000);
////	
//	WebElement Andra = driver.findElement(By.xpath("//*[@resource-id='Andhra Pradesh']"));
//	Andra.click();
//	Thread.sleep(3000);
	
}
}
