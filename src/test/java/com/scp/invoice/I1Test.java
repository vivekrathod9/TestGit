package com.scp.invoice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class I1Test {
	
	@DataProvider(name="data")
	static public Object[][] testData(){
		Object [][] obs = new Object[5][3];
		obs[0][0]="A0";
		obs[0][1]="B0";
		obs[0][2]="C0";
		
		obs[1][0]="A1";
		obs[1][1]="B1";
		obs[1][2]="C1";
				
		obs[2][0]="A2";
		obs[2][1]="B2";
		obs[2][2]="C2";
				
		obs[3][0]="A3";
		obs[3][1]="B3";
		obs[3][2]="C3";
				
		obs[4][0]="A4";
		obs[4][1]="B4";
		obs[4][2]="C4";

		return obs;
	}
	
	
	@Test
	@Parameters({"whichenv"})
	public void m1(String whichEnv){
		System.out.println(whichEnv);
		
	}
	
	@Test(dependsOnMethods={"Invoice14","abc"},ignoreMissingDependencies=true)
	public void Invoice(String a,String b,String c){
		System.out.println(a +" : " +b +" : " +c);
		System.out.println("inside Invoice14");
	}
	
	
	@Test(dataProvider="data")
	public void Invoice14(String a,String b,String c){
		System.out.println(a +" : " +b +" : " +c);
		System.out.println("inside Invoice14");
	}
	
	
	@Test(expectedExceptions={ArithmeticException.class})
	public void Invoice15(){
		System.out.println("inside Invoice15");
		int i=10/0;
	}
	
	
	
	
	
	/*


	
	
	
	@Test(groups={"aa","bc"})
	public void Invoice11(){
		System.out.println("inside Invoice11");
	}

	@Test
	public void Invoice12(){
		System.out.println("inside Invoice12");
	}
	
	@Test(groups={"ab","bc","aa"})
	public void Invoice13(){
		System.out.println("inside Invoice13");
	}
	
	@Test
	public void Invoice14(){
		System.out.println("inside Invoice14");
	}
	
	
	@Test
	public void Invoice15(){
		System.out.println("inside Invoice15");
	}
	
	
	@Test
	public void Invoice16(){
		System.out.println("inside Invoice16");
	}
	
	@Test
	public void Invoice17(){
		System.out.println("inside Invoice17");
	}
	
	
	

*/}
