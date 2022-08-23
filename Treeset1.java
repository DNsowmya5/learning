package collections;

import java.util.*;    
public class Treeset1{    
	public static void main(String args[]){    
		TreeSet<Integer> set=new TreeSet<Integer>();    
		set.add(4);    
		set.add(606);    
		set.add(552);    
		set.add(157);
		set.add(95);    
		set.add(85);   
		set.add(155);    


		System.out.println("Lowest Value: "+set.pollFirst());    
		System.out.println("Highest Value: "+set.pollLast());    
	}    
}    
