package Encapsulation;

public class Encapsualtionaccess extends Encapsulationclass {
	
	public void GetMyAge()
	{
		setAge(50);
		System.out.println("Myage is: "+getAge());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsualtionaccess E = new Encapsualtionaccess();
		E.GetMyAge();
		}

}
