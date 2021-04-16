package utils;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Utils {

	
public static AppiumDriver<WebElement> driver;
	
	public static void acessarKeep() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("deviceName", "emulator-5554");
		desiredCapabilities.setCapability("automationName", "uiautomator2");
		desiredCapabilities.setCapability("appPackage", "com.google.android.keep");
		desiredCapabilities.setCapability("appActivity", "com.google.android.apps.keep.ui.activities.BrowseActivity");


		driver = new AppiumDriver<WebElement>( new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
	}
	
}
