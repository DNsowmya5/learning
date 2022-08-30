
public class DessendingArray {

	public static void main(String[] args) {
		
		int[] ary=new int[] {11,12,45,56,77,10,52};
		int temp=0;
		System.out.print(" The original order array is :");

		for(int i=0;i<ary.length;i++)
		{
			System.out.print(" "+ary[i]);
			
		}
		
		for(int i=0;i<ary.length;i++)
			
		{
			for(int j=i+1;j<ary.length;j++)
			{
				if(ary[i]<ary[j])
				{
					temp=ary[i];
					ary[i]=ary[j];
					ary[j]=temp;
				}
			}
		}
		System.out.println(" ");

		System.out.print(" The Dessending order array is :");

		for(int i=0;i<ary.length;i++)
		{
			System.out.print(" "+ary[i]);
		}


	}

}
