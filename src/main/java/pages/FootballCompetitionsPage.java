package pages;

import abstractdriver.AbstractDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;

import static customwaits.CustomPageWaits.waitForThePageToLoad;


/**
 * This is the page object class for the FootballCompetitionsPage
 * of the William Hill site this page will
 * represent functionality pertaining to the page.
 * The reason I decided to treat this sub - options as
 * a page is each sub option under football main option
 * displays different elements and options for the user
 * to select from the url link changes.
 */

public class FootballCompetitionsPage extends AbstractDriver {

    private By STAKE_INPUT = By.xpath("//input[starts-with(@id,'stake-input__')]");
    private By PLACE_BET_BUTTON = By.xpath("//input[@id='place-bet-button']");
    private By PREMIER_LEAGUE = By.xpath("  //*[@id=\"competitions-tab-content\"]/ul/li[2]/ul/li[5]/div/aside/a");
    private static By BET_SLIP_PRICE = By.xpath("//*[@class='betslip-selection__price']");
    private static By ESTIMATED_RETURNS = By.xpath("//*[starts-with(@id,'estimated-returns_')]");
    private static By  TOTAL_RETURNS =  By.xpath("//*[@id='total-to-return-price']");



    /**
     * For the selectFirstHomeTeamToWinInNinetyMins method
     * I have chosen to select the first button under the home
     * section to place the bet for the home team to win
     * in 90 mins,The question I would ask myself is the
     * button id likely to change? If not this method
     * is reusable since it does rely on the name of
     * the actual home team. It simply looks for that
     * home button when re ran.
     */


    /**
     * The enterBettingAmount method will be used to pass in a string representing the stake.
     * The amount argument taken from the parameter passed in from the feature file.
     **/
    public FootballCompetitionsPage enterBettingAmount(String amount) {
        new WebDriverWait(driver, 30000).until(waitForThePageToLoad(driver));
        WebElement stakeinput = driver.findElement(STAKE_INPUT);
        stakeinput.sendKeys(amount);
        return this;
    }

    // The clickOnPlaceBet method will be used to place the bet
    public FootballCompetitionsPage clickOnPlaceBet() {
        WebElement placebutton = driver.findElement(PLACE_BET_BUTTON);
        placebutton.click();
        return this;
    }

    /**
     * This method gets the bet slip odds displayed and prints them to console
     * ive chosen to make this method static to make it more readable at the
     * assertion point within the test.
     **/
    public static String getTheBetSlipOddsDisplayed() {
        WebElement betslip_price = driver.findElement(BET_SLIP_PRICE);
        System.out.println("The odds on the bet slip are " + betslip_price.getText());
        return betslip_price.getText();
    }


    /**
     * The getHomeTeamOddsDisplayed gets the odds displayed on button
     * the odds are also printed to the console.
     **/
    public static String getHomeTeamOddsDisplayed(String team) {
        WebElement hometeamodds = driver.findElement(By.xpath("//*[@data-name='" + team + "']"));
        System.out.println("The odds on the bet button are " + hometeamodds.getText());
        return hometeamodds.getText();
    }

    //This FootballCompetitionsPage selects the club team specified at the feature file level
    public FootballCompetitionsPage selectEnglishPremierLeagueTeam(String team) throws InterruptedException {
        new WebDriverWait(driver, 30, 2000).until(waitForThePageToLoad(driver));
        WebElement teamlink = driver.findElement(By.xpath("//*[contains(text(),'" + team + "')]"));
        teamlink.click();
        return this;

    }

    /**
     * The selectHomeTeamOdds method selects the odds for the team
     * based the team argument passed in at the feature file level
     * the method waits for the all ajax calls to be completed
     * before trying to click on the button
     **/

    public FootballCompetitionsPage selectHomeTeamOdds(String team) {
        new WebDriverWait(driver, 60).until(waitForThePageToLoad(driver));
        driver.findElement(By.xpath("//*[@data-name='" + team + "']")).click();
        return this;
    }

    //The method below returns and displays the text of the estimated returns
    public static String checkTheEstimatedReturnAmount() {
        WebElement estimatedreturns = driver.findElement(ESTIMATED_RETURNS);
        System.out.println("The estimated returns are  " + estimatedreturns.getText());
        return estimatedreturns.getText();

    }
    //The method below returns and displays the text of the total returns
    public static String checkTheTotalToReturnAmout() {
        WebElement totalreturns = driver.findElement(TOTAL_RETURNS);
        System.out.println("The total returns are  " + totalreturns.getText());
        System.out.println("");
        return totalreturns.getText();
    }

  // The method select an English premier league dropdown
    public FootballCompetitionsPage selectEnglishPremierLeague() {
        new WebDriverWait(driver, 60).until(waitForThePageToLoad(driver));
        WebElement premierleague = driver.findElement(PREMIER_LEAGUE);
        premierleague.click();
        return this;
    }

}
