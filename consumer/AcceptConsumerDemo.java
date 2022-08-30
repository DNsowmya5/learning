package consumer;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class AcceptConsumerDemo {

	@SuppressWarnings({ "rawtypes", "unchecked"})
	public static void main(String[] args) {

		Consumer printer=str->System.out.print(str+" ");
		printer.accept("welcome ");
		printer.accept("to consumer concept in functional interface ");

		List<String> countryList=Arrays.asList("India","Australia","kanada","Itali");
		countryList.stream().forEach(printer);
		List<Integer> startYear=Arrays.asList(2028,2022,2023,2024);
		startYear.stream().forEachOrdered(printer);

	}

}
