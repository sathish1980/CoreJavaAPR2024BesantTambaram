package Inheritance;

import java.util.Scanner;

public class BesantPorurBranch extends BesantBaseBranch{
	
	String branchName ="Besant Porur";
	
	String[] CourseFees= {"Java-14000","C#-22000","SQL-15000","Testing-19000","Python-12000"};
	
	public int GetCourseFees(String course)
	{
		for(String eachCourseFees : CourseFees)
		{
			String[] AfterSplit = eachCourseFees.split("-");
			if(AfterSplit[0].equalsIgnoreCase(course))
			{
				System.out.println("The course fees for the requested course is : "+AfterSplit[1]);
				return Integer.parseInt(AfterSplit[1]);
			}
		}

		return 0;
	}
	
	public void FinalRun(String coursename)
	{
		if(GetCourse(coursename))
		{
			GetCourseFees(coursename);
		}
		else
		{
			System.out.println("the course is not avaialble");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantPorurBranch B = new BesantPorurBranch();
		System.out.println(B.baseBranchName);
		System.out.println(B.branchName);
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the course name: ");
		String coursename = userinput.nextLine();
		B.FinalRun(coursename);
		
	}

}
