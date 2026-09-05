// EXP 9A : define an interface with a method reversal. 
import java.util.*;
interface Reverse_a_String
{
  public void Reversal(String a);
}
class Rev_A_String implements Reverse_a_String
{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a string: ");
   String str = sc.nextLine();
     char ch; 
     ArrayList<String> b = new ArrayList<>();
   @Override
   public void Reversal(String a)
   { 
     for(int i = 0; i<a.length(); i++)
     {
       ch = a.charAt(i);
       b.add(ch);     
       System.out.println(b);
     }
   }
 }
}