package com.clc.java;

import java.sql.Date;

public class TestClonning {

	//https://howtodoinjava.com/java/cloning/a-guide-to-object-cloning-in-java/
	//getter setters -- are the public members of a class -- which provides an access to private fields 
		//with validation support --  single entry and exit managed

	//Why  -- object creation is costly in java, so you should clone the objects
		//--Shallow Clonning
		//ms--DeepClonning
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Address ad1 = new Address(123123,"Pune");
		Date dt = new Date(2018);
		
		Emp originalOb = new Emp(10,"A",12000,ad1,dt);
		Emp clonnedOb = originalOb.clone();
		
		System.out.println(originalOb);
		System.out.println(clonnedOb);
		
		System.out.println("after change");
		
		originalOb.getDate().setYear(2020);;
		
		/*originalOb.getAddress().setCity("Mumbai");  //-- Object
		originalOb.getAddress().setPinCode(1111);
		originalOb.setEmpId(121);
		originalOb.setEmpName("B");
		originalOb.setEmpSalary(15000);
		*/
		System.out.println(originalOb);
		System.out.println(clonnedOb);
		
	}
	
	

}

class Address implements Cloneable{
	private int pinCode;
	private String city;
	
	
	
	
	@Override
	protected Address clone() throws CloneNotSupportedException {
		return (Address)super.clone();
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}
	
	
	
	
}

//POJO bean entity
class Emp implements Cloneable{
	private int empId;
	private String empName;
	private double empSalary;
	private Address address;
	private Date date;

	
	
	public void setDate(Date date) {
		this.date = date;
	}




	@Override
	protected Emp clone() throws CloneNotSupportedException {
		Emp clonnedEmp =  (Emp)super.clone(); //emp
		
		Address clonnedAddress = clonnedEmp.getAddress().clone(); //
		clonnedEmp.setAddress(clonnedAddress);
		
		Date dt = new Date(clonnedEmp.getDate().getTime());
		clonnedEmp.setDate(dt);
		
		return clonnedEmp;
		
	}
	

	
	
	public Date getDate() {
		return date;
	}




	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSalary="
				+ empSalary + ", address=" + address + ", date=" + date + "]";
	}




	public Emp(int empId, String empName, double empSalary, Address address,
			Date date) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.address = address;
		this.date = date;
	}


		
	
	
	
	
	
	
}

/**
Clone -- 

 


*/