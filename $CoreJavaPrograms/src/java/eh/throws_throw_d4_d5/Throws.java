package java.eh.throws_throw_d4_d5;
/**throws:
````````
throws is a java reserved keyword which gives an indication to the 
calling function to keep the called function under try and catch block.

using throws keyword, we can declare an exception
Can declare multiple exceptions**/

public class Throws {

	//called function 
		public void division() throws ArithmeticException
		{
			int x =100/0;
			System.out.println("division is: " + x);
		}

	}


