@amazon_urun_arama
Feature: Urun_Arama

  Scenario Outline: TC01_urun_arama

      Given Kullanici "https://www.amazon.com" gider
      And Kullanici "<urun>" arar
      And Kullanici ilk cikan gorsele tiklar
      And Kullanici ikinci cikan görsele tiklar
      Then Kullanici uygulamayı kapatir

    Examples: urun
    |urun|
    |araba|
    |motor|
    |kazak|
    |kalem|
