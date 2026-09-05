/*
Write a Java program that: Accepts two numbers from the user Performs division inside a try block Handles arithmetic exceptions 
using catch Uses finally to display a termination message Throws a custom exception if the divisor is zero.
*/
import java.util.*;
class Are_You_Dividing_By_Zero extends Exception
{
  Are_You_Dividing_By_Zero(String m) { super(m); }
}
class Divison_Exception
{
 public static void main(String args[])
 {
   // finally must be preceded by try so while loop won't work
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the numerator! ");  int num = sc.nextInt();
   System.out.println("Enter the denominator! ");  int den = sc.nextInt();

  try{
       if(den == 0) { throw new Are_You_Dividing_By_Zero("Exception : The denominator is zero!!"); }
       double c = num/den;
       System.out.println("The answer of the division is : " + c);     
     }
  catch(Are_You_Dividing_By_Zero e){ System.out.println(e.getMessage()); }
  finally{ System.out.println("\nThis will get executed no matter what as this is in the finally block! "); }
 }
}