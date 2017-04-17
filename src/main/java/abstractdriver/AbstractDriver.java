package abstractdriver;


import org.openqa.selenium.WebDriver;
import static drivermanager.DriverManager.getDriver;
import static drivermanager.DriverManager.quitAll;

/**
 * This abstract driver class
 * will be used by the page object classes
 *  the driver is static and is initialized in
 *  the static block,it is created once for
 *  the HomePage. The FootballPage
 *  and the FootballCompetitionsPage will use the same static
 *  object without initializing it again.
 *  In the step definitions class,there is no WebDriver member
 *  the test should not care the WebDriver member
 *  The test should focus on the test.
 **/


public abstract class AbstractDriver {

    protected static WebDriver driver;

    static {
        driver = getDriver();
    }

    public static void tearDown() {
        quitAll();
    }


}
