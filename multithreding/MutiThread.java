package multithreding;
public class MutiThread {

	public static void main(String[] args) {
		// TODO A
		MultiThreadingDemo th=new MultiThreadingDemo();
		System.out.println("inside main method the multithreading called: "+Thread.currentThread().getName());
		th.run();
	}
}

