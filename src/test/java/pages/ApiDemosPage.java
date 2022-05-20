package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApiDemosPage extends BasePage {

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement prefence3;

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement checkBox;

    @AndroidFindBy(xpath = "(//*[@class=\"android.widget.TextView\"])[4]")
    public WebElement wifiSetting;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement edit;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;

}
