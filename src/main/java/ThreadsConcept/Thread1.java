package ThreadsConcept;

public class Thread1 extends Thread{

	SyncronizedThread t;
	Thread1(SyncronizedThread t)
	{
		this.t=t;
	}
	
	public void run()
	{
		try {
			t.printTable(3,10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
