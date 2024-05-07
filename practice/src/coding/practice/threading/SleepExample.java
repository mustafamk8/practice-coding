package coding.practice.threading;

class SleepExample implements Runnable {
   
   
    public void run() {
        System.out.println( Thread.currentThread().getName()+ " starting...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted.");
        }
        System.out.println(Thread.currentThread().getName() + " finished.");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new SleepExample()); 
        Thread t2 = new Thread(new SleepExample()); 

        t1.start();
        t2.start();
    }
}

