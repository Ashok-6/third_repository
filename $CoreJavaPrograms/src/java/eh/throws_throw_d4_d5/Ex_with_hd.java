///program with handling exception,,,,,,
package java.eh.throws_throw_d4_d5;

public class Ex_with_hd {
	public static void main(String[]args) {
		int k=35;
		int l=0;
		try {
			System.out.println(k/l);
		}catch(ArithmeticException e){
			System.out.println("don't enter zero denominator");
			
		}
		System.out.println("rest of the code");
	}

}
