package com.clc.java;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;

//http://websystique.com/springmvc/spring-mvc-4-restful-web-services-crud-example-resttemplate/

public class ConsumeService {
	
	public static void main(String[] args) {
		Response response = RestAssured.get("http://localhost:8091/mvcjavaconfig/customer/");
		//System.out.println(response.asString());
		JSONArray array = new JSONArray(response.asString());
		List<Cust> listOfCusts = new ArrayList<Cust>();
		for (Object object : array) {
		//	System.out.println(object);
			JSONObject jsonOb = new JSONObject(object.toString());
			//System.out.println(jsonOb);
			Cust cust = new Cust();
			cust.setCustName(jsonOb.getString("firstname"));
			cust.setCustEmail(jsonOb.getString("email"));
			cust.setCustAddr(jsonOb.getString("address"));
			listOfCusts.add(cust);
			//{"firstname":"A111","address":"2asPune","balance":123212,"custId":111,"age":54,"email":"111yogy@gmail.com","lastname":"AAAAAAAAAAAA"}
		}

		System.out.println(listOfCusts);
		
	}

}



class Cust{
	private int custId;
	private String custName;
	private String custAddr;
	private double custBal;
	private String custEmail;
	private int custAge;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	public double getCustBal() {
		return custBal;
	}
	public void setCustBal(double custBal) {
		this.custBal = custBal;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public int getCustAge() {
		return custAge;
	}
	public void setCustAge(int custAge) {
		this.custAge = custAge;
	}
	@Override
	public String toString() {
		return "\n Cust [custId=" + custId + ", custName=" + custName
				+ ", custAddr=" + custAddr + ", custBal=" + custBal
				+ ", custEmail=" + custEmail + ", custAge=" + custAge + "]";
	}
	
	
	
	
	
}