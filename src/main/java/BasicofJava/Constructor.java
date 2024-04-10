package BasicofJava;

public class Constructor {

	/* 	constructor is same like method
	 *	constructor name should be same as your class name
	 *	constructor should not have return type
	 *	2 types
	 *	1.constructor with parameter
	 *	2.constructor with out parameter
	 *	no need to call the constructor it will execute when u instantiate
	 *	Constructor will run very first
	 * SYNTAX : ACCESSMODIFIER CLASSNAME(ARGUMENTS/PARAMETER){}
	 */

	public Constructor(int dob,int day,int month) // constructor with parameter
	{
		int age =2024-dob;
		System.out.println(age);
	}

	public Constructor(int a)
	{
		System.out.println("This is constructor");
	}

	public void printMyName(String name)
	{
		System.out.println("My name is : "+name);
	}

	public void Mylocation(String loc)
	{
		System.out.println("My location is : "+loc);
	}
	
	public void mychanges()
	{
		System.out.println("mychnges");
	}

public void mergeconflictcheck()
{}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor c = new Constructor(2003);
		c.Mylocation("chennai");
		c.printMyName("Sathish");
		//	c.GetAge(1880);
	}

}
