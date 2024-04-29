package Inheritance;

import java.util.Scanner;

public class BesantTambaramInvoice extends BesantTambarmBranch{
	final double taxpercentange = 0.12;
	
	public void PrintInvoice(int Amount)
	{
		if(Amount>0)
		{
		System.out.println("Thanks for Choosing Besant");
		System.out.println("Your course Fees amount is : Rs.  "+Amount);
		System.out.println("Tax percentage foe the course fees is : "+taxpercentange);
		System.out.println("Total amount to pay : "+GetTax(Amount));
		}
		
		
	}
	
	public double GetTax(int amount)
	{
		double taxAmount = amount*taxpercentange;
		return amount+taxAmount;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantTambaramInvoice B = new BesantTambaramInvoice();
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the course name: ");
		String coursename = userinput.nextLine();
		
		if(B.GetCourse(coursename))
		{
		B.PrintInvoice(B.GetCourseFees(coursename));
		}
		else
		{
			
				System.out.println("The course is not avaialble in this branch");
		}
	}

}
