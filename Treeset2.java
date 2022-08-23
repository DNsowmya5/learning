package collections;

import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();  
        set.add("Aisha");  
        set.add("Balu");  
        set.add("Chinnu");  
        set.add("Danny");  
        set.add("Enimy");  
        System.out.println("Initial Set: "+set);  
          
        System.out.println("Reverse Set: "+set.descendingSet());  
          
        System.out.println("Head Set: "+set.headSet("Chinnu", true));  
         
        System.out.println("SubSet: "+set.subSet("Aisha", false, "Enimy", true));  
          
        System.out.println("TailSet: "+set.tailSet("Chinnu", false));  



	}

}
