package com.clc.java;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

import javafx.scene.control.Cell;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCSV {

	public static void main(String[] args) throws IOException {
		
	readCSV();
		
		if(true)
			return;
	XSSFWorkbook workbook = new XSSFWorkbook("C:\\Users\\Yogesh\\Downloads\\SampleCSVFile_1109kb.csv");
	XSSFSheet sheet = workbook.getSheetAt(0);
	Iterator<Row> rows = sheet.rowIterator();
	while(rows.hasNext()){
		Row row = rows.next();
		Iterator<org.apache.poi.ss.usermodel.Cell> cells = row.cellIterator();
		while(cells.hasNext()){
			System.out.println(cells.next().getStringCellValue());
			
	}
		
	}
		
		
	}

	//pagination queries...
	//query optimization - -inner queries..perfomr--debug -- sql KNow
	
	private static void readCSV() throws IOException {
		//Files.lines(Paths.get("C:\\Users\\Yogesh\\Downloads\\C2ImportCalEventSample.csv"), Charset.defaultCharset()).forEach(System.out::println);
		Reader reader = Files.newBufferedReader(Paths.get("C:\\Users\\Yogesh\\Downloads\\C2ImportFamRelSample.csv"));
        @SuppressWarnings("resource")
		CSVParser csvParser = new CSVParser(reader, CSVFormat.EXCEL);
        for (CSVRecord csvRecord : csvParser) {
            // Accessing Values by Column Index
            String name = csvRecord.get(0);
            String email = csvRecord.get(1);
            String email1 = csvRecord.get(2);
            String email2 = csvRecord.get(3);
            System.out.println(name);
            System.out.println(email);
            System.out.println(email1);
            System.out.println(email2);
        }
	}
        
}