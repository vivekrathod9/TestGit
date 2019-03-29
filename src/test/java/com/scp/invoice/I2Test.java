package com.scp.invoice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class I2Test {
	


	@Test
	public void Invoicetwo1(){
		System.out.println("inside Invoicetwo1");
	}

	@Test
	public void Invoicetwo2(){
		System.out.println("inside Invoicetwo2");
	}
	
	@Test
	public void Invoicetwo3(){
		System.out.println("inside Invoicetwo3");
	}
	
	@Test
	public void Invoicetwo4(){
		System.out.println("inside Invoicetwo4");
	}
	
	
	@Test
	public void Invoicetwo5(){
		System.out.println("inside Invoicetwo5");
	}
	
	
	@BeforeSuite
	public void m11(){
		System.out.println("inside before suite...I2Test");
	}
	
	
	@AfterTest
	public void pqr(){
		System.out.println("inside after test pqr..!");
	}
	
	@BeforeMethod
	public void xb(){
		System.out.println("before method i2");
	}
	
	@BeforeSuite
	public void m12(){
		System.out.println("inside before suite...I2Test");
	}
	

	
	@Test(dataProvider="data",dataProviderClass=I1Test.class)
	public void Invoicetwo6(String a,String b,String c){
		System.out.println(a +" : " +b +" : " +c);
		System.out.println("inside Invoicetwo6");
	}
	
	@Test(groups={"ab"})
	public void Invoicetwo7(){
		System.out.println("inside Invoicetwo7");
	}
	
	
	


}
