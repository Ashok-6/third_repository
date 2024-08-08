package java.cfw_d7_d8;

import java.util.HashMap;


import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Map_Ex2 {
public static void main(String[]args) {
	
	Map<Integer, String> k = new HashMap<>();
	
	k.put(101,"ashok");
	k.put(102, "giri");
	k.put(103, "subbu");
	k.put(104, "karthik");
	k.put(104, "pavan");
	
	
	
	
	for(Object l:k.entrySet()) {
		System.out.println(l);
	}
}
}
