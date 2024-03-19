package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
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
