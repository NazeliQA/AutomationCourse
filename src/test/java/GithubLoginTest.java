import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GithubLoginTest {
    //This method validates that login is successful with correct data on Google
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
    //This method validates that login is successful with correct data on Firefox
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
    //This method validates that login is not successful with incorrect data on Google
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
    //This method validates that login is not successful with incorrect data on Firefox
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
    //This method validates that login is not successful with empty password on Google

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
    //This method validates that login is not successful with empty password on Firefox
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
