package coding.practiceThread;

public class ThreadExample extends Thread {

    public void run() {
        System.out.println("Thread is running");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadExample myThread = new ThreadExample();

        myThread.start();
    }
}

