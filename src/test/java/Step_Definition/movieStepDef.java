package Step_Definition;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;



import movie.Utilities.*;

public class movieStepDef {
	
Logger log = LogManager.getLogger("movieStepDef.class");
	
	public static WebDriver driver;
	
	@Given("User Navigates to the Imdb website")
	public void User_Navigates_to_the_Imdb_website() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver = ob.setup_Chrome(driver);  
	}

	@When("User enters the search terms in the search bar")
	public void User_enters_the_search_terms_in_the_search_bar() {
		
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_enters_the_search_terms_in_the_search_bar(driver);
		log.info("*****************Entering 'Pushpa' in Search Bar********************");
	}

	@Then("User clicks on the search icon")
	public void User_clicks_on_the_search_icon() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_clicks_on_the_search_icon(driver);
		log.info("**************User clicked on the Search Icon after entering the Movie Name*********************");
	}
	
	@Then("User selects Pushpa Part 1 from the options")
	public void User_selects_Pushpa_Part_1_from_the_options() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_selects_Pushpa_Part_1_from_the_options(driver);
		log.info("**************User clicked on the Part 1 of the movie from the result options*********************");
	}
	
	@Then("User checks the Extract Country and  Release date on Imdb")
	public void User_checks_the_Extract_Country_and_Release_date_on_Imdb() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_checks_the_Extract_Country_and_Release_date_on_Imdb(driver);
		log.info("**************User checks the Extract Country and release date of the movie*********************");
	}
	
	@Then("User navigates to the Wiki website")
	public void User_navigates_to_the_Wiki_website() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_navigates_to_the_Wiki_website(driver);
		log.info("**************User navigates to Wikipedia *********************");
	}
	
	@Then("User enters the search terms in the search bar in wikipedia")
	public void User_enters_the_search_terms_in_the_search_bar_in_wikipedia() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_enters_the_search_terms_in_the_search_bar_in_wikipedia(driver);
		log.info("**************User enters the search terms in the Wikipedia search bar *********************");
	}
	
	@Then("User clicks on the search icon in Wikipedia")
	public void User_clicks_on_the_search_icon_in_Wikipedia() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_clicks_on_the_search_icon_in_Wikipedia(driver);
		log.info("**************User clicks on the Search button beside the searchbar *********************");
	}
	
	@Then("User selects Pushpa Part 1 from the search result")
	public void User_selects_Pushpa_Part_1_from_the_search_result() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_selects_Pushpa_Part_1_from_the_search_result(driver);
		log.info("**************User selects Pushpa Part 1 from the search result in the Wikipedia Search*********************");
	}
	
	@Then("User checks the Extract Country and Release date on Wiki")
	public void User_checks_the_Extract_Country_and_Release_date_on_Wiki() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_checks_the_Extract_Country_and_Release_date_on_Wiki(driver);
		log.info("**************User checks the Extract Country and release date of the movie on Wikipedia*********************");

	}
	
	@Then("User compares the Release date and Extract Country")
	public void User_compares_the_Release_date_and_Extract_Country() {
		Connectivity_set ob=new Connectivity_set(driver);
		driver=ob.User_compares_the_Release_date_and_Extract_Country(driver);
		log.info("**************User compares the Release Date and the Extract Country from both IMDB and Wikipedia*********************");
	}
	

}
