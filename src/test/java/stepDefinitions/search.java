package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class search {
	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Given("^User is on the Home page$")
	public void user_is_on_the_Home_page() throws Exception {
		System.setProperty("webdriver.chrome.driver","/home/valencia/chromedriver");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		System.out.println("Opened");
        driver.get("https://demoqa.com/");
      //Mazimize current window
//        driver.manage().window().maximize();
	}

	@When("^He searches for forms$")
	public void he_searches_for() throws Exception {
		driver.findElement(By.className("card-body")).click();
		
	}

	@When("^Clicks on the checkbox$")
	public void items_are_added_to_the_cart() throws Exception {
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[2]/span")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/span/label/span[1]/svg")).click();
		String txt=driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/span[18]")).getText();
		System.out.println(txt);
	}



	@Then("^Closes the browser$")
	public void selected_clothes_appear_on_the_Check_out_page(String arg1) throws Exception {
		driver.close();
		driver.quit();
	    
	}


}
