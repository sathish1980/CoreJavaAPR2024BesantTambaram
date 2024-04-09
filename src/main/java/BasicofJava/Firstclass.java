package BasicofJava;

/*
 * accessmodifier class classname{}
 */
public class Firstclass {

	/*
	 * Methods - reusable
	 * 1.Method with out parameter /arguments
	 * 2.Method with parameter /arguments
	 * -----------------------------------
	 * 3.Method with out return type
	 * 4.Method with return type
	 *
	 * syntax : accessmodifier returntype methodname(parmeter/argument){}
	 */
	//1.Method with out parameter /arguments and with out return type
	public void PrintName()
	{
		System.out.println("Technology"); // method implementation
	}

	public void add()
	{
		int a =20;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}

	// method with parameter and woth out return type
	public void sub(int a, int b)
	{
		int c =a-b;
		System.out.println(c);
	}

	public int mul(int a, int b)
	{
		int c= a*b;
		return c;

	}

	public void div(int a,int b)
	{
		int c=mul(a,b);
		int d=c/b;
		System.out.println(d);
	}

	/*public void PrintName()
	{
		System.out.print("Besant");
	}*/

	public static void main(String[] d)
	{
		System.out.print("Besant");
		/* System.out.println("Technology");
		System.out.println("Tambaram");*/
		System.out.print("Besant");
		/* System.out.println("Technology");
		System.out.println("Tambaram");*/
		// syntax : classname objectname = new classname();
		Firstclass FC =new Firstclass(); // instantiation
		FC.PrintName(); // method call
		FC.add();
		FC.sub(15,6);
		FC.div(4, 10);
	}
}
