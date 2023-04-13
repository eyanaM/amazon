package AmazonStepDeff;

import com.Actions.qa.BestSellerPageActions;
import com.Actions.qa.HomeDecorPageActions;
import com.Actions.qa.HomePageActons;
import com.Actions.qa.VideoGamesPageActons;
import com.AmzonUtility.qa.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;



public class amazonStefDeffClass extends BaseClass{
	HomePageActons homePageActons = new HomePageActons();
	HomeDecorPageActions homeDecorPageActions = new HomeDecorPageActions();
	BestSellerPageActions bestSellerPageActions = new BestSellerPageActions();
	VideoGamesPageActons videoGamesPageActons = new VideoGamesPageActons();
	
	@Given("^lauch Application <\"([^\"]*)\">$")
	public void lauch_Application(String URL) throws Throwable {
		launchURL(URL);
            Thread.sleep(60000);       
	}

	@Then("^Enter Homedecor on seach field$")
	public void enter_Homedecor_on_seach_field() throws Throwable {
		homePageActons.enterHomedecoronseachfield();
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
		homePageActons.clicksearchbutton();
	}

	@Then("^Verify Homedecor page is Displayed$")
	public void verify_Homedecor_page_is_Displayed() throws Throwable {
		homeDecorPageActions.verifyHomedecorpageisDisplayed();
	}

	@Then("^click the best seller$")
	public void click_the_best_seller() throws Throwable {
		homeDecorPageActions.clickthebestseller();
	}

	@Then("^scrolldown$")
	public void scrolldown() throws Throwable {
		bestSellerPageActions.scrolldowntothebestseller();
	   
	}

	@Then("^click videoGames lick$")
	public void click_videoGames_lick() throws Throwable {
		bestSellerPageActions.clickvideoGameslick();
	   
	}

	@Then("^Vesrify Video Games page is display\\.$")
	public void vesrify_Video_Games_page_is_display() throws Throwable {
		videoGamesPageActons.VesrifyVideoGamespageisdisplay();
	}



}
