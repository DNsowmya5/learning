package biconsumer;
import java.util.function.BiConsumer;  
public class BiConsumerDEmo {  
    static void ShowDetails(String name, Integer age){  
        System.out.println(name+" "+age);  
    }  
    public static void main(String[] args) {   
        BiConsumer<String, Integer> biCon = (name, age)->System.out.println(name+" "+age);  
        biCon.accept("Rama", 20);  
        biCon.accept("Shyam", 25);   
        BiConsumer<String, Integer> biCon2 = (name, age)->System.out.println(name+" "+age);  
        biCon2.accept("Peter", 28);  
    }  
}  
