/****
default:


 
with in the class  - yes
from other class of same package - yes
from different pacakge - no */

package Ashok;

public class default_accm {
	
		
		 void sum(int x, int y)
		{
			System.out.println("sum is: " + (x+y));
		}

		public static void main(String[] args) {
			
			default_accm obj = new default_accm();
			obj.sum(40, 50);
		}

}
