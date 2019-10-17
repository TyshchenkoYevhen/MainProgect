package HomeWork9;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverExample {


    @Test
    public void runDriver() {
        System.setProperty("webdriver.chrome.driver", "d:\\install\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://google.com");
        driver.close();
    }
}
