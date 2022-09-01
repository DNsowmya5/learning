package multithreding;

public class RunMultiObj extends Thread {

	public void run(){  
		for(int i=1;i<5;i++){  
			try{
				Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			System.out.println(i);  
		}  
	}  
	public static void main(String args[]){  
		RunMultiObj t1=new RunMultiObj();  
		RunMultiObj t2=new RunMultiObj();  

		t1.run();  
		t2.run();  
	}  
}  

