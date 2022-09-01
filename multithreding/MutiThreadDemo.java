package multithreding;

public class  MutiThreadDemo implements Runnable{

		@Override
	public void run() {
		
			System.out.println("Run thread is running   ....");
			Thread.currentThread().setName("Child Thread");
			System.out.println("Run thread name is :"+Thread.currentThread().getName());
	}
}
