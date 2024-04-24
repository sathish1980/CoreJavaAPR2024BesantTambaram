package BasicofJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ExcelReadData {
	String filePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\MakeMyTrip.xlsx";
	
	
	public void ExcelRead() throws IOException
	{
	
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		XSSFWorkbook wbk = new XSSFWorkbook(Fs);
		Sheet sheet = wbk.getSheet("InvalidData");
		// get the totatl number of rows
		int totalRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row row = sheet.getRow(i);
			int totalColumns = row.getLastCellNum();
			for(int j=0;j<totalColumns;j++)
			{
				Cell cell = row.getCell(j);
				//System.out.print(cell.getStringCellValue());
				System.out.print(GetCellValue(cell));
				System.out.print(" ");
				//System.out.print(cell.getNumericCellValue());
				//System.out.print(cell.getCellType());
			}
			System.out.println();
		}
		Fs.close();
		
		
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
		E.ExcelRead();
		E.GetExcelRead("Delhi");
	}

}
