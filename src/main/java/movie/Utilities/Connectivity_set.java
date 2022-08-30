package movie.Utilities;
import static org.testng.AssertJUnit.assertEquals;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Connectivity_set extends Page_Factory {
	static WebDriver driver;
	JavascriptExecutor js;
	String Imdb_country = "";
	String Wiki_country = "";
	String Imdb_release_date = "";
	String Wiki_release_date = "";



	
	public Connectivity_set(WebDriver driver) {
		Connectivity_set.driver=driver;
		driver_init(driver);
		
	}
	
	Logger log = LogManager.getLogger("Connectivity_set.class");

	
public WebDriver setup_Chrome(WebDriver driver) {
		
		driver= new ChromeDriver();
		driver.get("https://www.imdb.com/");
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebDriver User_enters_the_search_terms_in_the_search_bar(WebDriver driver) {
		
		searchbar.sendKeys("Pushpa");
		return driver;
	   
	}
	
public WebDriver User_clicks_on_the_search_icon(WebDriver driver) {
		
		searchicon.click();
		return driver; 
	}

public WebDriver User_selects_Pushpa_Part_1_from_the_options(WebDriver driver) {
	
	pushpa.click();
	return driver; 
}

	public WebDriver User_checks_the_Extract_Country_and_Release_date_on_Imdb(WebDriver driver) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", extract_country_imdb);
		 Imdb_country = extract_country_imdb.getText();
		 String Expected_Imdb_country = "India";
		 Assert.assertEquals(Expected_Imdb_country, Imdb_country);
		System.out.println(extract_country_imdb.getText());
		log.info("The Origin Coutry as per the IMDB is = " + Imdb_country);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		release_date_navigator.click();
		js.executeScript("arguments[0].scrollIntoView(true);", india_release_date_imdb);
		System.out.println(india_release_date_imdb.getText());
		Imdb_release_date = india_release_date_imdb.getText();
		log.info("The Release date of Pushpa:The Rise as per the IMDB is = " + Imdb_release_date);
		
		return driver; 
		
	}
	
	public WebDriver User_navigates_to_the_Wiki_website(WebDriver driver) {
		
		//ArrayList<String> tabs = new ArrayList<String>  (driver.getWindowHandles());
		//driver.switchTo().window(tabs.get(1));
		driver.get("https://www.wikipedia.org/");
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		return driver; 
	}
	
public WebDriver User_enters_the_search_terms_in_the_search_bar_in_wikipedia(WebDriver driver) {
		
		wikisearchbar.sendKeys("Pushpa The Rise");
			
		return driver; 
	}

public WebDriver User_clicks_on_the_search_icon_in_Wikipedia(WebDriver driver) {
	
	wikisearchicon.click();	
	return driver; 
}

public WebDriver User_selects_Pushpa_Part_1_from_the_search_result(WebDriver driver) {
	
	pushpa_wiki.click();	
	return driver; 
}

public WebDriver User_checks_the_Extract_Country_and_Release_date_on_Wiki(WebDriver driver) {
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", extract_country_wiki);
	System.out.println(extract_country_wiki.getText());
	 Wiki_country = extract_country_wiki.getText();
	log.info("The Origin Coutry as per the Wikipedia is = " + Wiki_country);
	System.out.println(india_release_date_wiki.getText());
	 Wiki_release_date = india_release_date_wiki.getText();
	log.info("The Release date of Pushpa:The Rise as per the Wikipedia is = " + Wiki_release_date);
	return driver; 
	
}

public WebDriver User_compares_the_Release_date_and_Extract_Country(WebDriver driver) {
	
	 Assert.assertEquals(Imdb_country, Wiki_country);
	 System.out.println("Both the websites have the same Extract Country = "+"India");
	 Assert.assertEquals(Imdb_release_date, Wiki_release_date);
	 System.out.println("Both the websites have the same Date of release = "+"17 December 2021");
	return driver;  
}
	
	

}

