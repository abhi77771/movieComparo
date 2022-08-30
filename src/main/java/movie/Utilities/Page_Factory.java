package movie.Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Factory {
	
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='suggestion-search']")
	WebElement searchbar; 
	
	@FindBy(xpath="//button[@id='suggestion-search-button']//*[@id='iconContext-magnify']")
	WebElement searchicon;
	
	@FindBy(xpath="//input[@id='searchInput']")
	WebElement wikisearchbar; 
	
	@FindBy(xpath="//i[contains(text(),'Search')]")
	WebElement wikisearchicon;
	
	@FindBy(xpath="//a[contains(text(),'Pushpa: The Rise - Part 1')]")
	WebElement pushpa;
	
	@FindBy(xpath="//body/div[@id='content']/div[@id='bodyContent']/div[@id='mw-content-text']/div[3]/ul[1]/li[1]/div[1]/a[1]")
	WebElement pushpa_wiki;
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/section[9]/div[2]/ul[1]/li[2]/div[1]/ul[1]/li[1]/a[1]")
	WebElement extract_country_imdb;
	
	@FindBy(xpath="//body/div[@id='__next']/main[1]/div[1]/section[1]/div[1]/section[1]/div[1]/div[1]/section[9]/div[2]/ul[1]/li[1]/a[2]/*[1]")
	WebElement release_date_navigator;
	
	@FindBy(xpath="//body[1]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[6]/td[2]")
	WebElement india_release_date_imdb;
	
	@FindBy(xpath="//td[contains(text(),'India')]")
	WebElement extract_country_wiki;
	
	@FindBy(xpath="//body[1]/div[3]/div[3]/div[5]/div[1]/table[1]/tbody[1]/tr[12]/td[1]/div[1]/ul[1]/li[1]")
	WebElement india_release_date_wiki;
	
	@FindBy(className="nav-input")
	WebElement nav_input; 
	
	@FindBy(xpath="//span[@class = 'a-size-base a-color-base a-text-bold' and contains(text(),'Headphone Connection Type')]")
	WebElement scrollelement; 
	
	@FindBy(xpath="//span[@class = 'a-size-base a-color-base' and contains(text(),'Bluetooth Wireless')]")
	WebElement bluetooth;
	
	@FindBy(id="low-price")
	WebElement box1;
	
	@FindBy(id="high-price")
	WebElement box2;
	
	@FindBy(xpath="//input[@class='a-button-input']")
	WebElement search;
	
	@FindBy(xpath="//div[@class='a-section a-spacing-small a-spacing-top-small']")
	WebElement text;
	
	@FindBy(id="s-result-sort-select")
	WebElement sort;
	
	
	@FindBy(xpath="//span[@class='a-dropdown-prompt']")
	WebElement Feature_click;
	
	
	
	@FindBy(id="s-result-sort-select_3")
	WebElement result_sort;
	
	@FindBy(xpath="//span[@class='a-size-base a-color-base a-text-bold' and contains(text(),'Avg. Customer Review')]")
	WebElement review;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	 List<WebElement> list1;
	
	public void driver_init(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }
	

}

