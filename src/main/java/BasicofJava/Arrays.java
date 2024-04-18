package BasicofJava;

public class Arrays {
	
	String name = "saathiishh";
			 // o/p :a2i2h2;
	int age = 20;
	int[] myage = {20,15,16,18}; //Static array
	int[][] myage1 = {{20,15,16,18}
					,{50,60,70,80}}; //Static array
	
	String[] Hotel= {"A2B","SVB"};
	
	
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.getMyAge();
	}

}
