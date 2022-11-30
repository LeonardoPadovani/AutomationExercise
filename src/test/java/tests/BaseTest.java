package tests;

import com.google.common.util.concurrent.Uninterruptibles;
import factories.BrowserFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected WebDriver driver;


    @Before
    public void setupBrowser(){
        this.driver = BrowserFactory.getDriver("chrome");
    }

    @After
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
        this.driver.quit();
    }


}
