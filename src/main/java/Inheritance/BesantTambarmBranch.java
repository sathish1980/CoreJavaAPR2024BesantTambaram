package Inheritance;

import java.util.Scanner;

public class BesantTambarmBranch extends BesantBaseBranch{
	
	String[] CourseFees= {"Java-15000","C#-20000","SQL-13000","Testing-18000","Python-14000"};
	
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
		BesantTambarmBranch B = new BesantTambarmBranch();
		System.out.println(B.baseBranchName);
		Scanner userinput = new Scanner(System.in);
		System.out.println("Enter the course name: ");
		String coursename = userinput.nextLine();
		B.FinalRun(coursename);
		
	}

}
