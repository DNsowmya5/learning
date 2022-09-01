package multithreding;

public class TestOfrunMul extends Thread {
	public void run(){  
		   System.out.println("running...");  
		 }  
		 public static void main(String args[]){  
			 TestOfrunMul t1=new TestOfrunMul();  
		  t1.run();//fine, but does not start a separate call stack
		  t1.run();//fine, but does not start a separate call stack  

		 }  
		}  


