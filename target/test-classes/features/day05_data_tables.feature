@data_tables
  Feature: data_tables
    Scenario: TC01_musteri_giris_testi
      Given kullanici "https://www.bluerentalcars.com/login" gider
      # | | -> datatable oluşturmak için kullanılır.DataTables Scenario Outline ile de kullanılabilir.
      When kullanici emaili ve sifresini girer
        | email                         | sifre     |
        | sam.walker@bluerentalcars.com | c!fas_art|
      And close the application