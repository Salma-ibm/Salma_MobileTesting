package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Native_Hybrid_Testing {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "abc");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//Code for browser application
//		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
//		cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\SalmaMurmu\\Desktop\\Manipal\\selenium\\drivers\\chromedriver.exe");
		
		//code for mobile App Khan Academy Access(Native Apps)
//		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "org.khanacademy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
//		cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
	//	cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "org.khanacademy.android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Code for browser application
//		driver.get("http://google.com");
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium webdriver quiz online");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Dismiss\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
		driver.findElement(MobileBy.AccessibilityId("Continue with Facebook")).click();
		Thread.sleep(5000);
//		System.out.println(driver.getContextHandles());
//		driver.context(driver.getContextHandles().toArray()[0].toString());
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
////		driver.context("NATIVE_APP");
//		System.out.println(driver.getContext());
//		Thread.sleep(5000);
////		driver.findElement(By.xpath("//*[@id='m_login_email']")).sendKeys("salma.murmu@gmail.com");
//		driver.findElement(By.id("m_login_email")).sendKeys("salma.murmu@gmail.com");
//		
	    driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_email\")")).sendKeys("test@gmail.com");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"m_login_password\")")).sendKeys("test@123");
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Log In\")")).click();
		
		//"You've tried to log in too many times. To protect your account, a temporary block has been placed on logging in. Please try again later."
		
//		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Cancel\")")).click();
		
	  //  Assert.assertEquals(driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"com.facebook.katana:id/(name removed)\")")).getText(), "It looks like test doesn't match an existing account. If you don't have a Facebook account, you can create one now.");
				
		System.out.println("As Expected");
		
	}
}


