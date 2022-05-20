package utilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> driver;
    public static String userName = "ishakengl_qjScA2";
    public static String accessKey = "pP6DVzNyi4eyByAxW8qF";
    public static AndroidDriver<AndroidElement> get(){
        if (driver==null){
            String platform = ConfigurationReader.get("platform");
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            switch (platform){
                case "android":

                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "8.0");
                    desiredCapabilities.setCapability("deviceName", "Pixel_2");
                    desiredCapabilities.setCapability("automationName", "UiAutomator2");
                    desiredCapabilities.setCapability("app", "C:\\Users\\ishks\\IdeaProjects\\com.ApidemosCucumber\\apidemos.apk");
                    try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                case "browserstack":

                    desiredCapabilities.setCapability("os_version", "11.0");
                    desiredCapabilities.setCapability("device", "Samsung Galaxy S21");
                    desiredCapabilities.setCapability("app", "bs://c396c46e3ba236c37cc25b0bf3ff232c7efeabd7");
                    try {
                        driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                    break;
                default:

            }
        }
        return driver;
    }

    public static void closeDriver() {
        if (driver!=null){
            driver.quit();
            driver=null;
        }
    }
}
