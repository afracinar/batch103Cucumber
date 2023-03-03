package stepdefinitions;

import io.cucumber.java.en.When;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @When("kullanici emaili ve sifresini girer")
    public void kullanici_emaili_ve_sifresini_girer(io.cucumber.datatable.DataTable dataTable) {

        // 1.YOL: List<String> olarak datalarımızı depolayabiliriz
//        List<String> muteriBilgisi = dataTable.row(1);
//        System.out.println(muteriBilgisi.get(0));
 //       System.out.println(muteriBilgisi.get(1));
//        loginPage.email.sendKeys(muteriBilgisi.get(0));
//        loginPage.password.sendKeys(muteriBilgisi.get(1));
//        loginPage.loginButton.click();

        // 2.YOL: Datatable'da dataları List<Map<String,String>> de depolayabiliriz
        List<Map<String,String>> musteriBilgisi = dataTable.asMaps(String.class,String.class);
        System.out.println(musteriBilgisi);
        for (Map<String,String> musteri : musteriBilgisi){
            loginPage.email.sendKeys(musteri.get("email"));
            loginPage.password.sendKeys(musteri.get("sifre"));
            loginPage.loginButton.click();
        }







    }

}
