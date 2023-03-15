package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {

       /*
        Pages class'lari surekli kullandigimiz locate'leri
        tekrar tekrar locate etmek zorunda kalmaktan kurtulmak icin kullanilir
        Her pages class'i Driver class'inda olusturulan driver'i kullanir
        @FindBy notasyonunun Driver class'indaki webDriver'i kullanabilmesi icin
        bu class'a tanitmamiz gerekiyor
        bunun icin her pages sayfasi ilk olusturuldugunda
        basina parametresiz bir constructor olusturup
        icerisinde driver'i bu class'a tanitiyoruz.
     */

    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//*[text()='Reject all']")
    public WebElement cokkies;

    @FindBy(xpath = "//input[@class='gLFyf']")
    public WebElement googleSearchBox;

    @FindBy(xpath = "//span[@class='DFlfde SwHCTb']")
    public WebElement paraKarsilastirmasi;
}