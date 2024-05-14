package ThreadsConcept;

public class Threads extends Thread {
	
	public void GetMyAge()
	{
		System.out.println("My age is 50");
	}
	
	public void run()
	{
		GetMyAge();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threads T = new Threads();
		System.out.println(T.getState());
		T.start();
		System.out.println(T.getName());
		System.out.println(T.getState());
		System.out.println(T.getPriority());
		Threads T1 = new Threads();
		T1.start();
		System.out.println(T1.getName());
		System.out.println(T1.getPriority());

	}

}
