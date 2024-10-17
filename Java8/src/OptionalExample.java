import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
//		String[] str = {"ugy","iyf","uuu"};
		int[] integer = {1,2,3,4,5};
		int[2] = 3;
		
		// using optional to handle null value
		Optional<String> optValue = Optional.ofNullable(str[2]);
		if (optValue.isPresent()) {
			String string = optValue.get().toUpperCase();
			System.out.println(string);
		} else {
			System.out.println("no value");
		}

	}
}