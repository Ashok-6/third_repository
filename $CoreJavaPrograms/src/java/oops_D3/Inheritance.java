/// sharing the informarion one class to another classs
package java.oops_D3;

class Emp{
	String name="Kumar";
	public void name() {
		System.out.println("Employee name is .. :"+ name);
	}
	
}
class salary extends Emp{
	float salary=25000;
	public void salary() {
		System.out.println("Employee salary is.. :" + salary);
	}
}
class bonus extends salary{
	float bonus=16000;
	public void bonus() {
		System.out.println("Employee bonus is.. :" + bonus);
	}
}

public class Inheritance {
	public static void main(String args[]) {
		bonus s1=new bonus();
		s1.name();
		s1.salary();
		s1.bonus();
		
		
	}
	
}
