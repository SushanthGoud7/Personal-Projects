//Default, Static and Abstract
interface ABC {
	int values(int x, int y);

	static void displayStatic() {
		System.out.println("Static Method in Interface!!!");
	}

	default void displayDefault(int sum) {
		System.out.println("some default count " + sum);
	}
}

public class DefaultAndAbstract {
	public static void main(String[] args) {
		ABC obj = (x, y) -> x + y;
		int sum = obj.values(7, 7);
		obj.displayDefault(sum);
		ABC.displayStatic();
	}

}
