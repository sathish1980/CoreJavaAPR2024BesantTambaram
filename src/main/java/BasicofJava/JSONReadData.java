package BasicofJava;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReadData {
	
	String filepath= "C:\\Users\\kumar\\eclipse-workspace\\CoreJavaAPR2024BesantTambaram\\Input\\sampleinput.json";
	JSONParser parser = new JSONParser();
	public void ReadJSONData() throws FileNotFoundException, IOException, ParseException
	{
		 Object obj = parser.parse(new FileReader(filepath));
         JSONObject jsonObject = (JSONObject)obj;
         String name = (String)jsonObject.get("fruit");
         String size = (String)jsonObject.get("size");
         String color = (String)jsonObject.get("color");
         System.out.println(name + " "+ size +" "+color);
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		JSONReadData J = new JSONReadData();
		J.ReadJSONData();
	}

}
