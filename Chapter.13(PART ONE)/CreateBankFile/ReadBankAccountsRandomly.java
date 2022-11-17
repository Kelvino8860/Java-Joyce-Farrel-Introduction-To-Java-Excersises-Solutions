/* c. Create an application that uses the file created by the user in Exercise 9a and
      allows the user to enter an account number to view the account balance. Allow the
      user to view additional account balances until entering an application-terminating
      value. Save the file as ReadBankAccountsRandomly.java.*/
	  
import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;

public class ReadBankAccountsRandomly
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CreateBankFile.txt");
		
		final String ID_FORMAT = "0000";
	    final String NAME_FORMAT = "        ";
	    final String BALANCE_FORMAT = "00000.00";
	    String delimiter = ",";
	    String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
		
		FileChannel fc = null;
		final int RECSIZE = s.length();
		int acctNum;
                double balance;
		
		try
		{
			fc = (FileChannel)Files.newByteChannel(file,READ);
			byte[] data = s.getBytes();
			ByteBuffer buffer = ByteBuffer.wrap(data);
			System.out.print("Enter account number >> ");
			acctNum = kb.nextInt();
			
			fc.position(acctNum * RECSIZE);
			fc.read(buffer);
			s = new String(data);
			String[] array = new String[3];
			array = s.split(delimiter);
			balance = Double.parseDouble(array[2]);
		    System.out.println("#ID: " + array[0] + "   Last name: " + array[1] + "   Balance: $" + balance);
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
}