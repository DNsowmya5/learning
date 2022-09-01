package multithreding;

public class MutiThreadMain {
	public static void main(String args[]){    
	Thread mutiThreadDemo=new Thread(new MutiThreadDemo());
	System.out.println("This is from main thread is runnong   ...."+Thread.currentThread().getName());

	mutiThreadDemo.start();
	}

}
