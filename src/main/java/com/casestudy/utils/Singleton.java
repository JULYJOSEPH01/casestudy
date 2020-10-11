package com.casestudy.utils;

import com.casestudy.pom.Registerform;

//import com.adactin.pom.Login;

public class Singleton {
	private Registerform rf;

		

	public Registerform getRf() {
if(rf==null) {
			
			rf=new Registerform();
	}
return rf;
	}
}
