package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage {
    By avatarLocator=By.cssSelector(".Button-label .avatar.circle");
        public HomePage(WebDriver driver) {
            super(driver);
        }

    @Override
    public boolean isDisplayed() {
        return actions.isDisplayed(avatarLocator, 10);
        }
}
