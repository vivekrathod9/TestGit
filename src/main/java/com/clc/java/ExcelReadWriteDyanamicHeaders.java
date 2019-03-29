package com.clc.java;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteDyanamicHeaders {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		File file =new File("C:\\Users\\Yogesh\\Desktop\\userdata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("info");

		User user = null;
		List<User> listOfUsers = new ArrayList<>();
		List<String> headers =new ArrayList<>();
		
		Iterator<Row> rowIterator = sheet.rowIterator();		
		
		while(rowIterator.hasNext()){
			Row row = rowIterator.next();  //header
			if(headers.isEmpty()){
				headers = builderHeaders(row);
				continue; //skip header row
			}
			//password	S.No	username	message

			user = new User();
			Iterator<Cell> cellIterator= row.cellIterator();
			int cellCount = 0;
			
			while(cellIterator.hasNext()){
				
				Cell cell = cellIterator.next();
				
				switch (headers.get(cellCount).toUpperCase()) {
				case "S.NO":
						user.setUserId((int)cell.getNumericCellValue());
						break;
				case "USERNAME":
					user.setUsername(cell.getStringCellValue())	;
					break;
				case "PASSWORD":
					user.setPasword(cell.getStringCellValue());
						break;
				case "MESSAGE":
					user.setMessage(cell.getStringCellValue());
						break;
				case "REMARKS":
					user.setRemarks(cell.getStringCellValue());
					break;
				case "COMMENTS":
					user.setComments(cell.getStringCellValue());
					break;
				default:
						System.out.println("not matching header found...");
						break;
				}
				cellCount++;
			}
			listOfUsers.add(user);
		}
	
		System.out.println(listOfUsers);
		
	}

	private static List<String> builderHeaders(Row headerRow) {
		List<String> headers = new ArrayList<String>();
		
		Iterator<Cell> cellIterator = headerRow.cellIterator();
		
		
		while(cellIterator.hasNext()){
			Cell cell = cellIterator.next();
			if(cell.getCellType() == 0){
				headers.add(cell.getNumericCellValue()+"");
			}else if(cell.getCellType()== 1){
				headers.add(cell.getStringCellValue());
			}
		}
		System.out.println(headers);
		return headers;
	}
}


class User{
	int userId;
	String username;
	String pasword;
	String message;
	String remarks;
	String comments;
	
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasword() {
		return pasword;
	}
	public void setPasword(String pasword) {
		this.pasword = pasword;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	@Override
	public String toString() {
		return "\n User [userId=" + userId + ", username=" + username
				+ ", pasword=" + pasword + ", message=" + message
				+ ", remarks=" + remarks + ", comments=" + comments + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String username, String pasword, String message) {
		super();
		this.userId = userId;
		this.username = username;
		this.pasword = pasword;
		this.message = message;
	}
	
	
	
}