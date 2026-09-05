/*
Write a Java program to create two threads: Thread-1 prints numbers from 1 to 5, Thread-2 prints characters from A to E. Both threads should run concurrently.
*/
class EXP_13_A 
{
 public static void main(String args[])
 {
  (new Thread(new Numbers())).start();
  (new Thread(new Letters())).start();
 }
}
 class Numbers implements Runnable
  {
     //Numbers() {}
     public void run(){ for(int i = 1; i<=5; i++) System.out.println(i); }
  }
 class Letters implements Runnable
  {
    //Letters() {}
    public void run(){ for(char i = 'A'; i<='E'; i++) System.out.println(i); }
  }