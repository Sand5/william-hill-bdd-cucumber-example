package pages;

import abstractdriver.AbstractDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import static customwaits.CustomPageWaits.waitForThePageToLoad;


/**
 * This is the page object class for the FootballPage
 * of the William Hill site this page will
 * represent functionality pertaining to the page.
 */
public class FootballPage extends AbstractDriver {


         private By COMP_LINK = By.id("nav-football-competitions");


        /**
        The FootballCompetitionsPage method clicks on the competitions sub option
         *under the football option to the left of the page. Before clicking on the
         * link a a wait is placed to check that ajax calls are not running.
         */
        public FootballCompetitionsPage clickOnCompetitionsPage() throws InterruptedException {
            new WebDriverWait(driver, 60).until(waitForThePageToLoad(driver));
            WebElement competitionslink = driver.findElement(COMP_LINK);
            competitionslink.click();
            return new FootballCompetitionsPage();

        }

}

