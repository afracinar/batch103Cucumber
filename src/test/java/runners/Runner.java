package runners;

//BU SINIF TEST CASE'LERİ RUN ETMEK İÇİN KULLANILIR VE KONFİGURASYONLAR İÇİN KULLANILIR
//Runner class'ı features file'lar ile stepdefinitions'ları birbirine bağlar

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty", //raporların daha okunaklı olması için eklenir
                "html:target/default-cucumber-reports.html", //html raporu browser da açılır.sağ tık yapıp open in dememiz lazım
                "json:target/json-reports/cucumber.json", //json raporu üzerine çift tıklayıp açılır
                "junit:target/xml-report/cucumber.xlm" //junit raporu üzerine çift tıklayıp açılır
        },
        monochrome = true, //concole'daki bilgilerin okunaklı olmasını sağlar
        features = "./src/test/resources/features",//features folder path
        glue = {"stepdefinitions" ,"hooks"},//stepdefinitions path
        tags = "@excel_automation",
        dryRun = true

)

public class Runner {
}
