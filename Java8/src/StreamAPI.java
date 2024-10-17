import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamAPI {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(77, 45, 65, 95, 33, 93);

		// Predicate object
//		Predicate<Integer> predicate = (Integer n) -> {
//			return n % 5 == 0;
//		};
		
//		Predicate<Integer> pred = (Integer i) -> {
//			return i % 2 ==0;
//		};
		
//		list.stream().filter(n -> n % 5 == 0).sorted().map(n -> n * 2).forEach(n -> System.out.println(n));
		int list1 =  list.stream()
//	    list.stream()
		.filter(n -> n % 5 == 0)
		.sorted()
		.map(n -> n * 2)
		.reduce(0, (a, b) -> a + b)
//		.forEach(n -> System.out.println(n))
//		.collect(Collectors.toList())
		;
		System.out.println(list1);
	}
}
