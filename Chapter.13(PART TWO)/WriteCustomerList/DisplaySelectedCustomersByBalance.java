/* e. Write an application that allows you to enter any purchase amount and displays
      all the data for customers with balances greater than the entered value. Display
      an appropriate message if no customers meet the criteria. Save the file as
      DisplaySelectedCustomersByBalance.java*/
	  
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

public class DisplaySelectedCustomersByBalance
{
	public static void main(String[] args)
	{
		 Scanner kb = new Scanner(System.in);
		 Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CustomerRecords.txt");
		 
		 final String ID_FORMAT = "000";
		 final String NAME_FORMAT = "          ";
		 final String BALANCE_FORMAT = "0000.00";
		 String delimiter = ",";
		 String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + NAME_FORMAT +
		    delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
		
		byte[] data = s.getBytes();
		String[] array = new String[4];
		double balance;
		
		try
		{
			InputStream input = new BufferedInputStream(Files.newInputStream(file, READ));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			
			System.out.print("\nEnter purchase amount >> ");
			double amount = kb.nextDouble();
			int count = 0;
			s = reader.readLine();
			
			while(s != null)
			{
				 array = s.split(delimiter);
				 balance = Double.parseDouble(array[3]);
				 
				 if(balance > amount)
				 {
					 System.out.println("#ID " + array[0] + "   First Name: " + array[1] +
							 "   Last Name: " + array[2] + "   Balance Owed: " + array[3]);
				     count++;
				 }
				 s = reader.readLine();
			}
			
			  if(count == 0)
			  {
				   System.out.println("Sorry!!! No customer meets the criteria");
			  }
			reader.close();
		}
		catch(Exception e)
		{
			 System.out.println("Message: " + e);
		}
	}
}	