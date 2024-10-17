import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime1 {

	public static void main(String[] args) {

		// current date
		LocalDate currentDate = LocalDate.now();
		System.out.println("current date!!! " + currentDate);

		// current time
		LocalTime currentTime = LocalTime.now();
		System.out.println("current time!!! " + currentTime);

		// current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("current date and time!!! " + currentDateTime);

		// custom formatter
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("DD-MM-YYYY");
		String formattedDateTime = currentDateTime.format(formatter);
		System.out.println("formatted date time!!! " + formattedDateTime);

	}

}
