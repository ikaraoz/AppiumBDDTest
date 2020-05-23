package appium;

import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.io.IOException;
import java.net.MalformedURLException;

import static appium.LocatorMethods.*;

public class AppiumHelpers extends LocatorMethods{
//static LocatorMethods ls;

    public static void navigateHelper() throws IOException {
//       ls = new LocatorMethods();
//       ls.setUp();
        setUp();

    }

    public static void tapHelper(String element){
//        element= "//*[@text='Contacts']";
//         driver.findElement(By.xpath(element)).click();
        locateElement(element).click();
    }

    public static void sendKeys(String content, String element){
        locateElement(element).sendKeys(content);
    }

    public static void checkName(String expected, String element) throws InterruptedException {
        Thread.sleep(5000);
        String nameOnScreen= locateElement(element).getText();
        Assert.assertEquals(expected,nameOnScreen);

    }
}
