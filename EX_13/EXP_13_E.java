/*
setname getname
*/
class EXP_13_E
{
 public static void main(String args[]) throws InterruptedException
 {
   Thread t1 = new Thread(new One());    Thread t2 = new Thread(new Two());
   Thread t3 = new Thread(new Three());
   t1.setName("Sanchita"); t2.setName("Asavari"); t3.setName("Karna");
   t2.start(); t2.join();
   t1.start(); t3.start();
 }
}
class One implements Runnable
{
 @Override
 public void run()
 {
   for(int i = 0 ; i<=10; i++) System.out.println(Thread.currentThread().getName() +  " says I like coding!!");
 }
}
class Two implements Runnable
{
 @Override
 public void run()
 {
   for(int i = 0 ; i<=10; i++) System.out.println(Thread.currentThread().getName() +  " says I like electronics!!");
 }
}
class Three implements Runnable
{
 @Override
 public void run()
 {
   for(int i = 0 ; i<=10; i++) System.out.println(Thread.currentThread().getName() +  " says I like psychology!!");
 }
}