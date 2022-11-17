/* b. Create an application that uses the file created by the user in Exercise 9a
      and displays all existing accounts in account-number order. Save the file as
      ReadBankAccountsSequentially.java.*/
	  
import java.nio.file.*;
import java.io.*;

public class ReadBankAccountsSequentially
{
public static void main(String[] args)
{
	Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CreateBankFile.txt");
	
	final String ID_FORMAT = "0000";
	final String NAME_FORMAT = "        ";
	final String BALANCE_FORMAT = "00000.00";
	String delimiter = ",";
	String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
	
	InputStream input = null;
	String[] array = new String[3];
	double balance;
	final String EMP = "0000";
	
	try
	{
		input = new BufferedInputStream(Files.newInputStream(file));
		BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		s = reader.readLine();
		
		while(s != null)
		{
			array = s.split(delimiter);
			
			if(!(array[0].equals(EMP)))
			{
                                balance = Double.parseDouble(array[2]);
				System.out.println("#ID: " + array[0] + "   Last name: " + array[1] + "   Balance: $" + balance);
			}
			
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