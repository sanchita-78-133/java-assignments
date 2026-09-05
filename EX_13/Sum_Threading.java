/*
Write a Java multithreaded program in which the parent (main) thread creates a child thread to calculate the sum of first n natural numbers. The parent thread must wait until the child thread finishes calculation, and then display the result calculated by the child thread.
*/
import java.util.*;
class Sum_Threading 
{
 public static void main(String args[]) throws InterruptedException
 {
   SUM obj = new SUM();
   Thread t = new Thread(obj);
   t.start();
   t.join();
   System.out.println("Sum : " + obj.sum);
 }
}
class SUM implements Runnable
{
 int sum = 0;
 @Override
 public void run()
 {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the n value: ");  int n = sc.nextInt();
   int i = 0; 
   for(; i<=n; i++) sum += i;
 }
}

