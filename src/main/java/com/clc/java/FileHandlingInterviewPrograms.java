package com.clc.java;

import java.io.IOException;

public class FileHandlingInterviewPrograms {

	public static void main(String[] args) throws IOException {
		
		
		WeekDays[] days = WeekDays.values();
		for(WeekDays d :days){
			//m1(d);
			System.out.println(d +" :  "+d.ordinal() +" : " +d.value);
		}
	}

	enum WeekDays{
		SUN("Sunday Is "),
		MON("Monday"),
		SAT("Satarday");
		
		String value;

		private WeekDays(String val) {
			this.value=val;
		}
		public String getValue() {
			return value;
		}
		public void setValue(String value) {
			this.value = value;
		}
	}
	
	
	static public void m1(WeekDays choice){
		
		switch(choice){
			case SUN:
				System.out.println("Holiday..");
				break;
			case MON:
				System.out.println("Boring day");
				break;
			case SAT:
				System.out.println("Chill out...");
				break;
			default:
				System.out.println("invalid choice..");
		}
	}
	
}

