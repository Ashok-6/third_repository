/**private:
only with in the class we can access
from other class of same package also we can't access
from different pacakge too we can't access**/


package Ashok;

public class Private_AccM {
	
		
		private void sum(int x, int y)
		{
			System.out.println("sum is: " + (x+y));
		}

		public static void main(String[] args) {
			
			Private_AccM obj = new Private_AccM();
			obj.sum(4, 5);
		}
	}
