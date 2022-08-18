public class PyramidDemo
{  
	//to print pyramid pattern.
    public static void pyramidPattern(int n) 
    {  
        for (int i=0; i<n; i++)  
		{ 
			for (int j=n-i; j>1; j--) 
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
  
    
    //to print triangle pattern.
    public static void triangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++)
        	{ 
        	
            for(j=0; j<=i; j++)  
            {       
                System.out.print(" *"); 
            }           
            System.out.println(); 
        } 
    } 
    
    
    //to print Right triangle pattern.
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
    
    
    
    //calling 3 methods.
    public static void main(String args[]) 
    { 
        int n = 6; 
        pyramidPattern(n);
        rightTriangle(n);
        triangle(n);
        
    } 
}