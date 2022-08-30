package consumer;
import java.util.function.Consumer;
public class ExampleForConsumer {
	    public static void main(String[] args) {
	        String stringOne = "Hello";
	        Consumer<String> consumer = new Consumer<String>() {
	            
	            @Override
	            public void accept(String string) {
	                System.out.println("Accept method of Consumer = "+ string);
	            }
	        };
	        
	        System.out.println("It accept method consumer the data ");
	        consumer.accept(stringOne);
	    }
	}
	
