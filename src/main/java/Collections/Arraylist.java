package Collections;

import java.util.*;

public class Arraylist {
	
	String[] name = {"sathish","kumar","R"};
	String[] course = new String[3];
	private String name1 ="sathish";
	
	public String data()
	{
		return name1;
	}
	
	public void setdata(String name)
	{
		this.name1=name;
	}
	
	public void getData()
	{
		course[0]="sathis";
		for(String eachValue : course)
		{
			System.out.println(eachValue);
		}
		
	}
	List<String> list= new ArrayList<>();
	public void ArrayList()
	{
		
		System.out.println(list);
		int i=1;
		while(i>0)
		{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter item name : ");
		String items =s.nextLine();
		if(items.equalsIgnoreCase("stop"))
		{
			return;
		}
		list.add(items);
		
		}
	}
	
	public void GetItem()
	{
		for(String eachitem:list)
		{
			System.out.println(eachitem);
		}
	}

	
	public void Rates()
	{
		List<Integer> newrate= new ArrayList<>();
		newrate.add(200);
		newrate.add(220);
		newrate.add(240);
		//List<Integer> rate= new ArrayList<>();
		
		List<Integer> rate= new LinkedList<>();
		rate.add(30);
		rate.add(40);
		rate.add(50);
		rate.add(60);
		rate.add(30);
		rate.addFirst(100);
		rate.add(99);
		rate.addAll(newrate);
		System.out.println(rate);
		
		System.out.println(rate.contains(60));
		// remove
		rate.remove(2);
		rate.removeLast();
		System.out.println(rate);
		
		// update
		rate.set(4, 199);
		System.out.println(rate);
		
		//
		//rate.clear();
		System.out.println(rate);
		
		System.out.println(rate.getLast());
		
		for(int eachvalue : rate)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println("***********");
		Iterator it = rate.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arraylist A = new Arraylist();
		A.Rates();
	}

}
