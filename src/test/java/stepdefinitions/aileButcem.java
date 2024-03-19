package stepdefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class aileButcem {
    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    AileButcemPage aileButcemPage = new AileButcemPage();


    @Given("ilk ekran ayarlarini yapin {int} {int} {int} {int} {int} {int} {int} {int} ve ardindan login {string} sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(int for1,int forSart,int x1,int y1,int wait,int x2,int y2, int bekleme, String girisText) throws InterruptedException {
        // x 880, y 1400(sabit) ---> x 150, y 1400(sabit)
        //--> method kullanmadan
        //TouchAction action = new TouchAction<>(driver);
        //action.press(PointOption.point(880,1400)).moveTo(PointOption.point(150,1400)).release().perform();

        // method ile ve dinamik, içinde sayısal-manuel girilen bir değer yok.tüm değerler features'dan alınıyor. :
        aileButcemPage.ilkEkranOrtakAdimlari(for1,forSart,x1,y1,wait,x2,y2,bekleme,girisText);
    }

    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail,String password) {
        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(mail));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.wait(2);
        aileButcemPage.girisYapButon.click();
    }

    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {


    }


    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {

    }


    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {

    }


    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }


}
