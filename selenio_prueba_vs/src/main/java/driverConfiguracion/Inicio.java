package driverConfiguracion;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;


public class Inicio {

    private WebDriver driver;
    protected HomePage homepage;

    // para que sea ejecutado primero
    @BeforeMethod
    public void setUp() {
        String pathDriver = "src/main/resources/webdriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathDriver);
        driver = new ChromeDriver();
        driver.manage().window();
        driver.get("https://the-internet.herokuapp.com/");
        homepage = new HomePage(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
