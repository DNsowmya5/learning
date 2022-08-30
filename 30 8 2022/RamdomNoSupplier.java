package supplier;

import java.util.Random;
import java.util.function.Supplier;
public class RamdomNoSupplier {
	public static void main(String[] args) {
		Supplier<Integer> supplier = RamdomNoSupplier::getTwoDigitRandom;
		System.out.println(supplier.get());
	}
	public static Integer getTwoDigitRandom() {
		int random = new Random().nextInt(100);
		if(random < 10)
			return 10;
		return random;
	}
}