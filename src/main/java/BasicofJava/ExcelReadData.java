package BasicofJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReadData {
	String filePath = System.getProperty("user.dir")+"\\Input\\MakeMyTrip.xlsx";
	
	List<Object> l = new ArrayList<>();
	public List<Object> ExcelRead() throws IOException
	{
	
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		XSSFWorkbook wbk = new XSSFWorkbook(Fs);
		Sheet sheet = wbk.getSheet("validData");
		// get the totatl number of rows
		int totalRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row row = sheet.getRow(i);
			int totalColumns = row.getLastCellNum();
			//for(int j=0;j<totalColumns;j++)
			//{
				Cell cell = row.getCell(0);
				Cell cell1 = row.getCell(2);
				//Cell cell1 = row.getCell(2);
				//System.out.print(cell.getStringCellValue());
				System.out.print(GetCellValue(cell));
				System.out.print(" ");
				Object newvalue = GetCellValue(cell).toString()+"-"+GetCellValue(cell1).toString();
				l.add(newvalue);
				//System.out.print(cell.getNumericCellValue());
				//System.out.print(cell.getCellType());
			//}
			System.out.println();
		}
		Fs.close();
		return l;
		
		
	}
	
	public void GetITemPrice(String item) throws IOException
	{
		for(Object eachvalue :  ExcelRead())
		{
			System.out.println(eachvalue);
			String[] eachitems =eachvalue.toString().split("-");
			if(eachitems.length>1)
			{
				//System.out.println("The item NAme is : "+eachitems[0]);
				//System.out.println("The item price is : "+eachitems[1]);
				if(item.equalsIgnoreCase(eachitems[0]))
				{
					System.out.println("your item price is : "+eachitems[1]);
					break;
				}
				
			}
		}
	}
	
	
	public void GetExcelRead(String expectedItem) throws IOException
	{
		String HotelName =null;
	
		if(expectedItem.equalsIgnoreCase("Bangalore"))
		{
			HotelName="BLR";
		}
		else if(expectedItem.equalsIgnoreCase("Pune"))
		{
			HotelName="PNQ";
		}
		else if(expectedItem.equalsIgnoreCase("Delhi"))
		{
			HotelName="DEL";
		}
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		XSSFWorkbook wbk = new XSSFWorkbook(Fs);
		Sheet sheet = wbk.getSheet("ValidData");
		// get the totatl number of rows
		int totalRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row row = sheet.getRow(i);
			int totalColumns = row.getLastCellNum();
			
				Cell cell = row.getCell(0);
				//System.out.print(cell.getStringCellValue());
				Object item = GetCellValue(cell);
				if(item.toString().equalsIgnoreCase(HotelName))
				{
					System.out.println(GetCellValue(row.getCell(2)));
					break;
				}
				//System.out.print(cell.getNumericCellValue());
				//System.out.print(cell.getCellType());
			
			//System.out.println();
		}
		
		Fs.close();
		
		
	}
	
	public Object GetCellValue(Cell cellVal)
	{
		if(cellVal.getCellType().toString()=="STRING")
		{
			return cellVal.getStringCellValue();
		}
		else
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellVal);
			//return cellVal.getNumericCellValue();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReadData E = new ExcelReadData();
		//E.ExcelRead();
		//E.GetExcelRead("Delhi");
		E.GetITemPrice("BLR");
	}

}
