package com.casestudy.stepdefinition;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebElement;

import com.casestudy.baseclass.Basecasestudy;
import com.casestudy.pom.Uploadingimage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Imageautomation extends Basecasestudy{
	public static Uploadingimage ui;
	
@Then("Verify user should login he application")
public void verify_user_should_login_he_application() {
    
	ui=new Uploadingimage();
}

@Then("Verify user should click on Chooseafile text")
public void verify_user_should_click_on_Chooseafile_text() throws InterruptedException {
	clickOnElement(ui.getChoosefile());
   Thread.sleep(2000);
}



@Then("Verify user should select filename containing image")
public void verify_user_should_select_filename_containing_image() throws InterruptedException {
        try {
        	//Setting clipboard with file location
            setClipboardData("C:\\Users\\doniv08\\image\\resulttest.png");
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
	
	
	
	Thread.sleep(6000);

		
		}

@When("verify user should observe upload image suceessfully")
public void verify_user_should_observe_upload_image_suceessfully() {
}




@Then("Verify user should click on close button")
public void verify_user_should_click_on_close_button() throws InterruptedException {
	mouseover(ui.getClosebutton());
	Thread.sleep(10000);
}




@When("Verify user should remove image successfully")
public void verify_user_should_remove_image_successfully() {
}













}
