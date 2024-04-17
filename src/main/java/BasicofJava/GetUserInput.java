package BasicofJava;

import java.util.Scanner;

public class GetUserInput {
	
	public void userinput()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name");
		String name =s.nextLine();
		System.out.println("Welcome !!! "+ name);
		System.out.println("Enter your dob year: ");
		int year =s.nextInt();
		int currentyear = 2024;
		int myAge = currentyear-year;
		System.out.println("Your age is : "+myAge);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetUserInput G = new GetUserInput();
		G.userinput();
	}

}
