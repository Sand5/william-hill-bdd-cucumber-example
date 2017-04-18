package steps;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import pages.FootballCompetitionsPage;
import pages.FootballPage;
import pages.HomePage;

import static drivermanager.DriverManager.quitAll;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static pages.FootballCompetitionsPage.*;
import static pages.FootballCompetitionsPage.getHomeTeamOddsDisplayed;
import static pages.FootballCompetitionsPage.getTheBetSlipOddsDisplayed;

/**
 * This is the step definitions class
 * which will put the feature file
 * into action and runner all the steps
 * implemented for each Gherkin syntax
 * specified in this class
 **/
public class StepDefinition {

    private HomePage homepage;
    private FootballPage footballpage;
    private FootballCompetitionsPage footballcompetitionspage;

    @Before
    public void initializeTest() {
        homepage = new HomePage();
    }

    @Given("^I am on the William Hill homepage$")
    public void I_am_on_the_William_Hill_homepage() throws Throwable {
        homepage.goToHomePage();
    }

    @When("^I select the football option$")
    public void I_select_the_football_option() throws Throwable {
        footballpage = homepage.clickOnFootballPageOption();
    }

    @And("^I select the competitions option$")
    public void I_select_the_competitions_option() throws Throwable {
        footballcompetitionspage = footballpage.clickOnCompetitionsPage();
    }

    @And("^I select an english premier league club \"([^\"]*)\" and place a \"([^\"]*)\" bet$")
    public void iSelectAnEnglishPremierLeagueClubAndPlaceABet(String team, String amount) throws Throwable {
        footballcompetitionspage
                .selectEnglishPremierLeague()
                .selectEnglishPremierLeagueTeam(team)
                .selectHomeTeamOdds(team)
                .enterBettingAmount(amount)
                .clickOnPlaceBet();
    }

    @Then("^the odds and returns for club \"([^\"]*)\"  offered are displayed correctly$")
    public void theOddsAndReturnsForClubOfferedAreDisplayedCorrectly(String team) throws Throwable {
        assertThat(getHomeTeamOddsDisplayed(team),equalTo(getTheBetSlipOddsDisplayed()));
        assertThat(checkTheEstimatedReturnAmount(),equalTo(checkTheTotalToReturnAmout()));
    }

    @After
    public void terminateTest() {

        quitAll();
    }


}
