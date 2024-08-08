package java.eh.throws_throw_d4_d5;
import java.util.Scanner;

/****throw is a java reserved keyword
purpose: it is used to throw an exception explicitly.
Can declare one exception******/
public class Throw {
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter name");
		
		String name = s.nextLine();
		if(name.startsWith("r"))
		{
			try {
			throw new RuntimeException ();
			}
			catch(RuntimeException ae)
			{
				System.out.println("name should not start with r");
			}
		}
		else
		{
			System.out.println("welcome to " + name);
		}
	}




}
