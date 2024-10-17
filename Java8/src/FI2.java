import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class FI2 {

	public static void main(String[] args) {
		
		Function<Integer, Integer> func = num -> num*num;
		int obj = func.apply(7);
		System.out.println(obj);
		
		Consumer<Integer> consumer = num -> System.out.println(num);
		consumer.accept(7);
		
		BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> num1+num2>10;
		boolean obj2 = biPredicate.test(7, 8);
		System.out.println(obj2);

	}

}
