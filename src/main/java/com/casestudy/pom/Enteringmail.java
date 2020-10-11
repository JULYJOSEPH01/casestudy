package com.casestudy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.casestudy.baseclass.Basecasestudy;

public class Enteringmail extends Basecasestudy {
		public Enteringmail() {
			PageFactory.initElements(driver1, this);
		}
		@FindBy(xpath="(//input[@type='email'])[1]")
		private WebElement email ;
		@FindBy(xpath="(//input[@type='email'])[2]")
	private WebElement confirmmail ;
		
		
		@FindBy(xpath="//button[text()='Next']")
		private WebElement nextbutton ;
		
		
		
		public WebElement getNextbutton() {
			return nextbutton;
		}

		public void setNextbutton(WebElement nextbutton) {
			this.nextbutton = nextbutton;
		}

		public WebElement getEmail() {
			return email;
		}
		
		public void setEmail(WebElement email) {
			this.email = email;
		}
		public WebElement getConfirmmail() {
			return confirmmail;
		}
		public void setConfirmmail(WebElement confirmmail) {
			this.confirmmail = confirmmail;
		}
		
}

