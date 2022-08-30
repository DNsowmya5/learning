package interfaceprograms;
interface sayable{  
    void say(String msg);  
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  

public class InterfaceExample {

	
	    public static void main(String[] args) {  
	        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
	        fie.say("Hello there");  
	    }  
	}  
}
