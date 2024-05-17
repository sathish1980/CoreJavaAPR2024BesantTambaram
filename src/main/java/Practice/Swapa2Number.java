package Practice;

public class Swapa2Number {

	public void implementaion()
	{
		int num1 = 10;
        int num2 = 20;
        
        // num1= num2   num2=a a=num1

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swapping logic using a temporary variable
        int a = num1;
        num1 = num2;
        num2 = a;
//Thread.sleep(2000);
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapa2Number s = new Swapa2Number();
		s.implementaion();
	}

}
