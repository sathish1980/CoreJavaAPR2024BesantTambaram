package BasicofJava;

public class Assignment1 {

	//Arrays.add();
	/*
	 * calculate the price and return
	 * calculate the discount % for the price and print the discount amount
	 * print the remaining amount to pay
	 */

	public double DiscountAmount(int amount, double discountPercentage)
	{
		double discountAmount = amount*discountPercentage;
		System.out.println("Your discount amount is : "+discountAmount);
		return discountAmount;
	}

	public double RemainingAmountToPay(int actualAmount, double discountAmount)
	{
		double amountToPay = actualAmount-discountAmount;
		System.out.println("totalAmount to Pay: "+amountToPay);
		return amountToPay;
	}

	// accesmodifier returntype methodname(arguments/parameter){}
	public int Price(int amount,int quantity)
	{
		int totalAmount = amount*quantity;
		System.out.println("You have to pay: "+totalAmount);
		return totalAmount;
	}

	public void data(int amount, int quantity,double discountPercentage)
	{
		int totalAmount = amount*quantity;
		System.out.println("You have to pay: "+totalAmount);
		double discountAmount = totalAmount*discountPercentage;
		System.out.println("Your discount amount is : "+discountAmount);
		double amountToPay = totalAmount-discountAmount;
		System.out.println("totalAmount to Pay: "+amountToPay);

	}

	public void invoice(int amount, int qty,double discPercentage)
	{
		int totalPrice =Price(amount,qty);
		double discount = DiscountAmount(totalPrice,discPercentage);
		double total = RemainingAmountToPay(totalPrice,discount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 a= new Assignment1();
		a.invoice(750, 5, 0.03);
		a.data(750, 5, 0.03);
	}

}
