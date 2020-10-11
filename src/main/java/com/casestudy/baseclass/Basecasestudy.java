package com.casestudy.baseclass;


	import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.nativekey.KeyEvent;

	//import com.adactin.utils.Loadproperty;


			public class Basecasestudy {
		public static WebDriver driver1;
		public static WebDriver getBrowser(String browserName) throws Exception {
			try {
			
		//	Loadproperty lp=new Loadproperty();
			
			try {
				
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resource\\com\\casestudy\\drivers\\chromedriver.exe");
		driver1= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\doniv08\\eclipse-workspace\\seljava\\driver\\chromedriver (2).exe");
			driver1= new FirefoxDriver();	
		}
		else if(browserName.equalsIgnoreCase("InternetExplorer")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\doniv08\\eclipse-workspace\\seljava\\driver\\chromedriver (2).exe");
			driver1= new InternetExplorerDriver();
		}
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		}
		 catch (Exception e) {
			 System.out.println("invalid browser");
			}
		

	//	driver1.manage().timeouts().implicitlyWait(Long.parseLong(lp.getimplictWait()),TimeUnit.SECONDS);
		return driver1;

		} catch (Exception e) {
			throw new Exception();
		}		
		}
	public static void getUrl(String url) {
		driver1.get(url);
	}
	public static  String title(String title) {
	driver1.get(title);	
	return title;	
	}
	public static void wait4visibilityelement(WebElement element) {
		WebDriverWait wb= new WebDriverWait(driver1,30) ;
			wb.until(ExpectedConditions.visibilityOf(element));
	}
	public static void sendkeys(WebElement element,String value) {
		wait4visibilityelement(element);
		boolean displayed = element.isDisplayed();
		boolean enabled = element.isEnabled();
		if(displayed&&enabled) {
			element.clear();
			element.sendKeys(value);
		}
	}
	public static void clickOnElement(WebElement element) {
		wait4visibilityelement(element);
		boolean displayed = element.isDisplayed();
		if(displayed) {
		element.click();
	}
	}
	public static void toCaptureScreeSshot(String filename) throws IOException {
	File f= new File("C:\\Users\\doniv08\\git\\seliniumproject\\Cucmberproject\\src\\test\\resource\\Screenshot\\"+filename+".png");
	TakesScreenshot ts= (TakesScreenshot)driver1;
	File temp= ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(temp,f);
	}
	
	
	public static void uploadingimage(WebElement element,String string) throws IOException {
		
		wait4visibilityelement(element);
		boolean displayed = element.isDisplayed();
		if(displayed) {
		
		 element.sendKeys("C:\\Users\\doniv08\\image\\resulttest.png"); 
	
		}
	}
	
	
	public static void setClipboardData(String string) {
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public static void mouseover(WebElement element) {
		wait4visibilityelement(element);
		boolean displayed = element.isDisplayed();
		if(displayed) {	
	Actions ac= new Actions(driver1);
	ac.moveToElement(element).click().build().perform();
	}
	}
	public static void doubleclick(WebElement element) {
		wait4visibilityelement(element);
		boolean displayed = element.isDisplayed();
		if(displayed) {	
	Actions ac= new Actions(driver1);
	ac.doubleClick(element).build().perform();
	}
	}	
		public static void contextclick(WebElement element) {
			wait4visibilityelement(element);
			boolean displayed = element.isDisplayed();
			if(displayed) {	
		Actions ac= new Actions(driver1);
		ac.contextClick(element).build().perform();
		}
			
		
		
	}
		public static void select(WebElement element,String option) {
			Select category= new Select(element );
			category.selectByValue(option);
	}

		public static void alert(WebElement element) throws Exception {
			try {
			Alert a = driver1.switchTo().alert();
				a.accept();
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Unable to accept the alert");
			}
		}
		public static void quit() {
			driver1.quit();
		}

		public static boolean elementIsDisplayed(WebElement element) throws Exception {
			try {
				boolean displayed = element.isDisplayed();
				return displayed;
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Element is not displayed");
			}
		}

	}



