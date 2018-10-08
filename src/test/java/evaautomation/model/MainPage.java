package evaautomation.model;

import evaautomation.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By enterButton = By.className("eva-icon-avatar");
    private By emailField = By.cssSelector("input[name='login[username]']");
    private By passwordField = By.cssSelector("input[name='login[password]']");
    private By loginButton = By.cssSelector(".primary #send2");

    private String login;
    private String password;

    public MainPage(WebDriver driver, WebDriverWait wait, String login, String password) {
        this.driver = driver;
        this.wait = wait;
        this.login = login;
        this.password = password;
    }

    public void open() {
        driver.get(Properties.getBaseUrl());
    }

    public void clickOnEnterButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterButton));
        driver.findElement(enterButton).click();
    }

    public void fillInEmail() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField));
        driver.findElement(emailField).sendKeys(login);
    }

    public void fillInPassword() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField));
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickOnLoginButton() {
//        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        driver.findElement(loginButton).click();
    }
}
