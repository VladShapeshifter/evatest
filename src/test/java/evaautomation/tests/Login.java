package evaautomation.tests;

import evaautomation.utils.BaseTest;
import org.testng.annotations.DataProvider;

public class Login extends BaseTest {

    @DataProvider
    private Object[][] getOneLoginPassword() {
        return new Object[][] {
                {"brandertest04@i.ua", "Brandertest123"},
                {"brandertest00@i.ua", "Brandertest123"}
        };
    }
}
