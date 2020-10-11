package com.casestudy.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.casestudy.baseclass.Basecasestudy;

public class Uploadingimage extends Basecasestudy{
	public Uploadingimage() {
		PageFactory.initElements(driver1, this);
	}
	@FindBy(xpath="//label[text()='Choose a file']")
	private WebElement choosefile;
	
	@FindBy(xpath="(//*[local-name()='svg']/*[local-name()='g']/*[local-name()='path'][2])[2]")
	private WebElement closebutton;
	
	public WebElement getClosebutton() {
		return closebutton;
	}
	public void setClosebutton(WebElement closebutton) {
		this.closebutton = closebutton;
	}
	public WebElement getChoosefile() {
		return choosefile;
	}
	public void setChoosefile(WebElement choosefile) {
		this.choosefile = choosefile;
	}
	
	
	
	
}
