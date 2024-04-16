package BasicofJava;

import java.io.IOException;

public class ExceptionHandling {
	
	public void Add(int a, int b){
		int c= a+b;
		System.out.println(c);
		
	}
	
	public void div(int a, int b){
		try
		{
		//if(a>0 && b>0)
		//{
		int c= a/b;
	
		System.out.println(c);
		//}
		}
		catch (ArithmeticException A)
		{
			System.out.println("Hey you have give zero in b");
		}
		catch(Exception error)
		{
			System.out.println(error);
		}
		finally
		{
			System.out.println("Finally block");
		}
		
	}
	
	public void age(int myage) throws ArithmeticException,IOException
	{
		// throw new ArithmeticException("You are senior citizen");
		
		if(myage>60)
		{
			throw new ArithmeticException("You are senior citizen");
			//System.out.println("sathish");
		}
		System.out.println("done");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		E.div(10, 5);
		E.Add(10, 2);
		try
		{
		E.age(61);
		}
		catch(Exception e) {}
	}

}
