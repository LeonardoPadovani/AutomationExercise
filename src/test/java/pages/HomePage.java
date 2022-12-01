package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.LinkUtils;

import java.util.List;
import java.util.stream.Collectors;

public class HomePage extends BasePage{


    @FindBy(css = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(2) > a:nth-child(1)")
    private WebElement menuProduto;

    @FindBy(id = "search_product")
    private WebElement search_product;

 public HomePage (WebDriver driver){
     super(driver);
 }

 public void launchSite(){
     super.driver.get("https://automationexercise.com/");
 }

 public void clicarMenuProduto(){
     this.menuProduto.click();
 }

 public void verificarLinkQuebrado(String atributo){
             List<String> list = super.driver.findElements(By.xpath("//*[@"+atributo+"]"))
             .stream()
             .map(e -> e.getAttribute(atributo))
             .filter(atr -> LinkUtils.getResponseCode(atr) != 200)
             .collect(Collectors.toList());
     list.forEach(System.out::println);

       Assert.assertEquals(list.size(),0);
 }

}
