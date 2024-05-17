package Regexclass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rclass {
	
	public void r()
	{
		
		String name ="Saathisah123aaSa";
		Pattern pattern = Pattern.compile("Sa{1}");
		Matcher matcher = pattern.matcher(name);
		int count=0;
		while(matcher.find())
		{
			count= count+1;
			//System.out.println(matcher.group() +" "+ matcher.start());
		}
		System.out.println("Sa is available more than " + count +"times");
		/*else
		{
			System.out.println("not available");
		}*/
		   
	}
	
	public void mobilenumber()
	{
		
		String name ="61592101842";
		
		Pattern pattern = Pattern.compile("[6][0-9]{10}");
		Matcher matcher = pattern.matcher(name);
		int count=0;
		if(matcher.find())
		{
			//count= count+1;
			System.out.println(matcher.group() +" "+ matcher.start());
			System.out.println("Valid mobilenumber");
		}
	//	System.out.println("Sa is available more than " + count +"times");
		else
		{
			System.out.println("invalid mobile number");
		}
		   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rclass R = new Rclass();
		R.mobilenumber();
	}

}
