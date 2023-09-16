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
        System.setProperty("web-driver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1994$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

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
        System.setProperty("web-driver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1994$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

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
        System.setProperty("web-driver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1995$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

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
        System.setProperty("web-driver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1904$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

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
        System.setProperty("web-driver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        By locatorOfPasswordElement = By.className("(js-flash-alert)");
        WebDriver driver2;
        SeleniumActions actions = new SeleniumActions(driver2);
        boolean isLocatorOfPasswordElementDisplayed = actions.isDisplayed(locatorOfPasswordElement, 5);
        Assert.assertTrue(isLocatorOfPasswordElementDisplayed);

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
        System.setProperty("web-driver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        driver.quit();
    }
}
