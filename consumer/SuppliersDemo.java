package consumer;
import java.time.LocalDateTime;
import java.util.function.Supplier;
public class SuppliersDemo {
	
		public static void main(String[] args) {
			
			Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
			System.out.println(supplier.get());
		}

	}
	