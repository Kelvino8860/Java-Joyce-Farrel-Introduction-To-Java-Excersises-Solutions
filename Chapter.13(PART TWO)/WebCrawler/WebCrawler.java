import java.util.Scanner;
import java.util.ArrayList;

public class WebCrawler
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Enter a URL 
		System.out.print("Enter a URL: ");
		String url = input.nextLine();
		//Crawl from this URL
		crawler(url); //Traverse the web from a starting URL
	}
	
	public static void crawler(String startingURL)
	{
		//List of pending URL
		ArrayList<String> listOfPendingURLs = new ArrayList<>();
		//List of tranversed URL
		ArrayList<String> listOfTraversedURLs = new ArrayList<>();
		
		//add starting URLs
		listOfPendingURLs.add(startingURL);
		while(!listOfPendingURLs.isEmpty() && listOfTraversedURLs.size() <= 100)
		{
			//Get the first URL
			String urlString = listOfPendingURLs.remove(0);
			//URL traversed
			if(!listOfTraversedURLs.contains(urlString))
			{
				listOfTraversedURLs.add(urlString);
				System.out.println("Crawl " + urlString);
				
				//Add a new URL
				for(String s : getSubURLs(urlString))
				{
					if(!listOfTraversedURLs.contains(s))
						listOfPendingURLs.add(s);
				}
			}
		}
	}
	
	public static ArrayList<String> getSubURLs(String urlString)
	{
		ArrayList<String> list = new ArrayList<>();
		
		try
		{
			java.net.URL url = new java.net.URL(urlString);
			Scanner input = new Scanner(url.openStream());
			int current = 0;
			
			while(input.hasNext())
			{
				//Read line
				String line = input.nextLine();
				current = line.indexOf("http:", current);
				//end of URL
				while(current > 0)
				{
					//URL ends with "
					int endIndex = line.indexOf("\"", current);
					//Extract a URL
					if(endIndex > 0)
					{
						//Ensure that a correct URL is found
						list.add(line.substring(current,endIndex));
						current = line.indexOf("http:",endIndex);
					}
					else
					{
						current = -1;
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		
		return list;
	}
}