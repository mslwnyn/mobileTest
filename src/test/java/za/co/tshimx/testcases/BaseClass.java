package za.co.tshimx.testcases;


import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.log4j.Logger;


public class BaseClass {
        final static Logger logger = Logger.getLogger(BaseClass.class);
	protected AndroidDriver<MobileElement> driver;
        
	@BeforeTest
	protected void setup() {
                try {
                        logger.info("Setting Capabilities .................................................");
                        DesiredCapabilities capabilities = new DesiredCapabilities();
                        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy J4+");
                        capabilities.setCapability(MobileCapabilityType.UDID, "7b3bde25");
                        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
                        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
                        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");
                        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
                        logger.info("Completed Setting Capabilities .................................................");

                        URL url = new URL("http://127.0.0.1:4723/wd/hub");
                        logger.info("URL is set to  .................................................: "+ url.toString());
                        driver = new AndroidDriver(url,capabilities);
                        logger.info("Completed Initialization of the Android Driver....................");
                        Thread.sleep(3000);
                        
                       
                        
                } catch (Exception e) {
                      e.printStackTrace();
                }
        }

	@AfterTest
	protected void teardown() throws InterruptedException {
               //Thread.sleep(10000);
               //driver.close();
               driver.quit();
	}

}
