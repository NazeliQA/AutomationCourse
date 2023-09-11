import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstTest {
    @Test
    public void myFirstTestCase() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://nativeteams.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    public void mySecondTestCase() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://facebook.com/");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
    @Test
    public void testFirefox() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://nativeteams.com/");
    }
    @Test
    public void loginTest () {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement emailElement = driver.findElement(By.id("email"));
        emailElement.sendKeys("nazeeeeeeli@test.ru");

        WebElement passwordElement = driver.findElement(By.id("pass"));
        passwordElement.sendKeys("password");

        WebElement loginElement = driver.findElement(By.name("login"));
        loginElement.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorElement = driver.findElement(By.className("_9ay7"));
        System.out.println(errorElement.getText());

        Assert.assertEquals(errorElement.getText(), "The email you entered isn’t connected to an account. Find your account and log in.");
    }
}
