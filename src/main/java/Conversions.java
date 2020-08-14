import java.util.ArrayList;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Conversions
{
	public ArrayList<Integer> ConvertPricesToIntegers(Elements housePrices)
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(11);

		String housePriceString = "";

		for (Element e : housePrices)
		{
			System.out.println("New***********" + e.text());	
		}

		return (numbers);
	}
}
