 @scenario_outline_1
Feature: arama_feature_2

  Background: googlea_git
    Given kullanici google gider

    Scenario Outline: arama_testi

      #Scenario: -> Scenario Outline: a dönüşüyor
      #"" -> "<sutun_ismi>" ne dönüşüyor
      #Examples kelimesi Scenario Outline'dan sonra kullanılmalı.Example verilerin kullanıldığı yerdir

      When kullanici "<product>" icin arama yapar
      Then sonuclarin "<product>" icerdigini dogrula
      Then close the application

      Examples: data
      | product |
      | iphone  |
      |  tv     |
      | tesla   |
      | flower  |
      | cat     |
      | dog     |
