package Homework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.events.EventFiringWebDriverFactory;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_ACTIVITY;
import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.NO_RESET;

public class DriverFactory {
    AppiumDriver<?> driver;
    public AppiumDriver<?> setUp(Platform platform) throws MalformedURLException {
        switch (platform){
            case ANDROID:
                return createAndroidDriver();
            case IOS:
                return createIosDriver();
            default:
                throw new IllegalArgumentException("No such Homework.Platform");
        }
    }
    private IOSDriver<?> createIosDriver() {
        return (IOSDriver<?>) driver;
    }

    private AndroidDriver<?> createAndroidDriver() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ANDROID");
        capabilities.setCapability(APP_PACKAGE, "net.nadavi.ekmobile");
        capabilities.setCapability(APP_ACTIVITY, ".InitActivity");
        capabilities.setCapability(NO_RESET, true);
        URL remoteUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(remoteUrl, capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return (AndroidDriver<?>) driver;
    }
}
