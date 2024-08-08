package com.example.test;
import com.example.shapes.Circle;  // <packagename.class>
public class Main {
public static void main(String[]args) {
	Circle circle = new Circle();
    double area = circle.area(34);
    System.out.println("The area of the circle is: " + area);
    
}
}
