import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Module7 extends BaseTest {
    @AndroidFindBy(accessibility =  "Мобильные")
    MobileElement mobiles;
    @AndroidFindBy(accessibility =  "Apple")
    MobileElement apple;
    @FindBy(xpath = "//div[@class=\"drop-list\"]")
    WebElement byPopularityFilter;
    @FindBy(linkText = "от дешевых к дорогим")
    WebElement fromCheapToExpensiveFilter;
    @Test
    public void hybridTest() throws InterruptedException{
        mobiles.click();
        apple.click();
        changeDriverContextToWebView(driver);
        byPopularityFilter.click();
        fromCheapToExpensiveFilter.click();
        Thread.sleep(5000);
    }
    public void changeDriverContextToWebView(AppiumDriver<?> driver){
        Set<String> contextHandles = driver.getContextHandles();
        for (String name:contextHandles){
            if (name.contains("WEBVIEW"))
                driver.context(name);
        }
    }
}
