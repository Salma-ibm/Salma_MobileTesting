package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class SignUp_Amazon {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
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
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.findElement(By.xpath("//div[@id='hmenu-customer-name']")).click();
		driver.findElement(By.xpath("//a[@id='register_accordion_header']")).click();
		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9886808551");
		//driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("salma.murmu@gmail.com");
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("test@123");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
//		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
//		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[16]/a")).click();
		
		String Actual = driver.findElement(By.xpath("//*[@class='a-alert-heading']")).getText();
		System.out.println(Actual);
		String Expected = "You indicated you are a new customer, but an account already exists with the mobile number";
		if(Actual.contains(Expected))
		{
			System.out.println("Mobile number already in use");
		}
		else
		{
			System.out.println("Account created");
		}
		
		System.out.println("As Expected");
		

	}

}


