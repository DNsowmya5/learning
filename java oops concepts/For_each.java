
public class For_each    
	{
	    public static void main(String[] arg)
	    {
	        
	            int[] marks = { 125, 1832, 95, 18816, 110 };
	              
	            int highest_marks = maximum(marks);
	            System.out.println("The highest score is " + highest_marks);
	       
	    }
	    public static int maximum(int[] numbers)
	    { 
	        int maxSoFar = numbers[0];
	          
	        for (int num : numbers) 
	        {
	            if (num > maxSoFar)
	            {
	                maxSoFar = num;
	            }
	        }
	    return maxSoFar;
	    }
	}


