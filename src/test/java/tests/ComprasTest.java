package tests;

import factories.BrowserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.ProdutoPage;

public class ComprasTest extends BaseTest{


    @Test
    public void testCompras(){
        homePage.launchSite();
        //homePage.verificarLinkQuebrado("href");
       // homePage.verificarLinkQuebrado("src");
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
        produtoPage.deleteProduct("Pink");

       // (//a[contains(text(),'View Product')])[1]


    }
}
