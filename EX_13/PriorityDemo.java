class PriorityDemo {
    public static void main(String[] args) {
        
        // Define the task: print the thread's name 5 times
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                // getName() fetches the name we set below
                System.out.println(Thread.currentThread().getName() + " is running (Iteration " + i + ")");
            }
        };

        // Create the threads
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        // 1. Set names using setName()
        t1.setName("High-Priority-Thread");
        t2.setName("Low-Priority-Thread");

        // 2. Set different priorities using setPriority()
        // Priority ranges from 1 (MIN) to 10 (MAX)
        t1.setPriority(Thread.MAX_PRIORITY); // 10
        t2.setPriority(Thread.MIN_PRIORITY); // 1

        // Start the threads
        t1.start();
        t2.start();
    }
}