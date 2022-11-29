package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(css = "div.header-middle div.container div.row div.col-sm-8 div.shop-menu.pull-right ul.nav.navbar-nav li:nth-child(2) > a:nth-child(1)")
    private WebElement menuProduto;


 public HomePage (WebDriver driver){
     super(driver);
 }

 public void launchSite(){
     super.driver.get("https://automationexercise.com/");
 }

 public void clicarMenuProduto(){
     this.menuProduto.click();
 }

}
