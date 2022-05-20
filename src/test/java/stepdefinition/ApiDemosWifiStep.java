package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiDemosPage;
import utilities.Driver;

public class ApiDemosWifiStep {

    ApiDemosPage apiDemosPage = new ApiDemosPage();

    @Given("Preference butonuna tikla")
    public void preference_butonuna_tikla() {
        apiDemosPage.preference.click();
    }
    @Given("prefence deopendenciese tikla")
    public void prefence_deopendenciese_tikla() {
        apiDemosPage.prefence3.click();
    }
    @Given("wifi check box a tikla")
    public void wifi_check_box_a_tikla() {
        apiDemosPage.checkBox.click();
    }
    @Given("wifi setting e tikla")
    public void wifi_setting_e_tikla() {
        apiDemosPage.wifiSetting.click();
    }
    @Given("acilan text box a {string} metnini yaz")
    public void acilan_text_box_a_metnini_yaz(String string) {
        apiDemosPage.edit.sendKeys(string);
    }
    @Then("Ok butonuna tikla")
    public void ok_butonuna_tikla() {
        apiDemosPage.okButton.click();
        Driver.closeDriver();
    }
}
