package com.casestudy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Loadproperty {
	static Properties prop= new Properties();
	
	public Loadproperty() throws IOException {
		File f=new File(System.getProperty("user.dir")+"\\src\\test\\resource\\configuration\\configuration.properties");
		FileInputStream fin=new FileInputStream(f);
		prop.load(fin);
	} 
	
	public String getBrowserName() {
		String property = prop.getProperty("browserName");
		return property;
		
	}
	public String getURL() {
		String property = prop.getProperty("url");
		return property;
	}
	public String getimplictWait() {
		String property = prop.getProperty("ImplicitWait");
		return property;
	}
		
	
	

}
