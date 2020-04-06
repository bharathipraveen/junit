package org.test;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.test.base.Baseclass;
import org.test.pom.FacebookLogin;

public class FaceBook extends Baseclass{
	@BeforeClass
	public static void lanchbrowser() {
		lanchBrowser();
		loadurl("https://www.facebook.com/");
	}
	@Before
	public void starttime() {
		Date d=new Date();
		System.out.println(d);
		}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
		
	}
	@Test
	public void testcase1() {
	 FacebookLogin f=new FacebookLogin();
	 type(f.getUsername(),"enoch123");
	 type(f.getPass(),"122");
	 login(f.getLogin());
	  
		
		}
	
	  
	
	
	
	
}
