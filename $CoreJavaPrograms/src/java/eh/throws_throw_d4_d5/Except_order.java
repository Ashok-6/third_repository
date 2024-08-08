package java.eh.throws_throw_d4_d5;
import java.util.InputMismatchException;

import java.util.Scanner;

/*** while we are handling the exceptions , the order must be from 
   specific to general not from general to specific    
java.lang.Object    // (child /specific)
java.lang.Throwable
java.lang.Exception
java.lang.RuntimeException
java.lang.ArithmeticException   // (parent / General)  ********* */
public class Except_order {
	public static void main(String[] args) {
				
				try {
				Scanner s = new Scanner(System.in);			
				System.out.println("enter a value:");
				int a = s.nextInt();		
				System.out.println("enter b value:");
				int b = s.nextInt();				
				int div = a/b;
				System.out.println("divsion is: " + div);
				}
				catch(RuntimeException re)
				{
					if(re instanceof ArithmeticException)
					{
						System.out.println("dont enter zero as a denominator");
					}
					else if(re instanceof InputMismatchException)
					{
						System.out.println("please pass only numeric values");
					}
				}
						System.out.println("rest statements exceuted");
		
	}

}
