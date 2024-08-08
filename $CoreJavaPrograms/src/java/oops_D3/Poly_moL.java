package java.oops_D3;
class A
{
	 int add(int a,int b) {
		return a+b;
		
	}
	double sub(double x, double y) {
		return x-y;
	}
}
public class Poly_moL {

	public static void main(String args[]) {
		A a1=new A();
		System.out.println("the addition is :"+a1.add(20, 50));
		System.out.println("the subtraction is: " +a1.sub(60, 50));
	}
}
