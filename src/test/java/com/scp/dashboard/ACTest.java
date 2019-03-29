package com.scp.dashboard;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ACTest {

	
	@BeforeSuite
	public void m1(){
		System.out.println("inside before suite...ACTest");
	}
	@Test
	public void c1(){
		System.out.println("inside c1");
	}

	@Test
	public void c2(){
		System.out.println("inside c2");
	}
	
	@Test
	public void c3(){
		System.out.println("inside c3");
	}
	
	@Test
	public void c4(){
		System.out.println("inside c4");
	}
	
	
	@Test
	public void c5(){
		System.out.println("inside c5");
	}
	
	
	@Test
	public void c6(){
		System.out.println("inside c6");
	}
	
	@Test
	public void c7(){
		System.out.println("inside c7");
	}
	
	
	


}
