package cucumber;

import io.cucumber.java.en.*;


public class Demo {

	@Given("User navigates to Login Page")
	public void user_navigates_to_login_page() {
	   System.out.println(">> User got Navigated to Login Page");
	}

	@When("Uesrd enters valid Email {string}")
	public void uesrd_enters_valid_email(String emailID) {
		 System.out.println(">> User Enterd Valid Email Address "+emailID);
	}

	@When("Enters Valid Password\"{int}\"")
	public void enters_valid_password(Integer pass) {
		 System.out.println(">> User Enterd Valid Password "+pass);
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
		 System.out.println(">> User clicks on Login Button");
	}

	@Then("User Should Login Succesfully")
	public void user_should_login_succesfully() {
		 System.out.println(">> User got logedin sucessfully");
	}

	@When("Uesrd enters invalid Email {string}")
	public void uesrd_enters_invalid_email(String email) {
		 System.out.println(">> User Enterd inValid Email Address "+email);
	}

	@When("Enters invalid Password\"{int}\"")
	public void enters_invalid_password(Integer pass) {
		System.out.println(">> User Enterd inValid Password "+pass);
	}

	@Then("User Should get Proper Warrning Message")
	public void user_should_get_proper_warrning_message() {
		System.out.println(">> User got proper warrning Message");
	   
	}
	

}
