import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamAPI2 {
	
	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9, 10));
		
		IntStream intStream  = list.stream().flatMapToInt(list1 -> list1.stream().mapToInt(Integer::intValue));
//		intStream.forEach(a-> System.out.println(a));
		int sum  = intStream.peek(System.out::println).sum();
		System.out.println("sum will be: " + sum);
	}
}
