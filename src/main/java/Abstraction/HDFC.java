package Abstraction;

public class HDFC extends AbstractClass implements Interface1{
	
	@Override
	public void Add() {
		int a =20;
		int b=25;
		int c=a+b;
		System.out.println(c);
		
	}
	
	public void GetBankNAme()
	{
		System.out.println("Welcome to HDFC");
	}

	
	@Override
	public void num1() {
		System.out.println("the number is 10");
	}
	
	@Override
	public void num1(int a) {
		System.out.println("the number is "+a);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass H = new HDFC();
		HDFC H1 = new HDFC();
		SBI S = new SBI();
		H.Add();
		H.sub();
		S.Add();
		H1.GetBankNAme();
		Interface2 I = new HDFC();
		I.num1(2);
	}

	
	

}
