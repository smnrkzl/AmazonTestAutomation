package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.tr.Ama;
import org.openqa.selenium.WebDriver;
import pages.AmazonPages;
import util.DriverFactory;

public class stepDefinitions {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);
    @Given("Anasayfaya git")
    public void anasayfayaGit() {
        AmazonPages.HomePage();
    }

    @When("Cookie kabul et")
    public void cookieKabulEt() {
        AmazonPages.acceptcookie();
    }

    @When("Arama inputuna tıkla")
    public void aramaInputunaTıkla() {
        AmazonPages.clickSearchInput();
    }

    @When("Ürün ismini yaz")
    public void ürünIsminiYaz() {
        AmazonPages.writeProductName();
    }

    @When("Arama butonuna tıkla")
    public void aramaButonunaTıkla() {
        AmazonPages.searcButton();
    }

    @When("Birinci ürüne tıkla")
    public void birinciÜrüneTıkla() {
        AmazonPages.firstProduct();
    }

    @When("Sepete ekle")
    public void sepeteEkle() {
        AmazonPages.addtoCart();
    }

    @When("Sepet sayfasını aç")
    public void sepetSayfasınıAç() {
        AmazonPages.cartPage();
    }
}
