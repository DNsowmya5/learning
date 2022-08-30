package strings;
public class Demo {
	public static void main(String []args) {
		String str = "9as78";
		char lt;
		int count = 0;
		System.out.println("String: "+str);
		System.out.println("String having alphabets are ");
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(str.charAt(i))) {
				count++;
				lt=str.charAt(i);
				System.out.println(lt);
			}
		}
		System.out.println("Number of Letters are: "+count);
	}
}