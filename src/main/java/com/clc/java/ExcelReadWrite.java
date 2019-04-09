package com.clc.java;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadWrite {
	
	public void m1(float d,double i){
		System.out.println("double,int");
	}
	
	public void m1(double d,float i){
		System.out.println("int,double");
	}
	
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		
		System.out.println("Git Changes");
		System.out.println("Git Changes");
		System.out.println("Git Changes");
		System.out.println("Git Changes");
		
		List<UserInfo> listOfUsers = new ArrayList<UserInfo>();
		UserInfo userinfo = null;
		for(int i=0;i<100;i++){
			userinfo  = new UserInfo(i,"amit"+i,"admin123"+i, "remarks"+i, "message"+i);
			listOfUsers.add(userinfo);
		}
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("userinfo");
		
		
		for(int i=0;i<listOfUsers.size();i++){
			Row row = sheet.createRow(i);
			
			UserInfo uinfo= listOfUsers.get(i);
			
			Cell snoCell = row.createCell(0);
			Cell usernameCell = row.createCell(1);
			Cell passwordCell = row.createCell(2);
			Cell messageCell = row.createCell(3);
			Cell remarksCell = row.createCell(4);
			
			snoCell.setCellType(CellType.NUMERIC);
			usernameCell.setCellType(CellType.STRING);
			messageCell.setCellType(CellType.STRING);
			remarksCell.setCellType(CellType.STRING);
			passwordCell.setCellType(CellType.STRING);
			
			snoCell.setCellValue(uinfo.getsNo());
			usernameCell.setCellValue(uinfo.getUsername());
			passwordCell.setCellValue(uinfo.getPassword());
			remarksCell.setCellValue(uinfo.getRemarks());
			messageCell.setCellValue(uinfo.getMessage());
			
			
		}
		
		
		
		
		FileOutputStream fileOutputStream = new FileOutputStream("newExcel.xlsx");
		workbook.write(fileOutputStream);
		
		
		
		
		
	}


	
}



class UserInfo{
	private int sNo;
	private String username;
	private String password;
	private String remarks;
	private String message;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "\n UserInfo [sNo=" + sNo + ", username=" + username
				+ ", password=" + password + ", remarks=" + remarks
				+ ", message=" + message + "]";
	}
	public UserInfo(int sNo, String username, String password, String remarks,
			String message) {
		super();
		this.sNo = sNo;
		this.username = username;
		this.password = password;
		this.remarks = remarks;
		this.message = message;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
