package Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] name = new String[10];
        name[5] ="hyderabad";
        name[2] = "tokyo";
        name[1] = "newyork";
        String fix="tokyo";
        boolean found=false;
        for(String x :name){
            if(fix.equals(x)){
                found = true;
                break;         
             }
            else
            	found=false;

	     }
        System.out.println("the String"+fix+" is there ::"+found);

}
}
