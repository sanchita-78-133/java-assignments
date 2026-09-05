/*
Write a Java program in which two threads share a single bank account object. Each
thread attempts to withdraw money from the account. Use synchronization to ensure that the account balance does not become inconsistent.
*/
import java.util.*;
class EXP_13_D
{
 public static void main(String args[])
 {
   Withdraw_Money MyRun = new Withdraw_Money();
   Thread t1 = new Thread(MyRun);
   Thread t2 = new Thread(MyRun);
   t1.start(); t2.start();
 }
}
class Withdraw_Money implements Runnable
{
   private static int bal = 10000;
   @Override
   public void run(){
   synchronized(this){Scanner sc = new Scanner(System.in); 
   System.out.println("Enter the amount to be withdrawn "); int f = sc.nextInt();
   int ans = Withdraw(f);
   System.out.println("The balance after " +  Thread.currentThread().getName() + " withdrew is : " + ans);
     }
   }
 public static synchronized int Withdraw(int amt)
  {
    if (bal>=amt)  { bal = (bal-amt);  return bal;}
    else return bal;
  }
   
   
  
}