package java.eh.throws_throw_d4_d5;


public class Throws_main {
	public static void main(String[]args) {
		Throws throws1=new Throws();

		try
		{
			throws1.division();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("something problem in division method, check it once");
		}	}

}
