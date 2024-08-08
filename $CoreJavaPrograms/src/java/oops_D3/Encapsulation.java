// Binding the data
package java.oops_D3;

class Account{
	//private Fields
	private String name;
	private long acc_no;
	private String bankname;
	
	//getter
	public String getName() {
		return name;
		
	}public long getAccno() {
		return acc_no;
		
	}
	public String getBankname() {
		return bankname;
		
	}
	//setter
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAccno(long acc_no) {
		this.acc_no=acc_no;
	}
	
	public void setBankname(String bankname) {
		this.bankname=bankname;
	}
	
}
public class Encapsulation {
public static void main(String[]args) {
	Account a1=new Account();
	a1.setName("Ashok..");
	a1.setAccno(1234567890);
	a1.setBankname("State Bank Of India");
System.out.println("Account name is ==> " + a1.getName());
System.out.println("Account number is ==> " +a1.getAccno());
System.out.println("Bank name ==> " +a1.getBankname());
}
}
