package Collections;

import java.util.*;

public class VectorConcept {
	 
	Vector<String> ls = new Vector<>();
	
	
	public void vectorimplementation()
	{
		System.out.println(ls);
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.add("A");
		ls.add("b");
		ls.remove(2);
		ls.set(3, "ABCD");
		
		System.out.println(ls);
		System.out.println(ls.capacity());
		for(String eachvalue : ls)
		{
			System.out.println(eachvalue);
		}
		System.out.println(ls.contains("A"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorConcept V = new VectorConcept();
		V.vectorimplementation();
	}

}
