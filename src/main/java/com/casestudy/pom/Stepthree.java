package com.casestudy.pom;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.casestudy.baseclass.Basecasestudy;

	public class Stepthree extends Basecasestudy {
			public Stepthree() {
				PageFactory.initElements(driver1, this);
			}
			@FindBy(xpath="(//input[@type='password'])[1]")
			private WebElement password ;
			@FindBy(xpath="(//input[@type='password'])[2]")
		private WebElement confirmpassword ;
			
			
			@FindBy(xpath="//button[text()='Next']")
			private WebElement nextbutton ;


			public WebElement getPassword() {
				return password;
			}


			public void setPassword(WebElement password) {
				this.password = password;
			}


			public WebElement getConfirmpassword() {
				return confirmpassword;
			}


			public void setConfirmpassword(WebElement confirmpassword) {
				this.confirmpassword = confirmpassword;
			}


			public WebElement getNextbutton() {
				return nextbutton;
			}


			public void setNextbutton(WebElement nextbutton) {
				this.nextbutton = nextbutton;
			}
			
}
