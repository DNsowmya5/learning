
public class For_each1     
{
	public static void main(String[] arg)
	{

		int[] marks = { 125, 1325, 95, 11688, 110 };
		int maxSoFar = marks[0];
		for (int num : marks) 
		{
			if (num > maxSoFar)
			{
				maxSoFar=num;
			}
	        System.out.println("The highest score is " + maxSoFar);

		}


	}
}
