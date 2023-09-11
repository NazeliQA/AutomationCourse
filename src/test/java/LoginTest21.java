import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest21 {
    @Test
    public void positiveLoginGoogle () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1994$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void positiveLoginFirefox () {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1994$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void negativeLoginGoogle () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1995$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void negativeLoginFirefox () {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("Nazeli1904$");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void negativeLoginGoogle2 () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

    @Test
    public void negativeLoginFirefox2 () {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://github.com/login");

        WebElement loginElement = driver.findElement(By.id("login_field"));
        loginElement.sendKeys("TestAccountNazeli");

        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("");

        WebElement signInElement = driver.findElement(By.name("commit"));
        signInElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

}
