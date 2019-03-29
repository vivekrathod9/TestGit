package com.scp.login;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPositiveTest {


	@BeforeTest
	public void pqr(){
		System.out.println("inside before test pqr..!");
	}
	
	@Test(groups={"aa","bc"})
	public void LoginP1(){
		System.out.println("inside LoginP1");
	}

	@Test(groups={"ab","bc"})
	public void LoginP2(){
		System.out.println("inside LoginP2");
	}
	
	@Test(priority=1)
	public void LoginP3(){
		System.out.println("inside LoginP3");
	}
	
	@Test()
	public void LoginP4(){
		System.out.println("inside LoginP4");
	}
	
	
	@Test
	public void LoginP5(){
		System.out.println("inside LoginP5");
	}
	
	
	@Test
	public void LoginP6(){
		System.out.println("inside LoginP6");
	}
	
	@Test
	public void LoginP7(){
		System.out.println("inside LoginP7");
	}
	
	
	

	
}
