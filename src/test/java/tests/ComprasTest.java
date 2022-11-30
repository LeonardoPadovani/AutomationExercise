package tests;

import factories.BrowserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProdutoPage;

public class ComprasTest extends BaseTest{

    HomePage homePage;
    ProdutoPage produtoPage;

    @Before
    public void setupTest(){
        this.homePage = new HomePage(super.driver);
        this.produtoPage = new ProdutoPage(super.driver);
    }

    @Test
    public void testCompras(){
        homePage.launchSite();
        homePage.clicarMenuProduto();
        produtoPage.clicarCategKids();
        produtoPage.clicarCategKidsDress();
        produtoPage.verProdutoDressKidUm();
        produtoPage.addToCart();
        produtoPage.continueShopping();
        produtoPage.clicarCategKids();
        produtoPage.clicarCategKidsDress();
        produtoPage.verProdutoDressKidDois();
        produtoPage.addToCart();
        produtoPage.viewCart();



    }
}
