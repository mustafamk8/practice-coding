package coding.practice.threading;

class YieldExample implements Runnable {
    

    public void run() {
        System.out.println(Thread.currentThread().getName() + " starting...");
        for (int i = 0; i < 5; i++) {
            // Print the thread name and loop count
            System.out.println(Thread.currentThread().getName() + ": " + i);
            
            // Yield control to other threads
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldExample()); 
        Thread t2 = new Thread(new YieldExample()); 

        t1.start();
        t2.start();
    }
}

