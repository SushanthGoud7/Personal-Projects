import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {

	public static void main(String[] args) {

		List<List<Integer>> list = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9, 10));

		List<Integer> streamList = list.stream().flatMap(list1 -> list1.stream()).collect(Collectors.toList());
		System.out.println(streamList);
	}

}
