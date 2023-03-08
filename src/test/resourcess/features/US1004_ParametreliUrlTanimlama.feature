Feature: US1004 Kulanici parametre olarak girdigi Url'e gider

  Scenario: TC08 Kullanici url'i parametre olarak girebilmeli

    Given kullanici "qdUrl" anasayfaya gider
    And 3 saniye bekler
    Then  "qdUrl" sayfasine gittigini test eder
    And   sayfayi kapatir