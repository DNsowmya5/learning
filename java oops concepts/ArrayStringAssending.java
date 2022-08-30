import java.util.Arrays;   
import java.util.Collections;   
public class ArrayStringAssending {

	public static void main(String[] args)   
	{   
		String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};   

		Arrays.sort(strarray, 2,6);
		System.out.println("Array elements in sub array sorting order: " +Arrays.toString(strarray));  

		Arrays.sort(strarray, Collections.reverseOrder());   
		System.out.println("Array elements in descending order: " +Arrays.toString(strarray));  

		Arrays.sort(strarray);
		System.out.println("Array elements in Ascending order: " +Arrays.toString(strarray));  

		
	}   
}  
