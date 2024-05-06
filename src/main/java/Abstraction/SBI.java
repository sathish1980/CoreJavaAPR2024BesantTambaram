package Abstraction;

public class SBI extends AbstractClass{
	
	@Override
	public void Add() {
		int a =20;
		int b=25;
		int c=a-b;
		System.out.println(c);
		
	}
	
	public void GetBankNAme()
	{
		System.out.println("Welcome to HDFC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass H = new SBI();
		H.Add();
		//H.sub();
		//H.GetBankNAme();
	}

	

}
