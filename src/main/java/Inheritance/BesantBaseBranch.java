package Inheritance;

public class BesantBaseBranch {
	
	String baseBranchName = "Besant Technology Bangalore";
	String[] Courses= {"Java","C#","SQL","Testing","Python","DigitalMarketing"};
	
	public boolean GetCourse(String expectedCourse)
	{
		for(String eachCourse : Courses)
		{
			if(expectedCourse.equalsIgnoreCase(eachCourse))
			{
				System.out.println("The requested course is avaiable ");
				return true;
			}
		}
		return false;
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BesantBaseBranch B = new BesantBaseBranch();
		B.GetCourse("UI/UX");
	}

}
