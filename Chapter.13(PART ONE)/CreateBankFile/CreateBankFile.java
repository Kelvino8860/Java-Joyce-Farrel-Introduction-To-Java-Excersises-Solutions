/* 9. a. The Rochester Bank maintains customer records in a random access file. Write
         an application that creates 10,000 blank records and then allows the user to enter
         customer account information, including an account number that is 9999 or less,
         a last name, and a balance. Insert each new record into a data file at a location that
         is equal to the account number. Assume that the user will not enter invalid
         account numbers. Force each name to eight characters, padding it with spaces
         or truncating it if necessary. Also assume that the user will not enter a bank
         balance greater than 99,000.00. Save the file as CreateBankFile.java.*/
		 
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.text.*;

public class CreateBankFile
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CreateBankFile.txt");
		
		final String ID_FORMAT = "0000";
		final String NAME_FORMAT = "        ";
		final String BALANCE_FORMAT = "00000.00";
		String delimiter = ",";
		String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + BALANCE_FORMAT + System.getProperty("line.separator");
		final int RECSIZE = s.length();
		final String QUIT = "9999";
		
		initializeFile(file, s);
		
		FileChannel fc = null;
		String idNum;
		String name;
		double balance;
		int id;
		
		try
		{
			fc = (FileChannel)Files.newByteChannel(file, READ,WRITE);
			System.out.print("Enter customer's ID number >> ");
			idNum = input.nextLine();
			
			while(!(idNum.equals(QUIT)))
			{
				System.out.print("Enter last name >> ");
				name = input.nextLine();
				StringBuilder sb = new StringBuilder(name);
				sb.setLength(NAME_FORMAT.length());
				name = sb.toString();
				
				System.out.print("Enter balance >> ");
				balance = input.nextDouble();
				input.nextLine();
				DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
				
				s = idNum + delimiter + name + delimiter + df.format(balance) + System.getProperty("line.separator");
				id = Integer.parseInt(idNum);
				byte[] data = s.getBytes();
				ByteBuffer buffer = ByteBuffer.wrap(data);
				
				fc.position(id * RECSIZE);
				fc.write(buffer);
				
				System.out.print("Enter next id number or " + QUIT + " to quit >> ");
				idNum = input.nextLine();
				
			}
			fc.close();
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
	}
	
	public static void initializeFile(Path file, String s)
	{
		final int NUMRECS = 10000;

            try
             {
		OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		for(int count = 0; count < NUMRECS; ++count)
			writer.write(s, 0, s.length());
		writer.close();
             }
           catch(Exception e)
             {
                 System.out.println("Message: " + e);
             }
	}
}