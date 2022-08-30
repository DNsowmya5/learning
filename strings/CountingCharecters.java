package strings;

public class CountingCharecters {



	@SuppressWarnings("unused")
	private String string = "The best of both worlds";    
	private  int count=0;    

	public void counting(String name)
	{


		for(int i = 0; i < name.length(); i++) {    
			if(name.charAt(i) != ' ')    
				count++;    
		}   


		System.out.println("Total number of characters in a string: " + count);  
	}
}


