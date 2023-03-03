package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.AmazoNPage;
import utilities.Driver;

public class AmazonStepDefinition {

     AmazoNPage amazoNPage = new AmazoNPage();
    @Given("Kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);

    }
    @Given("Kullanici {string} arar")
    public void kullanici_arar(String string) {
        amazoNPage.searchBox.sendKeys(string, Keys.ENTER);
    }
    @Given("Kullanici ilk cikan gorsele tiklar")
    public void kullanici_ilk_cikan_gorsele_tiklar() {
        amazoNPage.ilkFoto.click();
    }
    @Then("Kullanici uygulamayı kapatir")
    public void kullanici_uygulamayı_kapatir() {
        Driver.closeDriver();
    }

    @Given("Kullanici ikinci cikan görsele tiklar")
    public void kullanici_ikinci_cikan_görsele_tiklar() {
        Driver.getDriver().navigate().back();
        amazoNPage.ikinciFoto.click();
    }
}
