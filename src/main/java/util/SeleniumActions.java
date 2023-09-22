package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumActions {
    private WebDriver driver;
    public SeleniumActions(WebDriver driver) {
        this.driver=driver;
    }
    public boolean isDisplayed(WebElement e,int timeout) {

        try {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(e));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    public boolean isDisplayed(By e,int timeout) {

        try {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOfElementLocated(e));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    public boolean isClickable (By e,int timeout) {

        try {
            new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(e));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
