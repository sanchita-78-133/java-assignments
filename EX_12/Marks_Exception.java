/*
Write a Java Program to Create a User Defined Exception class MarksOutOfBoundsException.
If Entered marks of any subject is greater than 100 or less than 0, and then program should create a user defined Exception of type
MarksOutOfBoundsException and must have a provision to handle it.
*/
import java.util.*;
class MarksOutOfBoundsException extends Exception
{
  MarksOutOfBoundsException(String m) { super(m); }
}
class Marks_Exception
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in); int con = 1; 
   while(con == 1){
                   System.out.println("Enter the marks for the student! "); int a = sc.nextInt();
                   try{ if(a>100 || a<0) throw new MarksOutOfBoundsException("It can not be more than 100 and/or lesser and 0!"); }
                   catch( MarksOutOfBoundsException e) { System.out.println(e.getMessage()); }
                   System.out.println("Enter 1 to continue entering marks! and 0 to exit!"); con = sc.nextInt();
                  }
  System.out.println("Terminated!!");
  }
}
