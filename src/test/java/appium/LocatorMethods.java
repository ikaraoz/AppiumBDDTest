package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class LocatorMethods {
    static AppiumDriver driver;

    public static void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel API 29");
        caps.setCapability("appPackage", "com.android.dialer" );
       // caps.setCapability("appActivity", "com.android.contacts.common.dialog.CallSubjectDialog");
        caps.setCapability("appActivity", ".main.impl.MainActivity");

        URL url= new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver(url, caps);
    }
}
