package Baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class baseclass {

	
	public static WebDriver driver;
	public String getprojectpath() {
		return System.getProperty("user.dir");
	}
	public String getpropertyFilevalue(String key) throws FileNotFoundException, IOException {
		
		Properties properties = new Properties();
		properties.load(new FileInputStream(getprojectpath()+"D:\\eclipse\\com.mobiletesting\\Config\\config.properties"));
		return(String)properties.get(key);

	}
public void elementSendkeys(WebElement element,String data) {
	element.sendKeys(data);

	}
public void elementclick(WebElement element) {
	element.click();
	
}
public void launchmobileapp(String deviceName,String platformName,String platformVersion,String appPackage,String appActivity ) {
	
	

}
}
