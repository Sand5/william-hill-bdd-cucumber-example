package pages;


import abstractdriver.AbstractDriver;
import environment.Environments.Environment;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import static environment.Environments.getEnvironment;

/**
 * This is the page object class for the Homepage
 * of the William Hill site this page will
 * represent functionality pertaining to the page
 **/
public class HomePage extends AbstractDriver {

    private By FOOTBALL_LINK = By.linkText("Football");

    //Simple navigation method to go to the homepage to open the web application.
    public void goToHomePage() {
        driver.navigate().to(getEnvironment(Environment.QA));
    }


    // The clickOnFootballPageOption method selects the football option to the left of the screen
    public FootballPage clickOnFootballPageOption() {
        WebElement footballink = driver.findElement(FOOTBALL_LINK );
        new WebDriverWait(driver,9000).until(ExpectedConditions.visibilityOf(footballink)).click();
        return  new FootballPage();

    }



}
