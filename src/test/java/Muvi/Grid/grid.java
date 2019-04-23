package Muvi.Grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


/**
 * Unit test for simple App.
 */
public class grid {


	static AndroidDriver<AndroidElement> driver;


	
	@Parameters({"URL","UDID"})
	@BeforeTest
	public void setup(String URL,String UDID) throws MalformedURLException {


		try {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setCapability("platformName", "Android");
			cap.setCapability("platformVersion", "8.1.0");
		    cap.setCapability("automationName", "UiAutomator2");

			cap.setCapability("deviceName", "XP8800");
			cap.setCapability("udid", UDID);
			cap.setCapability("appActivity", "com.android.contacts.activities.PeopleActivity");
			cap.setCapability("appPackage", "com.android.contacts");
			driver = new AndroidDriver<AndroidElement>(new URL("http://"+URL), cap);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			
		   
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}







	}





}
