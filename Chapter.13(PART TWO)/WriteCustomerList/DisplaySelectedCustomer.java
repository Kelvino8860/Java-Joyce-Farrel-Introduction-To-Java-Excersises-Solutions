/* c. Write an application that allows you to enter any ID number, reads the customer
      data file created in Exercise 5a, and displays the data for the customer. Display an
      appropriate message if the ID number cannot be found in the input file. Save the file
      as DisplaySelectedCustomer.java.*/
	  
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import static java.nio.file.StandardOpenOption.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;

public class DisplaySelectedCustomer
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
					
	     final int RECSIZE = s.length();
		 String[] array = new String[4];
		 byte[] data = s.getBytes();
		 
		 try
		 {
			 FileChannel fc = (FileChannel)Files.newByteChannel(file,READ);
			 ByteBuffer buffer = ByteBuffer.wrap(data);
			 int findAcct;
			 System.out.print("\nEnter account number to seek >> ");
			 findAcct = kb.nextInt();
			 
			 fc.position(findAcct * RECSIZE);
			 fc.read(buffer);
			 s = new String(data);
			 
			 array = s.split(delimiter);
			 
			 if((array[0].equals("000")))
			 {
				 System.out.println("Sorry!!! The record does not exist!");
			 }
			 else
				 System.out.println("Desired record: " + s);
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
		 
	 }
}