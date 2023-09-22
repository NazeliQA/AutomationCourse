import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import util.SeleniumActions;
import util.WebDriverUtil;

public class GithubLoginTest {
   @AfterMethod
   public void afterMethod(){
      WebDriverUtil.closeDriver();
    }
    @BeforeMethod
    public void beforeMethod(){
        driver = WebDriverUtil.getWebDriver();
        driver.get("https://github.com/login");
    }

    private WebDriver driver;

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
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://github.com/login");

        Assert.assertTrue(loginPage.isDisplayed());
        loginPage.login("TestAccountNazeli", "Nazeli1994$");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());

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

    public void positiveLoginTestFirefox ()
    {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://github.com/login");

        Assert.assertTrue(loginPage.isDisplayed());
        loginPage.login("TestAccountNazeli", "Nazeli1994$");
        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isDisplayed());

    }

    /**
     * This method is validating that user cannot log in with wrong credentials.
     * Steps:
     *  1. Open https://github.com/login page
     *  2. Input valid email
     *  3. Input wrong password
     *  4. Click on 'Sign In' button
     *  5. Validate user is not logged in and "Incorrect username or password." error is displayed
     */

    @Test
    public void LoginTestWithWrongCredsGoogle () {
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://github.com/login");

        Assert.assertTrue(loginPage.isDisplayed());
        loginPage.login("TestAccountNazeli", "Neli1994$");

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

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
        driver = new FirefoxDriver();
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
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://github.com/login");

        Assert.assertTrue(loginPage.isDisplayed());
        loginPage.login("TestAccountNazeli", "");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        SeleniumActions actions = new SeleniumActions(driver);
        boolean isDisplayed = actions.isDisplayed(By.className("js-flash-alert"), 10);
        Assert.assertTrue(isDisplayed);

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

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
        driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("nazeli", "");

        SeleniumActions actions = new SeleniumActions(driver);
        boolean isDisplayed = actions.isDisplayed(By.className("js-flash-alert"), 10);
        Assert.assertTrue(isDisplayed);

        WebElement errorMsgElement = driver.findElement(By.className("js-flash-alert"));
        Assert.assertEquals(errorMsgElement.getText(),"Incorrect username or password.");

    }
}
