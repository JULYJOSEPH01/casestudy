package com.casestudy.testrunner;



import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import com.casestudy.baseclass.Basecasestudy;
import com.casestudy.utils.Loadproperty;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","json:\\Casestudy\\src\\test\\resource\\com\\casestudy\\JVMreport\\reoprt\\cucumber-report1.json",
	"junit:Casestudy/src/test/resource/com/casestudy/report/cucumber-report1.xml",
		"html:Casestudy/src/test/resource/com/casestudy/report/cucumber-report1.html"
		},
		
 
		features="src\\test\\java\\com\\casestudy\\feature\\Casestudy.feature",
		glue= {"com.casestudy.stepdefinition"},
 tags= "@Sc11"		
		)
public class Testrunner  extends Basecasestudy{
	public static WebDriver driver1;
	@BeforeClass
	public static void initialization() throws Exception {
		Loadproperty lp=new Loadproperty();

driver1=getBrowser(lp.getBrowserName());
getUrl(lp.getURL());
	}	
@AfterClass
public static void driverquit() {
	driver1.quit();
	//Cucumberjvmreport.getReport();
}	
}
