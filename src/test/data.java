package test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class data {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		//Identify Testcases coloum by scanning the entire 1st row
		//once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		//after you grab purchase testcase row = pull all the data of that row and feed into test

		System.out.println("data");
		//fileInputStream argument
		

		FileInputStream fis=new FileInputStream("E://softwares//Work//demodata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);

		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
		
		if(workbook.getSheetName(i).equalsIgnoreCase("testdata"))
		{
		XSSFSheet sheet=workbook.getSheetAt(i);
		//Identify Testcases coloum by scanning the entire 1st row

		Iterator<Row>  rows= sheet.iterator();// sheet is collection of rows
		Row firstrow= rows.next();
		Iterator<Cell> ce=firstrow.cellIterator();//row is collection of cells
		int k=0;
		int coloumn = 0;
		while(ce.hasNext())
		{
		Cell value=ce.next();

		if(value.getStringCellValue().equalsIgnoreCase("Testcases"))
		{
		coloumn=k;

		}

		k++;
		}
		System.out.println(coloumn);

		////once coloumn is identified then scan entire testcase coloum to identify purcjhase testcase row
		while(rows.hasNext())
		{

		Row r=rows.next();

		if(r.getCell(coloumn).getStringCellValue().equalsIgnoreCase("Purchase"))
		{

		////after you grab purchase testcase row = pull all the data of that row and feed into test

		Iterator<Cell>  cv=r.cellIterator();
		while(cv.hasNext())
		{
		System.out.println( cv.next().getStringCellValue());
		
		}
		}


		}









		}
		}
		

		}
		
		
	}


