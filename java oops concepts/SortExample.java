import java.util.*;
public class SortExample {

	public static void main(String[] args) {

		int[] array=new int[] {11,12,45,56,77,10,52};
		System.out.print(" The orginal array is:");

		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
			
		}
		Arrays.sort(array);
		System.out.println(" ");

		System.out.print(" After using sorting method array is:");

		for(int i=0;i<array.length;i++)
		{
			System.out.print(" "+array[i]);
			
		}
		

	}

}
