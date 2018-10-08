package evaautomation.tests;

import evaautomation.BaseTest;
import evaautomation.utils.TabSelector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;


public class Login extends BaseTest {

    @DataProvider
    private Object[][] getOneLoginPassword() {
        return new Object[][] {
                {"brandertest04@i.ua", "Brandertest123"},
                {"brandertest00@i.ua", "Brandertest123"}
        };
    }

    @Test(dataProvider = "getOneLoginPassword")
    public void login(String login, String password) {
        actions.login(login, password, getOneLoginPassword().length);
    }


}
