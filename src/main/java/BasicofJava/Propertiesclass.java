package BasicofJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesclass {
	
	String filePath = "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\env.properties";
	

	public void propertiesImplementation() throws IOException
	{
		//File F = new File(filePath);
		FileInputStream Fs = new FileInputStream(filePath);
		Properties P = new Properties();
		P.load(Fs); // it is used to read the file in key value pair format
		String name = P.getProperty("username");
		System.out.println(P.getProperty("username"));
		System.out.println(P.getProperty("dob")); 
		System.out.println(P.getProperty("address"));
		System.out.println(P.getProperty("quali"));
		P.setProperty("quali", "B.tech");
		System.out.println(P.getProperty("quali"));
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Propertiesclass P1 = new Propertiesclass();
		P1.propertiesImplementation();
	}

}
