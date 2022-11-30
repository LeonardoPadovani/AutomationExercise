package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProdutoPage extends BasePage {

    @FindBy(linkText = "KIDS")
    private WebElement categKids;

    @FindBy(linkText = "DRESS")
    private WebElement categKidsDress;

    @FindBy(css ="a[href='/product_details/16']")
    private WebElement ViewProdutoDressKidUm;

    @FindBy(css ="a[href='/product_details/19']")
    private WebElement ViewProdutoDressKidDois;

    @FindBy(css = "button[type='button']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//button[normalize-space()='Continue Shopping']")
    private WebElement btnContinueShopping;

    @FindBy(xpath = "//u[normalize-space()='View Cart']")
        private WebElement viewCart;

    @FindBy(xpath = "//h4[normalize-space()='Added!']")
    private WebElement added;


    public ProdutoPage(WebDriver driver) {
        super(driver);
    }

    public void clicarCategKids(){
        super.executarJS("window.scrollBy(0, arguments[0])", this.categKids.getLocation().y);
        this.categKids.click();

    }
    public void clicarCategKidsDress(){
        this.categKidsDress.click();
    }

    public void verProdutoDressKidUm(){
        this.ViewProdutoDressKidUm.click();
    }

    public void verProdutoDressKidDois(){
        this.ViewProdutoDressKidDois.click();
    }

    public void addToCart(){
        this.btnAddToCart.click();
    }

    public String getAdded(){
        return this.added.getText();
    }
    public void continueShopping(){
        super.wait.until(ExpectedConditions.elementToBeClickable(this.btnContinueShopping)).click();

    }

    public void viewCart(){
        super.wait.until(ExpectedConditions.elementToBeClickable(this.viewCart)).click();

    }

    


}
