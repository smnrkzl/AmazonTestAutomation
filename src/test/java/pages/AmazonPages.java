package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class AmazonPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By cookieaccept = By.xpath("//div[@class = 'sp-cc-buttons']");
    static By searchinput = By.xpath("//div//input[@id= 'twotabsearchtextbox']");
    static By searchbutton = By.xpath("//div//input[@id= 'nav-search-submit-button']");
    static By firstproduct = By.xpath("//div//img[@src= 'https://m.media-amazon.com/images/I/71uoG-y-bEL._AC_UL400_.jpg']");
    static By addtocartbutton = By.xpath("//div//input[@id= 'add-to-cart-button']");
    static By cartpagebutton = By.xpath("//div[@id= 'nav-cart-count-container']");

    public AmazonPages(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }

    public static void HomePage(){

    }

    public static void acceptcookie(){
        elementHelper.click(cookieaccept);
    }

    public static void clickSearchInput(){
        elementHelper.click(searchinput);
    }

    public static void writeProductName(){
        elementHelper.sendKey(searchinput,"monster");
    }

    public static void searcButton(){
        elementHelper.click(searchbutton);
    }

    public static void firstProduct(){
        elementHelper.click(firstproduct);
    }

    public static void addtoCart(){
        elementHelper.click(addtocartbutton);
    }

    public static void cartPage(){
        elementHelper.click(cartpagebutton);
    }







}
