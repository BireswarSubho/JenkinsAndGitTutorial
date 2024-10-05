package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;

public class SearchTshirt {
	
	
	public WebDriver driver;
	@Given("user is on google home page")
	public void user_is_on_google_home_page() {
	   
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		
	}
	@And("user search {string} in google")
	public void user_search_amazon_in_google(String str) {
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).click();
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(str);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(Keys.ENTER);
	   
	}
	@And("user have to select the first option")
	public void user_have_to_select_the_first_option() {
	   
		driver.findElement(By.xpath("//a[@class='sVXRqc']")).click();
	}
	@When("user search {string} in searchbox of amazon")
	public void user_search_allen_solly_in_searchbox_of_amazon(String str2) throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(str2+Keys.ENTER);
		Thread.sleep(5000);
	    
	}
	@Then("user landed the list of product")
	public void user_landed_the_list_of_product() {
	   
	}
	@And("user verify the list")
	public void user_verify_the_list() {
	    
		driver.quit();
	}


}
