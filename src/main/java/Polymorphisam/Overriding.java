package Polymorphisam;

public class Overriding extends Overloading {

	public void add(int z, int y)
	{
		int x =z+y;
		 x=x+10;
		System.out.println("output : "+x);
	}
	
	public void getDAta(int a, int b)
	{
		super.add(a,b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Overriding O = new Overriding();
		O.add(2, 4);
		O.getDAta(5, 6);
	}

}
