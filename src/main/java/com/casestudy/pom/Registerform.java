package com.casestudy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.casestudy.baseclass.Basecasestudy;

public class Registerform extends Basecasestudy{
	public Registerform() {
		PageFactory.initElements(driver1, this);
	}
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement firstname ;
	@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement lastname ;

	@FindBy(xpath="//button[text()='Next']")
	private WebElement nextbutton ;
	public WebElement getNextbutton() {
		return nextbutton;
	}
	public void setNextbutton(WebElement nextbutton) {
		this.nextbutton = nextbutton;
	}
	
	
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	
}
