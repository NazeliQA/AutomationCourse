import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest {

    /**
     * This method is validating that user cannot log in with correct credentials.
     *
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Input valid password
     *  4. Click on 'Sign In' button
     *  5. Validate user is logged in successfully
     */

    @Test
    public void positiveLoginTestGoogle () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1994$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        //wait up 10 sec till the avatar element is displayed
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 10);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);

        driver.quit();
    }

    /**
     * This method is validating that user cannot log in with correct credentials.
     *
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Input valid password
     *  4. Click on 'Sign In' button
     *  5. Validate user is logged in successfully
     */

    @Test
    public void positiveLoginTestFirefox () {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1994$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        //wait up 10 sec till the avatar element is displayed
        By locatorOfAvatarElement = By.cssSelector(".Button-label .avatar.circle");
        SeleniumActions actions = new SeleniumActions(driver);
        boolean isLocatorOfAvatarElementDisplayed = actions.isDisplayed(locatorOfAvatarElement, 10);
        Assert.assertTrue(isLocatorOfAvatarElementDisplayed);


        driver.quit();
    }

    /**
     * This method is validating that user cannot log in with wrong credentials.
     *
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Input wrong password
     *  4. Click on 'Sign In' button
     *  5. Validate user is not logged in and "Incorrect username or password." error is displayed
     */

    @Test
    public void LoginTestWithWrongCredsGoogle () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1995$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        SeleniumActions actions = new SeleniumActions(driver);
        boolean isDisplayed = actions.isDisplayed(By.className("js-flash-alert"), 10);
        Assert.assertTrue(isDisplayed);

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

        driver.quit();
    }

    /**
     * This method is validating that user cannot log in with wrong credentials.
     *
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Input wrong password
     *  4. Click on 'Sign In' button
     *  5. Validate user is not logged in and "Incorrect username or password." error is displayed
     */

    @Test
    public void LoginTestWithWrongCredsFirefox () {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1904$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        SeleniumActions actions = new SeleniumActions(driver);
        boolean isDisplayed = actions.isDisplayed(By.className("js-flash-alert"), 10);
        Assert.assertTrue(isDisplayed);

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

        driver.quit();
    }

    /**
     * This method is validating that user cannot log in with empty password.
     *
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Click on 'Sign In' button
     *  4. Validate user is not logged in and "Password field is empty" error is displayed
     */

    @Test
    public void LoginTestWithEmptyPasswordGoogle () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        SeleniumActions actions = new SeleniumActions(driver);
        boolean isDisplayed = actions.isDisplayed(By.className("js-flash-alert"), 10);
        Assert.assertTrue(isDisplayed);

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

        driver.quit();
    }

    /**
     * This method is validating that user cannot log in with empty password.
     *
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Click on 'Sign In' button
     *  4. Validate user is not logged in and "Password field is empty" error is displayed
     */

    @Test
    public void LoginTestWithEmptyPasswordFirefox () {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        SeleniumActions actions = new SeleniumActions(driver);
        boolean isDisplayed = actions.isDisplayed(By.className("js-flash-alert"), 10);
        Assert.assertTrue(isDisplayed);

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

        driver.quit();
    }
}
