//package br.com.goin.coreModelos;
//
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import io.appium.java_client.MobileElement;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.remote.MobileCapabilityType;
//
//public class DriverFactory {
//
//	private static AndroidDriver<MobileElement> driver;
//	
//	public static AndroidDriver<MobileElement> getDriver(){
//		if(driver==null) {
//			createDrive();
//		}
//		return driver;
//	}
//
//	private static void createDrive() {
//		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//
//		desiredCapabilities.setCapability("platformName", "Android");
//		desiredCapabilities.setCapability("deviceName", "Nexus_6_API_25");
//		desiredCapabilities.setCapability("automatorName", "uiautomator2");
//		desiredCapabilities.setCapability(MobileCapabilityType.APP,
//				"/Users/006_fvfx20w1j1wv/projetosGit/mobile-automation/AutomacaoApp/src/main/resources/apk/app_goin-develop-release.apk");
//
//		try {
//			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
//	
//	public static void killDrive() {
//		
//		if(driver!=null) {
//			driver.quit();
//			driver=null;
//		}
//	}
//
//}
