package com.clc.java;

import java.util.Arrays;

public class TestScenario {
	public static void main(String[] args) {
		Bank bank = new HDFCBank();
		bank.m1(10);
		
		for(int i =97;i<=122;i++){
				System.out.println((char)i);
		}
		
		
	}
}

class Bank{
	/*public void m1(int i){
		System.out.println("inside bank m1..int");
	}
*/	
	public void m1(Integer i){
		System.out.println("inside bank m1..integer");
	}
	
}

class HDFCBank extends Bank{
	
	public void m1(int i){
		System.out.println("inside Hbank m1..int");
	}
	
}
