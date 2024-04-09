package BasicofJava;

public class Conditions {

	public void TrafficSignal(String color,String Vehicle,boolean Patient)
	{
		if(color.equalsIgnoreCase("Green"))
		{
			System.out.println("You are good to Go");
		}
		else if(color.equalsIgnoreCase("Red"))
		{
			if(Vehicle.equalsIgnoreCase("Ambulance") && (Patient==true))
			{

				System.out.println("Hey !! Please give me a way i am ambulance");

				/*if(Patient==true)
				{
					System.out.println("Hey !! Please give me a way i am ambulance");
				}
				else
				{
					System.out.println("You have to Stop");
				}*/
			}
			else
			{
				System.out.println("You have to Stop");
			}

		}
		else if(color.equalsIgnoreCase("yellow"))
		{
			System.out.println("Please slow down your vehicle");
		}
		else
		{
			System.out.println("This is not a valid color");
		}
		System.out.println("line in method");
	}


	public void FindGender(String GenderCode)
	{
		switch(GenderCode.toUpperCase())
		{
		case "M":
			System.out.println("You are male");
			break;
		case "F":
			System.out.println("You are Female");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("Not a valid code");
			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conditions C= new Conditions();
		C.TrafficSignal("red","bike",true);
		C.FindGender("M");
	}

}
