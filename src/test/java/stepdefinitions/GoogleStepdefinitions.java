package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

import static junit.framework.TestCase.assertTrue;

public class GoogleStepdefinitions {
    String equalsPara;
    GooglePage googlePage=new GooglePage();
    @Given("Kullanici google sayfasina gider")
    public void kullanici_google_sayfasina() {
        Driver.getDriver().get("https://www.google.com");
    }
   // @Then("Cokkies i google sayfasinda kabul eder")
   // public void cokkies_i_kabul() {
       // googlePage.cokkies.click();
   // }
    @Given("Kullanici Amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get("https://www.amazon.com");
    }


    @Given("Kullanici qualityDemy sayfasina gider")
    public void kullaniciQualityDemySayfasinaGider() {
        Driver.getDriver().get("https://qualitydemy.com/");
    }


    @Then("Para birimlerinin karsilastirmasini alir")
    public void para_birimlerinin_karsilastirmasini_alir() {

        equalsPara=googlePage.paraKarsilastirmasi.getText();
        System.out.println(equalsPara);
        equalsPara=equalsPara.replaceAll(",",".");
    }

    @Then("Arama Kutusuna karsilastirma yapmak istedigi {string} para birimlerini girer")
    public void aramaKutusunaKarsilastirmaYapmakIstedigiParaBirimleriniGirer(String karsilastirilacakPara) {
        googlePage.googleSearchBox.sendKeys(karsilastirilacakPara+Keys.ENTER);
    }

    @Then("Kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Verilen degerlerin {int} den kucuk oldugunu dogrular")
    public void verilenDegerlerinDenKucukOldugunuDogrular(int verilenDeger) {
     assertTrue(Double.parseDouble(equalsPara)<verilenDeger);
    }
}