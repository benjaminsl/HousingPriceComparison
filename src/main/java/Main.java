import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class Main
{
	public static void main(String[] args)
	{
		DateTime now = new DateTime(); // gives System time into localTime object
		System.out.println("CurrentDay: " + now.dayOfWeek().getAsText());
		System.out.println("Hello World!");
	}	
}
