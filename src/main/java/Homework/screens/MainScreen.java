package Homework.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainScreen extends Tabbar{
    @AndroidFindBy(id = "mvideo_logo")
    MobileElement logoTypeIcon;
    @AndroidFindBy(id = "store_main_title")
    MobileElement storeMainTitle;

     public MainScreen(AppiumDriver<?> driver) {
        super(driver);
    }

    public MobileElement getLogoTypeIcon(){
        return logoTypeIcon;
    }
    public String getStoreMainTitleText(){
        return storeMainTitle.getText();
    }
}
