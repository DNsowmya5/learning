package Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] name = new String[10];
        name[5] ="hyderabad";
        name[2] = "tokyo";
        name[1] = "newyork";
        String fix="tokyo";
        boolean found= true;
        for(String x : name){
        	if(x == fix){
                 found = true;
                break;
            }
        }
        System.out.println(found);

	}
}
