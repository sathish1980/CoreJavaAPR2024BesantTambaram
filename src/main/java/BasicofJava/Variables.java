package BasicofJava;

public class Variables {

	/*
	 * Variable is a container which hold the values
	 * 3 Type
	 * local variable
	 * global / instance variable
	 * static variable
	 *
	 * Synatx: accessmodifier datatype variablename =value
	 */

	public static double discountpercentage = 0.06; //global / instance

	public void calculateDiscount(int amount)
	{
		double discountpercentage = 0.05; //local
		System.out.println(discountpercentage);
	}

	public void global()
	{
		System.out.println(discountpercentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
