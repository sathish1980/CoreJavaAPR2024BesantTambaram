package BasicofJava;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {
	
	String filePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\output.xls";
	
	String[] name={"Sathish Kumar R","Raja","Rahul"};
	
	public void WriteData() throws IOException
	{

		File F = new File(filePath);
		FileOutputStream FO= new FileOutputStream(F);
		//XSSFWorkbook wbk = new XSSFWorkbook(); // empty work book iscreated
		HSSFWorkbook wbk = new HSSFWorkbook(); // empty work book iscreated
		Sheet sheet = wbk.createSheet("input");
		
		
		for(int i=0;i<name.length;i++)
		{
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(i);
		   cell.setCellValue(name[i]);
		}
		wbk.write(FO);
		FO.close();
		System.out.println("Done");
		
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WriteExcelData W = new WriteExcelData();
		W.WriteData();
	}

}
