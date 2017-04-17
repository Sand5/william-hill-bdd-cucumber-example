package drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

/**
 * Created by Sanderson
 * Driver manager class
 * is used to control the
 * drivers that are used in
 * the test locally and in CI.
 **/
public abstract class DriverManager {

    //We declare vairous member variables to use in the class

    private static WebDriver _driver;
    private final static String DEFAULT_VALUE = "CHROME";
    public static final String WEBDRIVERKEY = "driver";
    private static Browsers usethisbrowser = null;

    /**
     * I have created a set of browser enums to ensure use to only
     * those browsers that the manager recognizes.
     */
    public enum Browsers {

        CHROME("chrome"),
        FIREFOX("firefox");


        private String value;

        Browsers(String value) {
            this.value = value;
        }

        public String getBrowser() {
            return value;
        }
    }

    /**
     * We use the getDriver method to check
     * against a system property or an
     * environment or a default with the get
     * getPropertyOrGetEnv method. The property
     * can be set during the test but used the -D parameter
     * or use the environment variables in the config
     * setup of the IDE under run edit configurations.
     **/
    public static WebDriver getDriver() {

        String property = getPropertyOrGetEnv(WEBDRIVERKEY, DEFAULT_VALUE);

        if (usethisbrowser == null) {

            switch (property) {


                case "CHROME":
                    usethisbrowser = Browsers.CHROME;
                    break;


                case "FIREFOX":
                    usethisbrowser = Browsers.FIREFOX;
                    break;


                default:
                    throw new RuntimeException("Unknown browser in " + WEBDRIVERKEY + " manager class");

            }

        }
        if (_driver == null)


        {
            //We check on browser to use and based on that setup the driver
            switch (usethisbrowser) {


                case CHROME:
                    setUpChrome();
                    ChromeOptions o = new ChromeOptions();
                    o.addArguments("disable-extensions");
                    o.addArguments("disable-infobars");
                    _driver = new ChromeDriver(o);
                    System.out.println("The browser that is starting up is " + usethisbrowser);
                    System.out.println("");
                    break;


                case FIREFOX:
                    _driver = new FirefoxDriver();
                    System.out.println("The browser that is about to start is " + usethisbrowser);
                    break;

                //If the browser is not in the enum list we throw an exception at runtime.

                default:
                    throw new RuntimeException("Unknown Browser");


            }
        }
        return _driver;


    }

    /**
     * The quit all method is used to shut the instance of the driver
     * Once the method is called on the @After annotation in the step definition class
     **/
    public static WebDriver quitAll() {

        if (_driver != null) {

            System.out.println("The " + usethisbrowser + " " +
                    "browser is shutting down");
            _driver.quit();
            _driver = null;

        }
        return _driver;
    }

    /**
     * The setup setUpChrome method sets the chrome property
     * we have the ability to amend the path of the chrome
     * I have kept in the drivers.exe folder the same
     * method is applied for Firefox depending on the version
     * of Firefox used and WebDriver.
     */
    private static void setUpChrome() {

        String s = File.separator;
        String userdir = System.getProperty("user.dir");
        String fullpath = userdir + String.format("%ssrc%smain%sresources%sdrivers.exe%schromedriver.exe", s, s, s, s, s);
        final String CHROMEDRIVER = "webdriver.chrome.driver";
        System.setProperty(CHROMEDRIVER, new File(fullpath).getAbsolutePath());

    }

   /**
    *We check that we have have a property set or an environment variable set
    * if not we use a default which is set as member variable.
    * If none of the above have been set then we output a message
    * to the console as to the issue faced.
    */

    private static String getPropertyOrGetEnv(String property, String defaults) {

        String browser = System.getProperty(property);

        if (browser == null) {

            System.out.println("Cannot not find the property using the value " + property);
            browser = System.getenv(property);

            if (browser == null) {

                System.out.println("Cannot find the Environment variable using the value " + property + " using the default " + defaults);
                browser = defaults;

                if (browser == null ^ browser == "")
                    System.out.println("There are no defaults that have been set");
            } else {

                System.out.println("Using the environment variable with the value " + browser);

            }
        } else {

            System.out.println("Using the property " + property + "with the value " + browser);
        }
        return browser;
    }

}
