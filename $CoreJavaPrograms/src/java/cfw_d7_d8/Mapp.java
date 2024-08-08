package java.cfw_d7_d8;
import java.util.HashMap;

import java.util.Map;
import java.util.Set;
/*with out generics cast the object to mapentry*/
public class Mapp {
public static void main(String[]args) {
	Map me=new HashMap();
	 me.put(101, "rr");  
	 me.put(101, "Ashok");
	 me.put(100, "hi");          
     me.put(null, null);        
     me.put(9.3f, null);            
     me.put(100, "karthi");
     me.put("kumar", 101);        
     me.put('a', 4.5);  

     //for(Object o:k);    for(object temp:actual)
     
   // System.out.println(me);
    
     for(Object k:me.entrySet()){
    	 
    	//cast the Object to a Map.Entry	
			Map.Entry entry = (Map.Entry)k;
			
			//Object key = entry.getKey();
			Object value = entry.getValue();
			
			//System.out.println("Key =>" + key + "   "+"Value =>" + value );
			System.out.println("Value =>" + value );
     }
     }
}
