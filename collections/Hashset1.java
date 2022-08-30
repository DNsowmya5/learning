package collections;

import java.util.LinkedHashSet;

public class Hashset1 {
	public static void main(String[] args) {

	LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
	  
	lhs.add("Java");  
	lhs.add("TRINING");  
	lhs.add("PROCESS");  
	lhs.add("Good");  
	lhs.add("HAPPY");  
	   
	System.out.println("The hash set is: " + lhs); 
	  
	System.out.println(lhs.remove("Good"));  
	  
	System.out.println("After removing the element, the hash set is: " + lhs);  
	 
	System.out.println(lhs.remove("PROCESS"));  
	  
	}  
	}  

