import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by João on 07/06/2017.
 */
public class SearchProfileCardsInformationStedDefs {

    private WebDriver driver;
    private String URL = "";


    @Given("^the searched word exists in only one profile card$")
    public void theSearchedWordExistsInOnlyOneProfileCard() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I search for a certain word$")
    public void iSearchForACertainWord() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the profile card with the searched word is highlighted$")
    public void theProfileCardWithTheSearchedWordIsHighlighted() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I see all information related to the searched word in the respective profile card$")
    public void iSeeAllInformationRelatedToTheSearchedWordInTheRespectiveProfileCard() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the searched word exists$")
    public void theSearchedWordExists() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^that word exists in <number_of_members> profile cards$")
    public void thatWordExistsInNumber_of_membersProfileCards() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^the profile cards with the searched word are highlighted$")
    public void theProfileCardsWithTheSearchedWordAreHighlighted() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I see all information related to the searched word in each respective profile card$")
    public void iSeeAllInformationRelatedToTheSearchedWordInEachRespectiveProfileCard() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the searched word does not exist$")
    public void theSearchedWordDoesNotExist() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get feedback informing that the searched information was not found$")
    public void iGetFeedbackInformingThatTheSearchedInformationWasNotFound() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
