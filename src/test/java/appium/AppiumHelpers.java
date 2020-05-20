package appium;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

import static appium.LocatorMethods.*;

public class AppiumHelpers {


    public static void navigateHelper() throws MalformedURLException {
        setUp();
    }

    public static void tapHelper(String element){
        element= "//*[@text='Contacts']";
         driver.findElement(By.xpath(element)).click();
    }
}
