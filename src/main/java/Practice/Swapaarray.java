package Practice;

public class Swapaarray {
	
	public void implementation(int i, int j)
	{
		        String[] arr = {"First", "Second", "Third", "Fourth"};
		        
		        if(i<0||j<0||i>arr.length||j>arr.length)
		        {
		        	System.out.println("No Swap");
		        	return;
		        }
		        System.out.println("Array before Swap" + "\n");
		        for (String element : arr) {
		            System.out.println(element);
		        }

		       
		        //Simple Swapping logic
		        String temp = arr[i]; //2
		        arr[i] = arr[j]; //3
		        arr[j] = temp; //
		        
		        

		        System.out.println("\n" + "Array after Swap" + "\n");
		        for (String element : arr) {
		            System.out.println(element);
		        }
		    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Swapaarray S= new Swapaarray();
		S.implementation(2,3);
	}

}
