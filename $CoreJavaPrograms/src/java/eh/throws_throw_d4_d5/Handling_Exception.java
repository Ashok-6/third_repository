package java.eh.throws_throw_d4_d5;
import java.util.Scanner;

public class Handling_Exception {
		  public static void main(String args[]){  
		   try{  
			   Scanner scanner=new Scanner(System.in);
			   System.out.println("enter a value..");
			   int a=scanner.nextInt();
			   System.out.println("enter b value..");
			   int b=scanner.nextInt();
			   
			   int c=a/b;
			   System.out.println("the Division of a/b is ==>" + c);

		   }catch(ArithmeticException ex)
		   {
			   System.out.println(ex);
			   }  
		  
		   System.out.println("rest of the code...");  
		  }  
		}  
