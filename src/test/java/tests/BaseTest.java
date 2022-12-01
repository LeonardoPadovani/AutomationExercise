package tests;

import com.google.common.util.concurrent.Uninterruptibles;
import factories.BrowserFactory;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.ProdutoPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    protected static HomePage homePage;
    protected static ProdutoPage produtoPage;

    protected WebDriver driver;


    @Before
    public void setupBrowser(){
        this.driver = BrowserFactory.getDriver("chrome");
        homePage = new HomePage(this.driver);
        produtoPage = new ProdutoPage(this.driver);
    }

    @After
    public void quitDriver(){
        Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
        this.driver.quit();
    }


}
