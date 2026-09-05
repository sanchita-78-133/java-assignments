
class EXP_13_B
{
 public static void main(String args[])
 {
   Thread t1 = new Thread(new Two_Child());
   Thread t2 = new Thread(new Two_Child());
   t1.start(); t2.start();
 }
} 
class Two_Child implements Runnable
{
 @Override
 public void run() {
 for(int i = 0; i<=13; i++) System.out.println( Thread.currentThread().getName() + " prints " + "/*/*/*");
 }
}