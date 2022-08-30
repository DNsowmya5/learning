package collections;
import java.util.*;  

public class LinkedList1 {
	
	 public static void main(String args[]){  
	  
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Aisha");  
	  al.add("Sameera");  
	  al.add("Vishal");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	 
}
