package java.oops_D3;
class B{
	
	//without parameter 
	int rateofinterest() {
		return 4;
		
	}}
class hi extends B{
		int rateofinterest() {
			return 8;
			
		}
}

public class Poly_moO {
public static void main(String[]args) {
	hi b1=new hi();
	System.out.println("sbi rate of interest is :"+b1.rateofinterest());
	B b2=new B();
	System.out.println("city rate of interest is : "+b2.rateofinterest());
	}
}