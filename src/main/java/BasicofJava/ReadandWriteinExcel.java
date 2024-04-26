package BasicofJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteinExcel {
	
String InfilePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\MakeMyTrip.xlsx";
String outfilePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\output.xlsx";

	public void ExcelReadandWrite() throws IOException
	{
	
		File F = new File(InfilePath);
		FileInputStream Fs = new FileInputStream(F);
		File outFile = new File(outfilePath);
		
		
		FileOutputStream FO= new FileOutputStream(outFile);
		
		XSSFWorkbook wbk = new XSSFWorkbook(Fs);
		XSSFWorkbook outwbk = new XSSFWorkbook();
		
		Sheet sheet = wbk.getSheet("InvalidData");
		Sheet outSheet =outwbk.createSheet("CopierSheet");
		// get the totatl number of rows
		int totalRows = sheet.getPhysicalNumberOfRows();
		String newValue = null;
		for(int i=0;i<totalRows;i++)
		{
			Row row = sheet.getRow(i);
			Row Outrow = outSheet.createRow(i);
			int totalColumns = row.getLastCellNum();
			for(int j=0;j<totalColumns;j++)
			{
				Cell cell = row.getCell(j);
				Cell outcell = Outrow.createCell(j);
				String value = GetCellValue(cell).toString();
				if(value.equalsIgnoreCase("MAA"))
				{
					newValue="Madras";
				}
				else if(value.equalsIgnoreCase("DEL"))
				{
					newValue="Delhi";
				}
				else if(value.equalsIgnoreCase("PNQ"))
				{
					newValue="Pune";
				}
				else
				{
					newValue="not a valid city";
				}
				System.out.print(GetCellValue(cell));
				System.out.print(" ");
				outcell.setCellValue(newValue);
				
			}
			System.out.println();
		}
		outwbk.write(FO);
		FO.close();
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
		ReadandWriteinExcel R = new ReadandWriteinExcel();
		R.ExcelReadandWrite();
	}

}
