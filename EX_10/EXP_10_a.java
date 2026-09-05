/*
 Demonstrate using a suitable example that a base class reference variable can point to a child class object or a base class object using the concept of dynamic method dispatch (dynamic polymorphism).
*/
import java.util.*;
// a base class reference variable can point to a child class object (upcasting)
// upcasting is the process of treating a child class object as an instance of its parent //class.
class A
 {
   A() { System.out.println("Constructor from Class A");}
   void display() {System.out.println("From Display of Class A");}
 }
class B extends A
 {
   B() {super();  System.out.println("Constructor from Class B");}
   void display() { super.display(); System.out.println("From Display of Class B");}
 }
class C extends B
 {
   C() {super();  System.out.println("Constructor from Class C");}
   void display() { super.display(); System.out.println("From Display of Class C");}
 }
class EXP_10_a
{
 public static void main(String args[]) 
 {
   A obj; // reference variable
   obj = new B(); obj.display();
   obj = new C(); obj.display();
 }
}
