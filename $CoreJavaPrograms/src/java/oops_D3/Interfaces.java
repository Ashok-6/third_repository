package java.oops_D3;
interface Arith {
  public void add(int a, int  b); // interface method (does not have a body)
 
}

// Pig "implements" the Animal interface

class Arith1 implements Arith {
	@Override
  public void add(int a, int b) {
    // The body of animalSound() is provided here
    System.out.println("the addition is : "+ (a+b));
  }

}

class Interfaces {
  public static void main(String[] args) {
	  Arith1 my = new Arith1();  // Create a Pig object
    my.add(45, 80);
  }
}