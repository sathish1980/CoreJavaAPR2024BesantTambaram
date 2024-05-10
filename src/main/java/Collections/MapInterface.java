package Collections;

import java.util.*;

public class MapInterface {
	
	/*
	 * HAshMap
	 * LinkedHashMap
	 * TreeMap
	 */

	public void GetMApInterefaceimplementation()
	{
		//Map<String,Object> M = new HashMap<>();
		//Map<String,Object> M = new LinkedHashMap<>();
		Map<String,Object> M = new TreeMap<>();
		List<Integer> L = new ArrayList<>();
		L.add(5);
		L.add(20);
		System.out.println(M);
		M.put("Idly",20);
		M.put("Dosa", "40");
		M.put("pongal", "25");
		M.put("poori", "40");
		M.put("Idly", L);
		System.out.println(M);
		System.out.println(M.get("Idly"));
		System.out.println(M.keySet());
		System.out.println(M.values());
		System.out.println(M.entrySet());
		M.remove("pongal","35");
		System.out.println(M);
		M.replace("pongal", "55");
		System.out.println(M);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterface M = new MapInterface();
		M.GetMApInterefaceimplementation();
	}

}
