import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class FIPredefined {
	
	public static void main(String[] args) {

		Consumer<String> obj = a -> System.out.println("Party: " + a);
		obj.accept("Janasena");

		BiConsumer<Integer, Integer> biConsumer = (num1, num2) -> System.out.println("Numbers: " + num1 + "," + num2);
		biConsumer.accept(7, 5);

		Function<String, String> func = str -> str.concat("Pawankalyan");
		String concat = func.apply("Powerstar ");
		System.out.println("Function: " + concat);

		BiFunction<Integer, Integer, String> biFunc = (num1, num2) -> String.valueOf(num1 + num2);
		String sumObj = biFunc.apply(8, 9);
		System.out.println("BiFunction: " + sumObj);

		Predicate<Integer> pred = num -> num % 2 == 0;
		System.out.println("Predicate: " + pred.test(4));

		BiPredicate<Integer, Integer> biPred = (num1, num2) -> num1 + num2 > 10;
		boolean isBoolean1 = biPred.test(4, 5);
		System.out.println("BiPredicate: " + isBoolean1);

		UnaryOperator<Integer> unary = num -> num + 1;
		int increment = unary.apply(6);
		System.out.println("UnaryOpeartor: " + increment);

		BinaryOperator<Integer> binary = (num1, num2) -> num1 + num2;
		int sum = binary.apply(7, 7);
		System.out.println("BinaryOperator: " + sum);

	}
}