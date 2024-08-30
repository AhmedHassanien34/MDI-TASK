import io.qameta.allure.Attachment;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.testng.AllureTestNg;
import jdk.jfr.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureTestNg.class})
public class testScenarios extends baseTest {

    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }


    @Test(priority = 1)
    @Step("TestCase1")
    @Description("Verify main screen displays in 12 hours format and Fahrenheit temperature unit")
    @Severity(SeverityLevel.CRITICAL)
    public void getMainScreenWith12HoursFormatAndFahrenheitUnit() throws InterruptedException {
        mainScreen.getMainScreen();
        mainScreen.assert12HoursFormat();
        mainScreen.assertTempUnitInFahrenheit();
        takeScreenshot();

    }

    @Test(priority = 2)
    @Step("TestCase2")
    @Description("Change the time format to 24 hours")
    @Severity(SeverityLevel.NORMAL)
    public void changeTimeFormatTo24Hours(){
        mainScreen.openNavigationSettings();
        mainScreen.selectUnitSettings();
        mainScreen.changeTimeFormatTo24hours();
        mainScreen.assert24HoursFormat();
        takeScreenshot();
    }


    @Test(priority = 3)
    @Step("TestCase3")
    @Description("Change the temperature unit to Celsius")
    @Severity(SeverityLevel.NORMAL)
    public void changeTemperatureUnitToCelsius(){
        mainScreen.openNavigationSettings();
        mainScreen.selectUnitSettings();
        mainScreen.changeTempUnitToCelsius();
        mainScreen.assertTempUnitInCelsius();
        takeScreenshot();
    }

    @Test(priority = 4)
    @Step("TestCase4")
    @Description("Check rain and humidity values for the next hours")
    @Severity(SeverityLevel.MINOR)
    public void checkRainsAndHumidityValuesForNextHours(){
        int hours = 6;
        mainScreen.rainAndHumidityValues(hours);
        takeScreenshot();

    }

}
