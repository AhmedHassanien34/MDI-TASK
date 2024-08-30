import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeTest;
import pages.MainScreen;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {

    public AppiumDriver driver;
    public MainScreen mainScreen;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        URL url = new URL("http://127.0.0.1:4723/wd/hub");  // Ensure it's http, not https unless your server explicitly supports HTTPS
        String path = System.getProperty("user.dir") + "/apps/WeatherForecast.apk";

        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("Android");
        options.setDeviceName("emulator-5554");
        options.setPlatformVersion("10");
        options.setAutomationName("UiAutomator2");

        // Set the path to the app (.apk file)
        options.setApp(path);

        // Automatically grant permissions
        options.setAutoGrantPermissions(true);

        // Initialize the driver with the specified options
        driver = new AndroidDriver(url, options);

        mainScreen = new MainScreen(driver);
    }
}
