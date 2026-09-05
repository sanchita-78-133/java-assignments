/*
 Write a Java program in which one thread waits using wait() and another thread prints
numbers from 1 to 5 and then notifies the waiting thread using notify(), to demonstrate
inter-thread communication.
*/
class SimpleComm {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object(); // The "Meeting Point" for the threads

        // THREAD 1: The one that waits
        new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Thread 1: I'm waiting...");
                    lock.wait(); // Pauses and releases the lock
                    System.out.println("Thread 1: Finally! I'm done.");
                } catch (InterruptedException e) {}
            }
        }).start();

        // Pause Main for a tiny bit so Thread 1 definitely starts first
        Thread.sleep(100);

        // THREAD 2: The one that prints and wakes the other
        new Thread(() -> {
            synchronized (lock) {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 2 prints: " + i);
                }
                System.out.println("Thread 2: Notifying Thread 1 now!");
                lock.notify(); // Wakes up Thread 1
            }
        }).start();
    }
}