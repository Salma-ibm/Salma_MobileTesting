package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class WebTesting {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "abc");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//Code for browser application
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\SalmaMurmu\\Desktop\\Manipal\\selenium\\drivers\\chromedriver.exe");
		
		//code for mobile App Khan Academy Access(Native Apps)
//		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
//		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
	//	cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "org.khanacademy.android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Code for browser application
		driver.get("http://google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium webdriver quiz online");
				
		System.out.println("As Expected");
		

	}

}
