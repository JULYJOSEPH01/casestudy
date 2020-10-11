package com.casestudy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.casestudy.baseclass.Basecasestudy;

public class Stepfour extends Basecasestudy  {
		public Stepfour() {
			PageFactory.initElements(driver1, this);
		}
		@FindBy(xpath="//input[@type='checkbox']")
		private WebElement accept;
		
		
		
		@FindBy(xpath="//button[text()='Previous']")
		private WebElement previous;
		
		public WebElement getPrevious() {
			return previous;
		}
		public void setPrevious(WebElement previous) {
			this.previous = previous;
		}
		public WebElement getAccept() {
			return accept;
		}
		public void setAccept(WebElement accept) {
			this.accept = accept;
		}
		

	}

