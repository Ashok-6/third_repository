package java.eh.throws_throw_d4_d5;
/*****
 * Handling Specific Exceptions:Write a Java method divideNumbers(int a, int b)
 * that takes two integers as parameters and computes their division. Handle the ArithmeticException 
 * (for division by zero) and NumberFormatException (for invalid input) exceptions gracefully.*****/


public class Handling_specific_Exception {
	
	public static void divideNumbers(int a, int b) {
		try {
			int c =a/b;
			System.out.println("the division is =>"+c);
		}
		catch(ArithmeticException ex){
			System.out.println("divisible by zero not possible..");
			
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid input");
		}
	}
	public static void main(String[] args) {
        divideNumbers(10, 2);  
        divideNumbers(10, 0); 
        divideNumbers(10, Integer.parseInt(""));
    }
	
}
