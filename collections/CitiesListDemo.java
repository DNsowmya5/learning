package collections;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class CitiesListDemo {
		   public static void main(final String[] args) {
	      List<String> cityList = Arrays.asList("Delhi", "Mumbai", "Bangalore", "Chennai","Chicago");
	      System.out.print("Cities List = "+cityList);
	      
	      System.out.print("\nCities list converted to Uppercase  = ");
	      cityList.stream().map(cities -> cities.toUpperCase()) .forEach(cities -> System.out.print(cities + "  "));
	      System.out.println(" ");

	      List<String> startswithList=cityList.stream().filter(start->start.startsWith("C")).collect(Collectors.toList());
	      System.out.println("Cities list starStts with C are ="+startswithList);
	    
	      List<String> containaiList=cityList.stream().filter(start->start.contains("ai")).collect(Collectors.toList());
	      System.out.println("Cities list having ai ="+containaiList);
	     
	      List<String> concatingList=cityList.stream().map(start->start.concat(" Metro")).collect(Collectors.toList());
	      System.out.println("Cities list appending metro ="+concatingList);

	      List<String> sortingList=cityList.stream().sorted().collect(Collectors.toList());
	      System.out.println("Cities list get =sorted "+sortingList);
	      
	      long countingList=cityList.stream().filter(start->start.startsWith("C")).count();
	      System.out.println("Cities list counting c lettered cities are= "+countingList);

	      Optional<String> findfirstList=cityList.stream().filter(start->start.equals("Bangalore")).findFirst();
	      System.out.println("Cities list finding first= "+findfirstList);


	   }
	}