package browser;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Shop_By_Category {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap = new DesiredCapabilities();
//		cap.setCapability("deviceName", "abc");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "abc");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//Code for browser application
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
	    cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE, "C:\\Users\\SalmaMurmu\\Desktop\\Manipal\\selenium\\drivers\\chromedriver.exe");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Code for browser application
		driver.get("http://amazon.in");
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[6]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"sbdCategory2\"]/div[1]/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"sbdCategory2\"]/div[2]/div/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"configuration-button\"]/span/input")).click();		
		driver.findElement(By.xpath("//*[@id=\"configuration_1\"]/span/input")).click();
     	driver.findElement(By.xpath("//*[@class='a-sheet-close a-focus-hidden']")).click(); //done
     	
     	driver.findElement(By.xpath("//*[@id='add-to-wishlist-button-submit']")).click();
        
		System.out.println("As Expected8");
		
	}

}




