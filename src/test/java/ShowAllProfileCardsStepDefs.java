import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by João on 07/06/2017.
 */
public class ShowAllProfileCardsStepDefs {

    private static WebDriver driver;
    private static String baseUrl;

//    static {
//        Logger.getLogger("").setLevel(Level.OFF);
//        System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
//        System.setProperty("webdriver.edge.driver", "drivers\\MicrosoftWebDriver.exe");
//        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//        System.setProperty("phantomjs.binary.path", "drivers\\phantomjs.exe"); //
//        if (driver == null) {
//            driver = new HtmlUnitDriver();
//            baseUrl = "";
//        }
//    }

//    @Given("^I navigate to the main page$")
//    public void iNavigateToTheMainPage() throws Throwable {
//        driver.get(URL);
//    }

    //method that makes the site url a parameter
    @Before
    public void setUp() throws Exception {
        Logger.getLogger("").setLevel(Level.OFF);
        driver = new HtmlUnitDriver();
        //baseUrl = String.valueOf(System.getProperty("baseUrl"));
        if(baseUrl==null)
            baseUrl = "TO BE FILLED";

        System.out.println("Base URL is: " + baseUrl);
    }

//    @Before
//    public void setUp() throws Exception {
//        driver = new FirefoxDriver();
//        baseUrl = "TO BE FILLED";
//        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }

    @Given("^is the first time accessing the website$")
    public void isTheFirstTimeAccessingTheWebsite() throws Throwable {
        // VERIFY IF IT IS THE FIRST TIME ACESSING THE PAGE
    }

    @And("^the profile cards have a default configuration on what information is shown$")
    public void theProfileCardsHaveADefaultConfigurationOnWhatInformationIsShown() throws Throwable {
        // CHECK IF THE 4 BIG DETAILS ARE SELECTED
    }

    @When("^main page is reached$")
    public void mainPageIsReached() throws Throwable {
        // CHECK IF IT WAS REDIRECTED TO THE MAIN PAGE
    }

    @Then("^I see all profile cards according to the default configuration$")
    public void iSeeAllProfileCardsAccordingToTheDefaultConfiguration() throws Throwable {
        // CHECK IF THE 4 BIG DETAILS ARE BEING SHOWN
    }


    @Given("^Member has information in all existing fields$")
    public void memberHasInformationInAllExistingFields() throws Throwable {
        // CHECK IF THERE IS INFO IN THE 4 BIG DETAILS
    }

    @Then("^I see all profile cards with information about the respective member$")
    public void iSeeAllProfileCardsWithInformationAboutTheRespectiveMember() throws Throwable {
        // CHECK IF THE 4 BIG DETAILS ARE BEING SHOWN
    }


    @Given("^a member doesn't have information for one or more fields$")
    public void aMemberDoesnTHaveInformationForOneOrMoreFields() throws Throwable {
        // CHECK IF A DETAIL IS EQUAL TO ""
    }

    @Then("^every field without information of that profile card will display a message saying that the information was not found$")
    public void everyFieldWithoutInformationOfThatProfileCardWillDisplayAMessageSayingThatTheInformationWasNotFound() throws Throwable {
        // CHECK IF FEEBBACK IS BEING GIVEN
    }


    @Given("^all members are confirmed$")
    public void allMembersAreConfirmed() throws Throwable {
        // CONFIRM == TRUE ?!
    }

    @When("^I check profile cards$")
    public void iCheckProfileCards() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I see all profile cards according to their predefined configuration$")
    public void iSeeAllProfileCardsAccordingToTheirPredefinedConfiguration() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("^the member <memberName> is not able to attend due to <reason>$")
    public void theMemberMemberNameIsNotAbleToAttendDueToReason() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^other members are able to attend to the conference$")
    public void otherMembersAreAbleToAttendToTheConference() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I check the main page$")
    public void iCheckTheMainPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I get feedback saying that <memberName> is unable to attend due to <reason>$")
    public void iGetFeedbackSayingThatMemberNameIsUnableToAttendDueToReason() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
