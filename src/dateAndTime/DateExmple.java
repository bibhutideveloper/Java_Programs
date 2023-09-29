package dateAndTime;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DateExmple {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();	// Display current date
		System.out.println("Date: "+date);
		// YYYY-MM-DD
		
		LocalTime time = LocalTime.now();	// Display current time
		System.out.println("Time: "+time);
		// HH:MM:SS.ns
		
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date-Time: "+dateTime);
		// YYYY-MM-DD T HH:MM:SS.ns
	}

}
