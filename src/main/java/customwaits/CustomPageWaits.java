package customwaits;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

/**
 * This class supplies custom waiting method
 * for the page. This method has been used in
 * methods of certain pages.It was noted
 * that certain pages on the site seem to not
 * load in full like ajax was running.
 */
public class CustomPageWaits {


    public static ExpectedCondition<Boolean> waitForThePageToLoad(WebDriver driver) {

        return new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver wdriver) {
                    return ((JavascriptExecutor) wdriver).executeScript(
                            "return jQuery.active == 0").equals(true);
                }
            };
    }



}


