import java.util.Arrays;
import java.util.List;

public class StreamAPI3 {
	
	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9, 10));
		
		double doubleStream  = list.stream().flatMapToDouble(list1 -> list1.stream().mapToDouble(Integer::doubleValue)).average().orElse(0);
		System.out.println(doubleStream);
		
	}
}
