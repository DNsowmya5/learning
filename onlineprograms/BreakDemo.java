package onlineprograms;
public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i = 0;
		while(i<5) {
		System.out.println("hello");
			if(i == 2) {
			break;
			}
			System.out.println("bye");
			i++;
		}
		
		for( i = 1; i< 5;i++) {
			if(i == 2) {
				break;
			}
			System.out.println("hello" +i);
		}
	}

}