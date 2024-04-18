package Homework;

import Homework.screens.Tabbar;
import io.appium.java_client.AppiumDriver;

public class GoToMainFromTabbarStrategy implements GoToMainScreenStrategy{
    AppiumDriver<?> driver;
    public GoToMainFromTabbarStrategy(AppiumDriver<?> driver){
        this.driver = driver;
    }
    @Override
    public void goToMain() {
        Tabbar tabbar = new Tabbar(driver);
        tabbar.goToMain();
    }
}
