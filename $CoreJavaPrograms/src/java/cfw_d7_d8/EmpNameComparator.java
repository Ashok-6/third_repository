package java.cfw_d7_d8;

import java.util.Comparator;


public class EmpNameComparator implements Comparator<Empp>{
//public class EmpNameComparator implements Comparator {
    
    
//    	 public int compare(Object o1, Object o2) {  
//		        Emp em1 = (Emp) o1;   //without generics methode cast parameter to Emp
//		        Emp em2 = (Emp) o2;
//		        
		      public int compare(Emp em1, Emp em2) {
        return em1.getEmp_name().compareTo(em2.getEmp_name());
    }

			@Override
			public int compare(Empp o1, Empp o2) {
				// TODO Auto-generated method stub
				return 0;
			}
}
//}
