package BasicofJava;

import java.util.Scanner;

public class Arrays {
	
	String name = "saathiishh";
			 // o/p :a2i2h2;
	int age = 20;
	int[] myage = {20,15,16,18}; //Static array
	int[][] myage1 = {{20,15,16,18}
					,{50,60,70,80}}; //Static array
	
	String[] Hotel= {"A2B","SVB"};
	
	int[] getMyAge = new int[5]; // create a dynamic array
			
	public void getMyAge()
	{
		System.out.println(myage[0]);
		for(int emptyVaraible : myage)
		{
			System.out.println(emptyVaraible);
		}
		
		for(int emptyVaraible=0;emptyVaraible<myage.length;emptyVaraible++)
		{
			System.out.println(myage[emptyVaraible]);
		}
		
		for(int row=0;row<myage1.length;row++)
		{
			for(int column=0;column<myage1[row].length;column++)
			{
			System.out.print(myage1[row][column]);
			}
			System.out.println("");
		}
		
	}
	
	public void GetDynamicArray()
	{
		for(int eachvalue :getMyAge)
		{
			System.out.println(eachvalue);
		}
		int i=0;
		int totalIteration =getMyAge.length;
		while(i<totalIteration)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int a = s.nextInt();
		getMyAge[i]=a;
		i++;
		}
		System.out.println("The End!!");
		/*getMyAge[0]=a;
		getMyAge[1]=5;
		getMyAge[2]=6;
		getMyAge[3]=7;
		getMyAge[4]=8;
		getMyAge[getMyAge.length-1] =a;*/
		
		System.out.println("************");
		
		for(int eachvalue :getMyAge)
		{
			System.out.println(eachvalue);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.GetDynamicArray();
	}

}
