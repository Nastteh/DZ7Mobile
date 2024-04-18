package Homework.screens;

import Homework.GoToMainScreenStrategy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CartScreen extends Tabbar{
    @AndroidFindBy(id = "cart_empty_check_this_out_button")
    MobileElement gotoMainButton;

    public CartScreen(AppiumDriver<?> driver) {
        super(driver);
    }

    public void goToMainScreen(){
        gotoMainButton.click();
    }
    public void goToMainScreenByStrategy(GoToMainScreenStrategy goToMainScreenStrategy){
        goToMainScreenStrategy.goToMain();

    }
}
