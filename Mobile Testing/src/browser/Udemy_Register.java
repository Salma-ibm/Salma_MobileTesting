package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Udemy_Register {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "abc");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	//	cap.setCapability("udid", value);
		//code for mobile App Khan Academy Access(Native Apps)
//		cap.setCapability(MobileCapabilityType.NO_RESET, true);
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.udemy.android");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.udemy.android.SplashActivity");
//		cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
	//	cap.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "org.khanacademy.android");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(MobileBy.id("com.udemy.android:id/signin_button")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/create_account_or_sign_in")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign up with email\")")).click();
		
		driver.findElement(MobileBy.id("com.udemy.android:id/username_edit")).sendKeys("Nilamani Behera");		
		driver.findElement(MobileBy.id("com.udemy.android:id/email_edit")).sendKeys("niluhere@gmail.com");	
		driver.findElement(MobileBy.id("com.udemy.android:id/password_edit")).sendKeys("nilu@123");		
		driver.findElement(MobileBy.id("com.udemy.android:id/create_account_button")).click();
		driver.hideKeyboard();
//	    driver.findElement(MobileBy.AccessibilityId("Tap to search courses")).click();
	//	driver.pressKey(new KeyEvent(AndroidKey.ENTER));
				
		System.out.println("As Expected");
		
	}
}


