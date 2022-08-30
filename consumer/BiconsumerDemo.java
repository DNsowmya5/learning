package consumer;

	import java.util.function.BiConsumer;

	public class BiconsumerDemo {
		public static void main(String[] args) {
			BiConsumer<Integer,Integer> numbers = (a,b) -> System.out.println(a+b);
			numbers.accept(10, 20);
			BiConsumer<String,Integer> data = (a,b) -> System.out.println(a+" "+b);
			data.accept("Aisha", 25);
			BiConsumer<String,String> name = (a,b) -> System.out.println(a+b);
			BiConsumer<String,String> uppercase = (a,b) -> System.out.println(a.toUpperCase()+" "+b.toUpperCase());
			name.andThen(uppercase).accept("aisha", "syed");
			BiConsumer<String, Integer> menu = (p,q)->System.out.println(p+""+q);
			menu.accept("mouse",599);
		}
	}