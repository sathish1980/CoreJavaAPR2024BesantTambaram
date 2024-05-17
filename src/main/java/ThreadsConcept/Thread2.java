package ThreadsConcept;

public class Thread2 extends Thread {
	SyncronizedThread t;
	Thread2(SyncronizedThread t)
	{
		this.t=t;
	}
	
	public void run()
	{
		try {
			t.printTable(5,10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
