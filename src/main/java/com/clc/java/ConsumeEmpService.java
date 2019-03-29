package com.clc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ConsumeEmpService {
	private static String SERVICE_BASE_URI ="http://localhost:8091/javamvc/api/emps/";
	
	static JSONObject requestParams = new JSONObject();
	 static{
		 requestParams.put("empId", 1); // Cast
		 requestParams.put("empName", "Singh");
		 requestParams.put("empAddress", "sdimpleuser2dd2011");
		 requestParams.put("empAge", 35);
		 requestParams.put("empSalary", 21335);
	 }
	
	public static void main(String[] args) {
		
		List<Employee> emps = getAllEmps();
		System.out.println("here are deseriazed emps ........" +emps);
		/*getSingleEmp();
		createEmp();
		modifyEmp();
		deleteEmp();
		*/
		
		
		
		
	}

	private static void deleteEmp() {
		RestAssured.baseURI =SERVICE_BASE_URI;
		 Response response= RestAssured.given().contentType("application/json").body("").delete("2");
		 System.out.println(response);
	}

	private static void modifyEmp() {
		RestAssured.baseURI =SERVICE_BASE_URI;
		 Response response= RestAssured.given().contentType("application/json").body(requestParams.toString()).put("/");
		 System.out.println(response);
	}

	private static void createEmp() {
		RestAssured.baseURI =SERVICE_BASE_URI;
		RequestSpecification request = RestAssured.given().contentType("application/json");
		 System.out.println(requestParams.toString());
		 request.body(requestParams.toString());
		 Response response = request.post("/");
		 System.out.println(response.statusCode());
		 System.out.println(response);
		 //Response response= RestAssured.given().contentType("application/json").body(requestParams.toString()).post("/");

		
	}

	private static void getSingleEmp() {
		Response response = RestAssured.get(SERVICE_BASE_URI+"2");
		System.out.println(response.asString());
	}

	private static List<Employee> getAllEmps() {
		Response response = RestAssured.get(SERVICE_BASE_URI);
		JSONArray jsonArray = new JSONArray(response.asString());
		List<Employee> listOfEmps = new ArrayList<Employee>();
		for(int i=0;i<jsonArray.length();i++){
			JSONObject obj = jsonArray.getJSONObject(i);
			listOfEmps.add(new Employee(obj.getInt("empId"), obj.getString("empName"), obj.getString("empAddress"), obj.getInt("empAge"), obj.getDouble("empSalary")));
		}
		return listOfEmps;
	}

}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Employee{
	private int empid;
	private String empName;
	private String empAddress;
	private int age;
	private double salary;
}