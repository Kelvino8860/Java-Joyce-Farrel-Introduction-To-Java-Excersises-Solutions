/* d. Write an application that allows you to enter any last name and displays all
      the data for customers with the given last name. Display an appropriate message
      if the name cannot be found in the input file. Save the file as
      DisplaySelectedCustomersByName.java.*/
	  
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class DisplaySelectedCustomersByName
{
	public static void main(String[] args)
	{
		Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CustomerRecords.txt");
		Scanner kb = new Scanner(System.in);
		
		final String ID_FORMAT = "000";
		final String NAME_FORMAT = "          ";
		final String BALANCE_FORMAT = "0000.00";
		String delimiter = ",";
		String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + NAME_FORMAT +
		        delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
				
	    byte[] data = s.getBytes();
		String name;
                String lastName;
		String[] array = new String[4];
		
		try
		{
			InputStream input = new BufferedInputStream(Files.newInputStream(file,READ));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	                System.out.println();
			System.out.print("\nEnter customer's last name >> ");
			name = kb.nextLine();
                        int count = 0;
                        s = reader.readLine();
			
			  while(s != null)
			  {
                              array = s.split(delimiter);
                              lastName = array[2];
                              StringBuilder ln = new StringBuilder(name);
                              ln.setLength(NAME_FORMAT.length());
                              name = ln.toString();

				   if(name.equalsIgnoreCase(lastName))
				   {
					 System.out.println("#ID " + array[0] + "   First Name: " + array[1] +
							 "   Last Name: " + array[2] + "   Balance Owed: " + array[3]);
                                          count++;
				   }

                             s = reader.readLine();
                                 
			  }

                          if(count == 0)
                             {
                                System.out.println("SORRY!!! The record is not available!");
                             }
				   
			  reader.close();
		}
		catch(Exception e)
		{
			 System.out.println("Message: " + e);
		}
	}
}