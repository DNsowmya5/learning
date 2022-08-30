package collections;
import java.util.Arrays;   
import java.util.Collections;   

public class SortingCollections {

	public static void main(String[] args)   
	{   
		Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};    
		Arrays.sort(array);   
		System.out.println("Array elements in Ascending ascending order: " +Arrays.toString(array)); 
		
		
		Arrays.sort(array, Collections.reverseOrder());
		System.out.println("Array elements in Descending Descending order: " +Arrays.toString(array)); 

	}   
}  

