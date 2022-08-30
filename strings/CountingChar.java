package strings;

public class CountingChar {

	public static void main(String[] args) {

		String name="syed aisha"; 
		int counting=0;    
		//char string[] = name.toCharArray();    
		for(int i=0; i<name.length(); i++) {
			for(int j=0; j<name.length(); j++) {
				if(name.charAt(i)==name.charAt(j) && name.charAt(i)!=' ') {
					counting++;
				}
			}
			System.out.println(name.charAt(i)+" : "+counting);
			counting=0;
		}
}
}
