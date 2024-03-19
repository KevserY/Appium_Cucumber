package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage(){

        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
        // import io.appium.java_client.MobileElement; ---> bu dependency ile selenium driver'ın eş zamanlı çalışmasıyla WebElement yerine MabilElement kullanabiliriz
    }

    @FindBy (xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement emailBox;

    @FindBy (xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Giriş Yap']")
    public MobileElement girisYapButon;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement girisYapildiText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yaskutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;


    public void bilgiSilme(){
        isimKutusu.clear();
        soyisimKutusu.clear();
        sehirkutusu.clear();
        yaskutusu.clear();
        meslekKutusu.clear();
    }

    public void textBoxVeriGirme(String isim,String soyisim,String sehir,String yas,String meslek){
        bilgiSilme();
        isimKutusu.sendKeys(isim);
        soyisimKutusu.sendKeys(soyisim);
        sehirkutusu.sendKeys(sehir);
        yaskutusu.sendKeys(yas);
        meslekKutusu.sendKeys(meslek);

        ReusableMethods.scrollWithUiScrollable("Kaydet");
    }

    public void textBoxKontrol(String isim,String soyisim,String sehir,String yas,String meslek){
        Assert.assertTrue(isimKutusu.getText().contains(isim));
        Assert.assertTrue(soyisimKutusu.getText().contains(soyisim));
        Assert.assertTrue(sehirkutusu.getText().contains(sehir));
        Assert.assertTrue(yaskutusu.getText().contains(yas));
        Assert.assertTrue(meslekKutusu.getText().contains(meslek));
    }


    public void ucCizgiTiklamaMethodu() throws InterruptedException {
        ReusableMethods.wait(5);
        ReusableMethods.koordinatTiklamaMethodu(107,130,500);
    }


    public void ilkEkranOrtakAdimlari(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme,String girisText) throws InterruptedException {
        ReusableMethods.wait(2);
        for (int i = for1; i < forSart; i++) {
            ReusableMethods.scrollScreenMethod(x1,y1,wait,x2,y2,bekleme);
        }
        ReusableMethods.scrollWithUiScrollable(girisText);
    }


    public void ilkEkranAyarlamalari() throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            ReusableMethods.scrollScreenMethod(880,1400,750,150,1400,500);
        }
        ReusableMethods.scrollWithUiScrollable("Giriş Yap");
    }




}
