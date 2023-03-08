package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepdefinitions {
    GooglePage googlePage=new GooglePage();

    @Given("Kullanici google anasayfasina gider")
    public void kullanici_google_anasayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

    }
    @Then("arama kutusuna Selenium yazar ve enter tusuna basar")
    public void arama_kutusuna_selenium_yazar_ve_enter_tusuna_basar() {
       googlePage.aramaKutusu.sendKeys("Selenium"+ Keys.ENTER);
    }


}
