package BasicofJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WriteFile {

	String filePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\output.txt";
	String TobePrint ="Sathish kumar R Btech Besant technology";
	
	public void WriteData() throws IOException
	{
		File F = new File(filePath);
		FileOutputStream Fo = new FileOutputStream(F);
		Fo.write(TobePrint.getBytes());
		Fo.close();
		System.out.println("Done");
		
	}
	
	public void WriteDatawithFileWriter() throws IOException
	{
		File F = new File(filePath);
		FileWriter Fo = new FileWriter(F);
		Fo.write(TobePrint);
		Fo.close();
		System.out.println("Done");
		
	}
	
	public void ReadAndWrite() throws IOException, InterruptedException
	{
		String outfilePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\output1.txt";
		String readfilePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\Sample.txt";
		
		File F = new File(readfilePath);
		FileReader Fs = new FileReader(F);
		File readF = new File(outfilePath);
		FileWriter Fo = new FileWriter(readF);
		
		//FileInputStream Fs = new FileInputStream(F);
		BufferedReader Bf = new BufferedReader(Fs);
		String i;
		while( (i=Bf.readLine())!=null)
		{
			Fo.write(i);
			Fo.write("\n");
		}
		Fo.close();
		Fs.close();
		System.out.println("done");
	}
	
	public void CopyFile() throws IOException
	{
		String outfilePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\output2.txt";
		String readfilePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\Sample.txt";
		
		File sourceFile = new File(readfilePath);
		File DestinationFile = new File(outfilePath);
		
		FileUtils.copyFile(sourceFile, DestinationFile);
		System.out.println("done");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WriteFile W = new WriteFile();
		W.CopyFile();
	}

}
