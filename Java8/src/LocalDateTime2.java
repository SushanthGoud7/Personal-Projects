import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime2 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		// adding days
		LocalDateTime localDateTime = now.plusDays(100);
		System.out.println(localDateTime);

		// adding years
		LocalDateTime localDateTime1 = localDateTime.plusYears(2);
		System.out.println(localDateTime1);
		System.out.println("Before Formatting: " + localDateTime1);

		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy");
		String formatDateTime = localDateTime.format(format);
		System.out.println("After Formatting: " + formatDateTime);
	}

}
