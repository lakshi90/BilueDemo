package tests;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() {
		
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
	        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
	        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7");
	        caps.setCapability(MobileCapabilityType.UDID, "28191FDH200KPT");
	        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
	        caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//	        caps.setCapability("appPackage", "com.example.app");
//	        caps.setCapability("appActivity", ".MainActivity");
	        
	        URL url = new URL("http://127.0.0.1:4723/wd/hub");
	        
	        driver = new AppiumDriver<MobileElement>(url, caps);
		}
		catch (Exception e) {
			System.out.println("Failure cause: "+ e.getCause());
			e.printStackTrace();
		}
	}
	
	@Test
	public void login() {
		System.out.println("---------------");
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
