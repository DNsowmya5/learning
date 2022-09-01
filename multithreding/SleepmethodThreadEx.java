package multithreding;

public class SleepmethodThreadEx extends Thread {
	public void run(){    
		for(int i=1;i<5;i++){    
			try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println(e);}    
			System.out.println(i);    
		}    
	}    
	public static void main(String args[]){    
		SleepmethodThreadEx t1=new SleepmethodThreadEx();    
		SleepmethodThreadEx t2=new SleepmethodThreadEx();    

		t1.start();    
		t2.start();   
	}    
}    

