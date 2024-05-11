package com.demo_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String filePath="C:\\Users\\HP\\Downloads\\mysheet.xlsx";
		FileInputStream fileInputStream=new FileInputStream(filePath);
		XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=rows;r++) {
			XSSFRow row=sheet.getRow(r);
			for(int c=0;c<cols;c++) {
				XSSFCell cell=row.getCell(c);
				System.out.print(cell+"\t");
			}
			System.out.println();
		}
		workbook.close();

	}

}
