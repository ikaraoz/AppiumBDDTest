package appium;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;

import static appium.LocatorMethods.*;

public class AppiumHelpers {
static LocatorMethods ls;

    public static void navigateHelper() throws IOException {
       ls = new LocatorMethods();
       ls.setUp();
    }

    public static void tapHelper(String element){
//        element= "//*[@text='Contacts']";
//         driver.findElement(By.xpath(element)).click();
        locateElement(element).click();
    }
}
