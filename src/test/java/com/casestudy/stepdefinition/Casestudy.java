package com.casestudy.stepdefinition;



import com.casestudy.baseclass.Basecasestudy;
import com.casestudy.pom.Enteringmail;
import com.casestudy.pom.Registerform;
import com.casestudy.pom.Stepfour;
import com.casestudy.pom.Stepthree;
import com.casestudy.utils.Singleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Casestudy extends Basecasestudy{
	public static Registerform rf;
	public static Enteringmail em;
	public static Stepthree st;
	public static Stepfour sf;
	
	Singleton sp= new Singleton();
	//public static Location lc;
@Given("User login the application")
public void user_login_the_application() throws InterruptedException {
	Thread.sleep(3000);
	rf=new Registerform();
	em= new Enteringmail();
	st=new Stepthree();
	sf=new Stepfour();
}


@Then("verify user should  enter {string} in specific textbox")
public void verify_user_should_enter_in_specific_textbox(String string) {
	 sendkeys(sp.getRf().getFirstname(),string);
 
}



@Then("Verify user shoud enter {string} in textbox")
public void verify_user_shoud_enter_in_textbox(String string) {
	sendkeys(sp.getRf().getLastname(),string);
 
}
@Then("click on the next button")
public void click_on_the_next_biutton() {
	clickOnElement(sp.getRf().getNextbutton());
 
}
@When("click into new page")
public void click_into_new_page() {
   
 
}






@Then("Verify user should enter mailid in specific textbox")
public void verify_user_should_enter_mailid_in_specific_textbox() {
	sendkeys(em.getEmail(),"julytilda21@gmail.com");
    
}



@Then("Verify user should enter mailid in confirmemail textbox")
public void verify_user_should_enter_mailid_in_confirmemail_textbox() {
	sendkeys(em.getConfirmmail(),"julytilda21@gmail.com");
    
}



@Then("Verify user should click on the next button")
public void verify_user_should_click_on_the_next_button() {
	clickOnElement(em.getNextbutton());
}



@When("Verify user should enter into new page")
public void verify_user_should_enter_into_new_page() {
}









@Then("Verify user should enter password in specific textbox")
public void verify_user_should_enter_password_in_specific_textbox() {
  sendkeys(st.getPassword(),"Jubilee1990");

}



@Then("Verify user should enter password in confirmpassword  textbox")
public void verify_user_should_enter_password_in_confirmpassword_textbox() {
	 sendkeys(st.getConfirmpassword(),"Jubilee1990");

}





@Then("Verify user should click on the next named button")
public void verify_user_should_click_on_the_next_named_button() {
	
	clickOnElement(st.getNextbutton());
}





@When("Verify user should observe new page")
public void Verify_user_should_observe_new_page() {
   
 
}




@Then("Verify user should click on checbox for accepting user agreement")
public void verify_user_should_click_on_checbox_for_accepting_user_agreement() {
    
	clickOnElement(sf.getAccept());
}



@Then("user should click on previous button")
public void user_should_click_on_previous_button() {
	clickOnElement(sf.getPrevious());
   
}
@When("user should navigate to prevoius page")
public void user_should_navigate_to_prevoius_page() {
    
   
}





}