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
		Elements elements = doc.select("div.list-card-price");

		System.out.println(zillowURL);
		System.out.println(elements.size());

	}	
}
