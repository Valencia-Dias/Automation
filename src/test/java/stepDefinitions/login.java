package stepDefinitions;

import java.util.List;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class login {
	@Given("^User is on the landing page$")
	public void user_is_on_landing_page() throws Exception {
		System.out.println("Given statement");
	}

	@When("^User enters username  \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_sends_username_and_password(String arg1, String arg2) throws Exception {
		System.out.println("When statement");
	}

	@And("^User clicks on the submit button$")
	public void user_clicks_on_the_button() throws Exception {
		System.out.println("And statement");
	}

	@Then("^User has successfully \"([^\"]*)\"$")
	public void user_has_successfully(String arg1) throws Exception {
		System.out.println("Then statement");
	}

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page() throws Exception {
		System.out.println("NetBanking page");
	}

	@When("^User sign up with following details$")
	public void user_sign_up_with_following_details(DataTable data1) throws Exception {
		System.out.println("The datatable");
		List <List<String>>  obj=data1.raw();
		System.out.println(obj.get(0).get(0));
	    System.out.println(obj.get(0).get(1));
	    System.out.println(obj.get(0).get(2));
	    System.out.println(obj.get(0).get(3));
	    System.out.println(obj.get(0).get(4));
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Home page");
	}

	@Then("^Cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Cards");
	}

}
