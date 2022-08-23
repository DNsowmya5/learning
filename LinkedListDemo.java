package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {


		LinkedList<String> register=new LinkedList<String>();  
		register.add("Ravi");  
		register.add("Vijay");  
		register.add("Ramesh");  
		register.add("Anil");  
		register.add(1, "Shameer");  
		System.out.println(" "+register);  

		LinkedList<String> register2=new LinkedList<String>();  
		register2.add("Saniya");  
		register2.add("Ajay");    
		register.addAll(register2);  
		System.out.println("  "+register);  


		LinkedList<String> register3=new LinkedList<String>();  
		register3.add("Sowmya");  
		register3.add("Vishal");   
		register.addAll(1, register3);  
		System.out.println(" "+register);  
		register.addFirst("Aisha");  
		System.out.println(" "+register);   
		register.addLast("Sameera");  
		System.out.println(" "+register); 
		register.remove("Vijay");  
		System.out.println(" "+register);  
		System.out.println(" "+register);  

		register.removeLastOccurrence("Harsh");  
		System.out.println(" "+register);     

		Iterator<String> itr=register.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  

		}  
		register.clear();  
		System.out.println(" "+register);  



	}

}
