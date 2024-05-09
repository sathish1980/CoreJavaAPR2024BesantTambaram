package Collections;

import java.util.*;

public class Stacjkconcepts {
	 
	//Stack<String> ls = new Stack<>(); // LIFO
	Queue<Object> ls ; //FIFO
	
	
	public void stackimplementation()
	{
		ls= new ArrayDeque<Object>();
		System.out.println(ls);
		ls.add("A");
		ls.add("B");
		ls.add("C");
		ls.add("D");
		System.out.println(ls);
		ls.remove();
		System.out.println(ls);
		ls.add("E");
		ls.remove();
		System.out.println(ls);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacjkconcepts V = new Stacjkconcepts();
		V.stackimplementation();
	}

}
