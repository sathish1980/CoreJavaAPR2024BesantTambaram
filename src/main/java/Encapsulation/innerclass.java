package Encapsulation;

public class innerclass {
	private int age =30;

	class innercalss2
	{
		public void getAge()
		{
			System.out.println(age);
		}
	}
	
	class innerclass3
	{
		public void myname()
		{
		System.out.println("Sathish");	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerclass I = new innerclass();
		innerclass.innercalss2 I2 = I.new innercalss2(); // important
		I2.getAge();
		innerclass.innerclass3 I3 = I.new innerclass3();
		I3.myname();
	}

}
