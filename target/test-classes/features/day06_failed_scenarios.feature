@failed_scenario
Feature: hooks_test

  Background: googlea_git
    Given kullanici google gider

    #bu scenariolar bilerek fail ettik.raporlarda fail durumunda ekran görüntüsü eklenmiş olacaktır

  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarin "çay" icerdigini dogrula
    Then close the application


  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then sonuclarin "toros" icerdigini dogrula
    Then close the application