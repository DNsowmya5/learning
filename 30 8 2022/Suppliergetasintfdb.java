package supplier;

import java.time.LocalDateTime;
//import java.util.Date;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
//import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class Suppliergetasintfdb {
	static String product = "Animal world";
	  static double price = 659.50;
	   
	    public static void main(String[] args) {
	        
	        BooleanSupplier boolSupplier = () -> product.length() == 10;
	        IntSupplier intSupplier = () -> product.length() - 2;
	        DoubleSupplier doubleSupplier = () -> price -20;
	        Supplier<LocalDateTime> tsupplier = () -> LocalDateTime.now();
			System.out.println(tsupplier.get());
	        Supplier<String> supplier = () -> product.toUpperCase();
	        
	        
	        System.out.println(boolSupplier.getAsBoolean());
	        System.out.println(intSupplier.getAsInt());
	        System.out.println(doubleSupplier.getAsDouble());
	        //System.out.println(longSupplier.getAsLong());// 1581187440978 (it depends on current time)
	        System.out.println(supplier.get());
	        
	    }
	}