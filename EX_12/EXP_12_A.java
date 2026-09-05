// 12_a
/*
a. WAP to implement inbuilt exceptions
i. Checked exceptions (compile time exceptions)
a. ClassNotFoundException
b. IOException
ii. Unchecked exceptions (run time exceptions)
a. NumberFormatException
b. ArithmeticException
c. ArrayIndexOutOfBounds
d. NullPointerException
*/
import java.io.*;
class EXP_12_A
{
  public static void main(String args[])
  {
    try {
          Class.forName("Does_Not_Exist");
        }
   catch(Exception e){
                      System.out.print("\nThere is no class \"Does_Not_Exist\" so the exception is : ");
                      System.out.println(e);
                     }
    try {
            FileReader file = new FileReader("this_also_does_not_exist.txt");
            System.out.println(file.read()); 
        } 
        catch (Exception e) {
            System.out.println("\nThe IO Exception: " + e);
        }

    String a = "abc";
    try{ int b = Integer.parseInt(a); }
    catch(Exception e) { System.out.println("\nAs \"abc\" is a string it can't be made into an integer" + e); }

    try { int h = 13; int c = 0; System.out.println(h/c); }
    catch(Exception e) { System.out.println("\nThe error for dividing by zero is: " + e); }

   try {
    int arr[] = new int[5];     
    int value = arr[10]; 
      } 
    catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("\nThe caught Array Index Exception: " + e);
      }
   
    try {
    String str = null;     
    System.out.println(str.length()); 
        } 
    catch (NullPointerException e) {
    System.out.println("\nThe caught Null Pointer Exception: " + e);
        }
   }
}
