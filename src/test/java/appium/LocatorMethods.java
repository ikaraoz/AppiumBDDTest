package appium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class LocatorMethods {
    public static AppiumDriver<MobileElement> driver;
    public static WebDriverWait wait;
    private static final Properties locatorId = new Properties();
    private static final Properties locatorType = new Properties();

    public static void setUp() throws IOException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.APPLICATION_NAME, "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
       caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus272");
        //caps.setCapability("app", "/Users/karaozes/IdeaProjects/AppiumBDDTest/apps/Calculator_v7.8 (271241277)_apkpure.com.apk");
        caps.setCapability("appPackage", "com.android.dialer" );
        caps.setCapability("appActivity", ".main.impl.MainActivity");


        URL url= new URL("http://localhost:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, caps);
        wait=new WebDriverWait(driver,10);
        initProperties();
    }
    public static void initProperties() throws IOException {
        InputStream inputStream= LocatorMethods.class.getClassLoader().getResourceAsStream("locatorId.properties");
        locatorId.load(inputStream);

        InputStream inputStream2= LocatorMethods.class.getClassLoader().getResourceAsStream("locatorType.properties");
        locatorType.load(inputStream2);

    }
    public static MobileElement waitForPresence(By path){
        return (MobileElement) wait.until(ExpectedConditions.presenceOfElementLocated(path));
    }

    public static MobileElement locateElement(String typeOrId){
        String id = locatorId.getProperty(typeOrId);
        String type = locatorType.getProperty(typeOrId);

        MobileElement element;

        switch (type){
            case "xpath":
                element = waitForPresence(By.xpath(id));
                break;
            case "id":
                element = waitForPresence(By.id(id));
                break;
            case "desc":
                element = waitForPresence(new MobileBy.ByAccessibilityId(id));
                break;
            case "name":
                element = waitForPresence(By.name(id));
                break;
            case "linktext":
                element = waitForPresence(By.linkText(id));
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
        return element;
    }
}
