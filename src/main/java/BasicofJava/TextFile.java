package BasicofJava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

	String filePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\Sample.txt";
	
	public void ReadData() throws IOException {
		File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(F);
		/*System.out.println((char)Fs.read());
		System.out.println((char)Fs.read());*/
		int i;
		while( (i=Fs.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}
	
	public void ReadDatawithFileReader() throws IOException, InterruptedException {
		File F = new File(filePath);
		FileReader Fs = new FileReader(F);
		/*System.out.println((char)Fs.read());
		System.out.println((char)Fs.read());*/
		int i;
		while( (i=Fs.read())!=-1)
		{
			System.out.print((char)i);
			Thread.sleep(200);
		}
		
	}
	
	public void ReadDatawithBufferedREader() throws IOException, InterruptedException {
		File F = new File(filePath);
		FileReader Fs = new FileReader(F);
		//FileInputStream Fs = new FileInputStream(F);
		BufferedReader Bf = new BufferedReader(Fs);
		String i;
		while( (i=Bf.readLine())!=null)
		{
			System.out.println(i);
			Thread.sleep(200);
		}
		
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		TextFile T = new TextFile();
		T.ReadData();
		T.ReadDatawithFileReader();
		T.ReadDatawithBufferedREader();
	}

}
