@FunctionalInterface
interface Demo {
	void show(int i);
}

public class FunctionalAndLamba {
	public static void main(String[] args) {
//		Demo obj = () -> {
//			System.out.println("show something");
//		};
		// lambda expressions
		Demo obj = i -> System.out.println("HELLO " + i);
		obj.show(7);
	}

}
