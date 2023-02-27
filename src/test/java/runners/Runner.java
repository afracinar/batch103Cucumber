package runners;

//BU SINIF TEST CASE'LERİ RUN ETMEK İÇİN KULLANILIR VE KONFİGURASYONLAR İÇİN KULLANILIR
//Runner class'ı features file'lar ile stepdefinitions'ları birbirine bağlar

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions" ,//stepdefinitions path
        tags = "@parametre",
        dryRun = false
)

public class Runner {

}
