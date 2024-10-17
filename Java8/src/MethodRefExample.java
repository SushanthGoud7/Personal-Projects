@FunctionalInterface
interface Example{
	int show(int a, int b);
	
	default int getSome(int a, int b) {
		return a+b;
		
	}
}
public class MethodRefExample {
	
	public static void main(String[] args) {
		
		Example ex = (a,b) -> 0;
		System.out.println("Print!!" + ex.getSome(5, 8));
	}

}
