package Practice;

public class Swapa2numberinArray {
	
	public void implementation()
	{
		        String[] arr = {"First", "Second", "Third", "Fourth"};

		        System.out.println("Array before Swap" + "\n");
		        for (String element : arr) {
		            System.out.println(element);
		        }

		        //Simple Swapping logic
		        String temp = arr[1];
		        arr[1] = arr[2];
		        arr[2] = temp;

		        System.out.println("\n" + "Array after Swap" + "\n");
		        for (String element : arr) {
		            System.out.println(element);
		        }
		    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
