package com.payroll.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	static FileInputStream f;// FIleInputStream is class
	static XSSFWorkbook w;
	static XSSFSheet s;

	public static String readStringData(int row, int col) throws IOException {
		f = new FileInputStream("C:\\Users\\Karthik\\Desktop\\PayrollExcelData.xlsx");
		w = new XSSFWorkbook(f);
		s = w.getSheet("PayrollDataRead");
		Row r = s.getRow(row);// Row Is interface
		Cell c = r.getCell(col);
		return c.getStringCellValue();
	}

	public static String readIntegerData(int row,int col) throws IOException {
		  f=new FileInputStream("C:\\Users\\Karthik\\Desktop\\PayrollExcelData.xlsx"); 
		  w=new  XSSFWorkbook(f); 
		  s=w.getSheet("PayrollDataRead"); 
		  Row r=s.getRow(row);//Row Is interface 
		  Cell c=r.getCell(col); 
		  int v=(int) c.getNumericCellValue();
		  return String.valueOf(v); }

}