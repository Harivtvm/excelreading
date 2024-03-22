package Excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNew {
static FileInputStream f;
static XSSFWorkbook w;
static XSSFSheet s;
public static String getstringdata(int a,int b) throws IOException {
	f=new FileInputStream("C:\\Users\\User\\Desktop\\Student.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheetAt(0);
	Row r=s.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
	
}
public static double getnumericdata(int a,int b) throws IOException {
	f=new FileInputStream("C:\\Users\\User\\Desktop\\Student.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheetAt(0);
	Row r=s.getRow(a);
	Cell c=r.getCell(b);
	return c.getNumericCellValue();
	
}
	

}
