package ThreadsConcept; 

public class SyncronizedThread {
	
	synchronized void printTable(int a, int total) throws InterruptedException
	{
		for(int i=1;i<total;i++)
		{
			System.out.println(a +" * "+i +" = " +a * i);
		}
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*Thread t = new Thread()
		{
	SyncronizedThread s = new SyncronizedThread();
	public void run()
	{
		try {
			s.printTable(3, 10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		};
t.start();
t.join();

Thread t1 = new Thread()
{
SyncronizedThread s = new SyncronizedThread();
public void run()
{
try {
	s.printTable(5, 10);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
};
t1.start();

}*/
	
		SyncronizedThread s = new SyncronizedThread();
		Thread1 t = new Thread1(s);
		Thread2 t1 = new Thread2(s);
		t.start();
		t1.start();
	}

}
