package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    HOOKS:
    Her bir Scenario veya Scenario Outline'dan ÖNCE veya SONRA çalışmasını istediğimiz methodlarını (@Before @After)içeri
    Burada önemli olan raporlama işleminin ekran görüntüsüyle birlikte Hooks yardımıyla yapılmasıdır
     */

    @Before
    public void setUpScenarios() {
        System.out.println("Before Metotu");

    }

    //after metodunda rapor ve screenshot koyarız bu yüzden before'a göre daha çok kullanılır
    @After
    public void tearDownScenarios(Scenario scenario) {
        System.out.println("After Metotu");
        //eğer bir scenario fail ederse ekran görüntüsü al ve rapora ekle
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //             ekran görüntüsü        file tipi            ekran görüntüsünün adı
            scenario.attach(failedScreenshot, "image/png", "failed_scenario" + scenario.getName());
            Driver.closeDriver();
        }
    }
}