package Encapsulation;

import java.util.Scanner;

public class Encapsulationclass {
	
	void Encapsulationclass()
	{
		
	}
	
	void Encapsulationclass(int a, int b)
	{
		
	}
	
	private int age =20;
	
	int a =10; // integer type
	double b=a; //double type 
	
	int a1 =10; // integer
	String newname = Integer.toString(a1); // string
	double c =2.34;
	int d =(int)(c);
	
	 
			
	
	/*
	 * getter and setter
	 */
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public void MyDOB(int dobyear)
	{
		int currentyear =2024;
		int dob = currentyear-dobyear;
		System.out.println(dob);
	}
	
	public void Loopthrough()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Item: ");
		String item =s.nextLine();
		if(item.equalsIgnoreCase("Stop"))
			return;
		Loopthrough();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulationclass E = new Encapsulationclass();
		E.Loopthrough();
	}

}
