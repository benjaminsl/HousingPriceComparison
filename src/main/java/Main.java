import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Document doc = Jsoup.connect("https://www.javapoint.com").get();
		System.out.println(doc);
	}	
}
