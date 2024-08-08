//hiding the data and shows essential part to user..
package java.oops_D3;

abstract class Bike{
	void run() {
		
	}
}
class honda extends Bike{
	void run() {
		System.out.println("running...");
	}
}
public class Abstraction {
public static void main(String []args) {
	
	//run time poly...
	//parent class 
	Bike b1=new honda();
	b1.run();
}
}
