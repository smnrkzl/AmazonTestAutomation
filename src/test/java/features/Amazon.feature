Feature: Amazon.com
  Scenario: Amazon.com ürün ekleme
    Given Anasayfaya git
    When Cookie kabul et
    When Arama inputuna tıkla
    When Ürün ismini yaz
    When Arama butonuna tıkla
    When Birinci ürüne tıkla
    When Sepete ekle
    When Sepet sayfasını aç