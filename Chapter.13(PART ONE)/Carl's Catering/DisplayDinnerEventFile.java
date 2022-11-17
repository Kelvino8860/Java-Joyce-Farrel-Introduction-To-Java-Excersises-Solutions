/*b. Write a program that displays the data saved in the file created in part 1a.
     Save the program as DisplayDinnerEventFile.java.*/
	 
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class DisplayDinnerEventFile
{
	public static void main(String[] args)
	{
		Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\DinnerEventData.txt");
		
		String s;
		String delimiter = ",";
		String[] array = new String[4];
		InputStream input = null;
		
		try
		{
			input = new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			s = reader.readLine();
			
			while(s != null)
			{
				array = s.split(delimiter);
				System.out.println("Event Number: " + array[0] + "   Event type code: " + array[1] + "   Number of guests: " + array[2] +
				                   "   Price: $" + array[3]);
								   
				s = reader.readLine();				   
			}
			
			reader.close();
		}
		
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
	}
}