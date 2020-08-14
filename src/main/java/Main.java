import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		/* Get the zip code for the area to look */
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter zip code: ");
		String zipcode = userInput.nextLine();

		/* A string with zillow.com URL + user zip codes to get local house prices */
		String zillowURL = "https://www.zillow.com/homes/" + zipcode + "_rb/";
		Document doc = Jsoup.connect(zillowURL).get();
	
		/* The house prices are in the CSS class div.list-card-prices, */
		/* doc.select will return the elements in that class. */
		Elements elements = doc.select(".list-card-price");

		System.out.println(zillowURL);
		System.out.println(elements.size());
		System.out.println(doc);

		/* Get the price of each element (each house price) from zillow.com */ 
		for (Element e : elements)
		{
			System.out.println(e.text());
		}
		
		Conversions coverter = new Conversions();
		coverter.ConvertPricesToIntegers(elements);

	} // end main method	
} // end Main class
