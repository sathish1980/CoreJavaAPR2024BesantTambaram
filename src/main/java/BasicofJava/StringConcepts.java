package BasicofJava;

public class StringConcepts {
	
	String name = " Sathish kumar R ";
	String name1 ="sathish kumar R";
	
	String filename = "file.txt";
	
	public void StringImplementation()
	{
		System.out.println(name);
		System.out.println(name.length()); // return int
		System.out.println(name.startsWith(" Sathish")); // return boolean value
		System.out.println(name.endsWith(" R")); // return boolean value
		System.out.println(name.contains("thi")); // return boolean valu
		System.out.println(name.equals(name1));// return boolean value
		System.out.println(name.equalsIgnoreCase(name1));// return boolean value
		System.out.println(name==name1);// return boolean value
		System.out.println(name.compareTo(name1));// return int value
		System.out.println(name.indexOf("Z"));// return int value
		System.out.println(name.lastIndexOf("a"));// return int value
		System.out.println(name.charAt(14));// return char value
		System.out.println(name.trim());// return string value
		System.out.println(name.toUpperCase());// return string value
		System.out.println(name.toLowerCase());// return string value
		String upper =name.toUpperCase();
		System.out.println(name);
		System.out.println(upper);
		System.out.println(name.replace("thi", "T"));// return string value
		String[] newName = name.split(" ");// return array of value
		System.out.println(newName); // {"sathish","kumar","R'};
		for(String eachvalue : newName)
		{
			System.out.println(eachvalue);
			
		}
		char[] ch = name.toCharArray();
		for(char eachvalue : ch)
		{
			System.out.println(eachvalue);
			
		}
		
		System.out.println(name.substring(2,6));
		System.out.println(name.substring(2));
		byte[] allBytes= name.getBytes();
		for(int eachvalue : allBytes)
		{
			System.out.println(eachvalue);
			
		}
		System.out.println(name.isBlank()); // return booelan value
		System.out.println(name.isEmpty()); // return booelan value
		int age =50;
		String age1 = String.valueOf(age);
		String addvalue = "Besant";
		name.format(age1, addvalue);
	}
	
	
	public void GetError() throws ArithmeticException
	{
		
		throw new ArithmeticException("hi");
		
	}
	
	
	public void Stringmutable()
	{
		StringBuffer sb = new StringBuffer("Sathish Besant");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.replace(1, 7, "ATHISH");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.insert(1, "Tambaram");
		System.out.println(sb);
		
		
	}
	
	public void StringmutableBuilder()
	{
		StringBuilder sb = new StringBuilder("Sathish Besant");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.replace(1, 7, "ATHISH");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.insert(1, "Tambaram");
		System.out.println(sb);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcepts S = new StringConcepts();

		//S.GetError();
		S.StringmutableBuilder();
	}

}
