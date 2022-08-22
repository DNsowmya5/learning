package Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		String[] name = new String[10];
        name[5] ="hyderabad";
        name[2] = "tokyo";
        name[1] = "newyork";
        
        boolean found= true;
        for(String x : name){
            if("delhi".equals(x)){
                found = true;
                break;         
             }
        

	     }
        System.out.println("the String is there ::"+found);

}
}
