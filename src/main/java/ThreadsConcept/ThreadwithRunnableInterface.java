package ThreadsConcept;

public class ThreadwithRunnableInterface implements Runnable {
	
	public void GetMyAge()
	{
		System.out.println("My age is 50");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		GetMyAge();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadwithRunnableInterface T = new ThreadwithRunnableInterface();
		Thread thread = new Thread(T);
		thread.start();
		System.out.println(thread.getName());
		Thread thread1 = new Thread(T);
		thread1.start();
		System.out.println(thread1.getName());
	}

	

}
