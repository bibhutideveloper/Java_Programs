package dateAndTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFormat {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Before Formatting: "+date);
		
		DateTimeFormatter myFormat = 
				DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
//			DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
		
		// EEEE --> full day name
		// MMMM --> full month name
		
		System.out.println("After Formatting");
		
		String format = date.format(myFormat);
		System.out.println(format);
	}

}
