package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

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

    @FindBy(tagName = "tr")
    private WebElement tableTr;

    @FindBy(tagName = "td")
    private WebElement tableTd;

    @FindBy(className = "cart_delete")
    private WebElement btnCartDelete;


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

    public void deleteProduct(String product){
        super.driver.findElements(By.tagName("tr")).stream()
                .skip(1)
                .map(tr -> tr.findElements(By.tagName("td")))
                .filter(tdList -> tdList.get(1).getText().contains(product))
                .map(tdList -> tdList.get(5))
                .map(td -> td.findElement(By.cssSelector(".cart_quantity_delete")))
                .forEach(WebElement::click);

    }


}
