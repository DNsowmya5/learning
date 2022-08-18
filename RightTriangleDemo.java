
public class RightTriangleDemo {

	public static void rightTriangle(int n) 
    {  
        for (int i=0; i<n; i++)  
		{ 
			for (int j=2*(n-i); j>1; j--) 
            { 
                System.out.print(" "); 
            }  
            for (int K=0; K<=i; K++ ) 
            { 
                System.out.print("* ");
            } 
            
            System.out.println();
		}
        } 
	public static void main(String[] args) {
		int n = 5; 
        rightTriangle(n); 

	}

}
