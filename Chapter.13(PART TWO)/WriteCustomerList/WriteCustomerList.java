/* 5. a. Create a program that allows a user to input customer records (ID number, first
         name, last name, and balance owed) and save each record to a file. Save the
         program as WriteCustomerList.java. When you execute the program, be sure to
         enter multiple records that have the same last name because you will search for
         repeated first names in part d of this exercise.*/
		 
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.text.*;

public class WriteCustomerList
{
	 public static void main(String[] args)
	 {
		 Scanner input = new Scanner(System.in);
		 Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CustomerRecords.txt");
		 final String ID_FORMAT = "000";
		 final String NAME_FORMAT = "          ";
		 final String BALANCE_FORMAT = "0000.00";
		 final int NAME_LENGTH = NAME_FORMAT.length();
		 String delimiter = ",";
		 String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + NAME_FORMAT + delimiter + BALANCE_FORMAT +
		           System.getProperty("line.separator");
		 
		 final int RECSIZE = s.length();
		 
		 FileChannel fc = null;
		 
		 String idNumber;
		 int id;
		 String firstName;
		 String lastName;
		 double balance;
		 final String QUIT = "999";
		 
		 //Create an empty file and record default values
		 createEmptyFile(file, s);
		 
		 //Start recording data into the records  
		 try
		 {
			 fc = (FileChannel)Files.newByteChannel(file, CREATE, WRITE);
			 
			 System.out.print("Enter customer's ID number >> ");
			 idNumber = input.nextLine();  
			 
			 while(!(idNumber.equals(QUIT)))
			 {
				  id = Integer.parseInt(idNumber);
				  System.out.print("Enter customer's first name >> ");
				  firstName = input.nextLine();
				  
				  //Ensure the name is in uniform length
				  StringBuilder fn = new StringBuilder(firstName);
				  fn.setLength(NAME_LENGTH);
				  firstName = fn.toString();
				  
				  System.out.print("Enter customer's last name >> ");
				  lastName = input.nextLine();
				  
				  //Ensure the name is in uniform length
				  StringBuilder ln = new StringBuilder(lastName);
				  ln.setLength(NAME_LENGTH);
				  lastName = ln.toString();
				  
				  System.out.print("Enter balance owed >> ");
				  balance = input.nextDouble();
				  input.nextLine();
				  
				  //Use the DecimalFormat class to ensure the balance
				  //meets the required format
				   DecimalFormat df = new DecimalFormat(BALANCE_FORMAT);
				   
				   s = idNumber + delimiter + firstName + delimiter + lastName + delimiter +
				         df.format(balance) + System.getProperty("line.separator");
						 
				  byte[] data = s.getBytes();
				  ByteBuffer buffer = ByteBuffer.wrap(data);
				  fc.position(id * RECSIZE);
				  fc.write(buffer);
				  
				  System.out.print("Enter next customer's ID or " + QUIT + " to quit >> ");
				  idNumber = input.nextLine();
			 }
				 
		 }
		 catch(Exception e)
		 {
			  System.out.println("Message: " + e);
		 }
		 
	 }
	 
	public static void createEmptyFile(Path file, String s)
	{
		final int RECSIZE = 1000;
		
		try
		{
		    OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		
			for(int count = 0; count < RECSIZE; ++count)
				writer.write(s, 0, s.length());
				writer.close();
		}
		catch(Exception e)
		{
			 System.out.println("Message: " + e);
		}
	}		
}