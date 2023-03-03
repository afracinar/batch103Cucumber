package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.DataTablesPage;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablesPage dataTablesPage =new DataTablesPage();

    @Given("kullanici {string} gider")
    public void kullanici_gider(String string) {
        Driver.getDriver().get(string);
    }

    @When("kullanici new butonuna tiklar")
    public void kullanici_new_butonuna_tiklar() {
        //dataTablesPage.newButton.click();
        Driver.waitAndClick(dataTablesPage.newButton,5); //5 saniye kadar element tıklaması için dinamik olarak bekler
    }
    @When("kullanici first name {string} girer")
    public void kullanici_first_name_girer(String string) {
      //  dataTablesPage.firstName.sendKeys(string);
        Driver.waitAndSendText(dataTablesPage.firstName,string,5);//firstname'e yazı yazabilmek için 5 saniye dinamik olarak bekle
    }
    @When("kullanici last name {string} girer")
    public void kullanici_last_name_girer(String string) {
        dataTablesPage.lastName.sendKeys(string);
    }
    @When("kullanici positions {string} girer")
    public void kullanici_positions_girer(String string) {
        dataTablesPage.position.sendKeys(string);
    }
    @When("kullanici office {string} girer")
    public void kullanici_office_girer(String string) {
        dataTablesPage.office.sendKeys(string);
    }
    @When("kullanici extension {string} girer")
    public void kullanici_extension_girer(String string) {
        dataTablesPage.extension.sendKeys(string);
    }
    @When("kullanici start_date {string} girer")
    public void kullanici_start_date_girer(String string) {
        dataTablesPage.startDate.sendKeys(string);
    }
    @When("kullanici salary {string} girer")
    public void kullanici_salary_girer(String string) {
         dataTablesPage.salary.sendKeys(string);
    }
    @When("kullanici create buttonuna basar")
    public void kullanici_create_buttonuna_basar() {
         dataTablesPage.createButton.click();
    }

    @When("kullanici firstname ile {string} arar")
    public void kullanici_firstname_ile_arar(String string) {
        dataTablesPage.search.sendKeys(string, Keys.ENTER);
    }
    @Then("firstname {string} in olustugunu test et")
    public void firstname_in_olustugunu_test_et(String string) {
        Driver.wait(1);
        Assert.assertTrue(Driver.waitAndGetText(dataTablesPage.name,5).contains(string)); //text'ini almak için 5 saniye bekle
    }
}

