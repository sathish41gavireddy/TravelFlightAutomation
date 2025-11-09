package com.example.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;
    protected static final String BASE_URL = "src/test/resources/sample_app.html";

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("file:///" + System.getProperty("user.dir") + "/" + BASE_URL);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) driver.quit();
    }
}
