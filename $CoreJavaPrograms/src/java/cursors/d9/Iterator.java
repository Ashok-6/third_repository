package java.cursors.d9;

import java.util.ArrayList;
/*Iterator is one of the predefined interface available in java.util pacakge 
  ->universal cursor 
  in any collection class , we have iterator() 
  you can apply this Iterator on top of any collection class. 
  single direction cursor only .
  requirement:
     forward & backward 
	 insertion 
	 deletion 
	 updation */

public class Iterator {
public static void main(String[]args) {
	ArrayList<Integer> al = new ArrayList<Integer>();  
	
	for(int i=1;i<=10;i++) {
		al.add(i);
	}
	
	java.util.Iterator<Integer> itr = al.iterator();  
	
	System.out.println("before remove size is :" + al.size());
	
	System.out.println(al);
	
	while(itr.hasNext())
	{
		
	    int x = itr.next();
		if(x%2!=0)
		{
			itr.remove();
			
		}		
	}
	System.out.println("after remove size is :" + al.size());
	System.out.println(al);//[2,4,6,8,10]
	
}
}

