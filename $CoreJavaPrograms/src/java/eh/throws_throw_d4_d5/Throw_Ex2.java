package java.eh.throws_throw_d4_d5;
import java.util.Scanner;

public class Throw_Ex2 {
public static void main(String[]args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter a name ");
	String string=scanner.nextLine();
	if(string.endsWith("k")) {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException ex) {
			System.out.println("the should't end with k");
		}}
	else {
		
		System.out.println("welcom " + string);
	}
}}