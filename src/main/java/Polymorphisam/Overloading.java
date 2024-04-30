package Polymorphisam;

public class Overloading {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println("Addition of 2 number is : "+c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println("Addition of 2 number with first double is : "+c);
	}
	
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println("Addition of 2 number with second double is : "+c);
	}
	
	public void add(double a, double b)
	{
		double c=a+b;
		System.out.println("Addition of 2 number with boith double is : "+c);
	}

	public void add(int a, int b,int d)
	{
		int c=a+b+d;
		System.out.println("Addition of 3 number is : "+c);
	}
	
	public void add(int a, int b,int d,int e)
	{
		int c=a+b+d+e;
		System.out.println("Addition of 4 number is : "+c);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading o = new Overloading();
		o.add(4, 5);
	}

}
