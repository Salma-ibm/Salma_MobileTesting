package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Udemy_Subscribe {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		driver.findElement(MobileBy.id("com.udemy.android:id/browse_button")).click();
		driver.findElement(MobileBy.AccessibilityId("Search tab")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/search_bar_text")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/search_bar_text")).sendKeys("Selenium");
	    driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Top searches\")")).click();
		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"selenium\")")).click();
		driver.hideKeyboard();
//	    driver.findElement(MobileBy.AccessibilityId("Tap to search courses")).click();
		driver.findElement(MobileBy.id("com.udemy.android:id/search_bar_text")).click();
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(MobileBy.id("com.udemy.android:id/badge")).click();
		
		TouchAction act = new TouchAction(driver);
		Dimension d = driver.manage().window().getSize();
		int width = d.width;
		int height = d.height;
		int x1 = width/2;
		int y1 = 4* height/5;
		int x2 = width/2;
		int y2 = height/5;
		
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Math patterns: table\"));");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		while(driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().text(\"Add to Cart\")")).size()==0)
		{
		//act.press(PointOption.point(x1,y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(x2,y2)).release().perform();
		driver.executeScript("mobile:shell", ImmutableMap.of("command","input swipe "+x1+" "+y1+" "+x2+" "+y2));
		}
		
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Add to Cart\")")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Cancel\")")).click();
		
//		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in\")")).click();
//		
//		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().text(\"Sign in with email\")")).click();
//		driver.findElement(MobileBy.id("com.udemy.android:id/email_edit")).sendKeys("niluhere@gmail.com");
//		driver.findElement(MobileBy.id("com.udemy.android:id/nextBtn")).click();
//		driver.findElement(MobileBy.id("com.udemy.android:id/password")).sendKeys("nilu@123");
//		driver.hideKeyboard();
//		driver.findElement(MobileBy.id("com.udemy.android:id/signin_button")).click();
//		driver.hideKeyboard();
//		TouchAction act1 = new TouchAction(driver);
//		Dimension d1 = driver.manage().window().getSize();
//		int width1 = d1.width;
//		int height1 = d1.height;
//		int x3 = width1/2;
//		int y3 = 4* height1/5;
//		int x4 = width1/2;
//		int y4 = height1/5;
//		
//		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Math patterns: table\"));");
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		while(driver.findElements(MobileBy.AndroidUIAutomator("UiSelector().className(\"android.widget.FrameLayout\")")).size()==0)
//		{
//		//act.press(PointOption.point(x1,y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).moveTo(PointOption.point(x2,y2)).release().perform();
//		driver.executeScript("mobile:shell", ImmutableMap.of("command","input swipe "+x3+" "+y3+" "+x4+" "+y4));
//		}
//		//driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().resourceId(\"com.udemy.android:id/course_price\")")).click();
//		//driver.findElement(MobileBy.xpath("//android.widget.TextView[contains(@resource_id,'original_price') and @text='12']")).click();
//		Thread.sleep(5000);
//		driver.findElement(MobileBy.AndroidUIAutomator("UiSelector().className(\"android.widget.FrameLayout\")")).click();
//	   // driver.findElement(MobileBy.id("com.udemy.android:id/wishlist_button")).click();
//		//driver.findElement(MobileBy.id("com.udemy.android:id/save_for_later")).click();
//		
		System.out.println("As Expected");		
	}
}



