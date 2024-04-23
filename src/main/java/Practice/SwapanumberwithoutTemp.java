package Practice;

public class SwapanumberwithoutTemp {
	
	public void implementation()
	{
		int x = 35; 
        int y = 15; 
        x = x + y; //15 
        y = x - y;  // 15-5=10
        x = x - y;  //15-10 =5
        System.out.println("After swapping:"
                           + " x = " + x + ", y = " + y); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapanumberwithoutTemp S = new SwapanumberwithoutTemp();
		S.implementation();
				
	}

}
