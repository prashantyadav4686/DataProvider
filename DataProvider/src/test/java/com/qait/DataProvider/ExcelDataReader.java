package com.qait.DataProvider;
import java.io.File;
import java.io.FileInputStream;

import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelDataReader {
	//static String[][] data;
	public int i,j;
	private static HSSFWorkbook wb;
  public Object[][] readExcelData() throws Exception{
	 File src = new File("/home/qainfotech/datasheet.xls");
	 FileInputStream fis = new FileInputStream(src);
	 wb = new HSSFWorkbook(fis);
	 Sheet sheet = wb.getSheetAt(0);
	/* Iterator<Row> rowIterator = sheet.iterator();
	 while (rowIterator.hasNext())
     {
		 Row row = rowIterator.next();
		 Iterator<Cell> cellIterator = row.cellIterator();
		 while (cellIterator.hasNext())
         {
             Cell cell = cellIterator.next();
             System.out.print(cell.getStringCellValue() + "\t");
     }
      System.out.println();*/
	 int rowcount = sheet.getLastRowNum()-sheet.getFirstRowNum() +1;
	 Row row = sheet.getRow(i);
	 int cellcount = row.getLastCellNum();
	 Object Data[][]= new Object[rowcount][cellcount];
	 System.out.println("Number of rows are "+rowcount);
	 System.out.println("Number of columns are " +cellcount);
	 for( i=0;i<rowcount;i++){
		 for( j=0;j<cellcount;j++) {	 
	    Data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
 }
}
	return Data;
}}  


