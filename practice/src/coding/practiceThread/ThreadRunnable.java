package coding.practiceThread;

public class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("thread is running");
		for(int i = 0;i<5;i++) {
			
			System.out.print(i+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

	public static void main(String[] args) {
		ThreadRunnable t1 = new ThreadRunnable();
		Thread myThread = new Thread(t1);
		myThread.start();
		
	}
	
}
