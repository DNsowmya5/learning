package abstractProg;

public class AbstractStaticVariables {

	
	public class TestClass extends Test   
	{  
	    public static void main (String args[])  
	    {  
	        Test.TestMethod();  
	        System.out.println("i = "+Test.i);  
	    }  
	}  
}
abstract class Test 
	{  
	    static int i = 102;  
	    static void TestMethod()  
	    {  
	        System.out.println("hi !! I am good !!");  
	    }  
	}  


