/* 10. a. Write a program that allows you to create a file of customers for a company.
          The first part of the program should create an empty file suitable for writing a
          three-digit ID number, six-character last name, and five-digit zip code for each
          customer. The second half of the program accepts user input to populate the file.
		  For this exercise, assume that the user will correctly enter ID numbers and zip
  		  codes, but force the customer name to seven characters if it is too long or too
		  short. Issue an error message, and do not save the records if the user tries to save
          a record with an ID number that has already been used. Save the program as
		  CreateCustomerFile.java.*/

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
		  
public class CreateCustomerFile
{
	 public static void main(String[] args)
	 {
		 Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CustomerFile.txt");
		 
		 final String ID_FORMAT = "000";
		 final String NAME_FORMAT = "      ";
		 final String ZIP_FORMAT = "00000";
		 String delimiter = ",";
		 String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + ZIP_FORMAT + System.getProperty("line.separator");
		 
		 initializeFile(file,s);
		 
	 }
	 
	 public static void initializeFile(Path file, String s)
	 {
		 final int RECSIZE = 1000;
		 
		 try
		 {
				 OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
				 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
				 
				 for(int count = 0; count < RECSIZE; ++count)
				 {
					 writer.write(s,0,s.length());
				 }
				 writer.close();
	     }
       catch(Exception e)
	   {
		    System.out.println("Message: " + e);
       }
           inputCustomer(file, s, RECSIZE);		   
	 }
	 
	 public static void inputCustomer(Path file, String s, int NUMRECS)
	 {
                 Scanner kb = new Scanner(System.in);
		 InputStream input = null;
		 String idNum, lastName, zipCode;
		 final String QUIT = "999";
		 final int RECSIZE = s.length();
		 int id;
		 String[] array = new String[3];
		 String delimiter = ",";
		 
		 FileChannel fc = null;
		 
		 try
		 {
			 boolean idAvail = false;
                         String StringId = "";
			 System.out.print("Enter customer's ID number >> ");
			 idNum = kb.nextLine();
			 
			 while(!(idNum.equals(QUIT)))
			 {
				 System.out.print("Enter customer's last name >> ");
				 lastName = kb.nextLine();
				 StringBuilder sb = new StringBuilder(lastName);
				 sb.setLength(6);
				 lastName = sb.toString();
				 
				 System.out.print("Enter customer's zip code >> ");
				 zipCode = kb.nextLine();
				 
				 //Ensure id no id number is entered twice
				input = new BufferedInputStream(Files.newInputStream(file,READ));
				BufferedReader reader = new BufferedReader(new InputStreamReader(input));
				s = reader.readLine();
				  for(int j = 0; j < NUMRECS; ++j)
				  {
					  array = s.split(delimiter);
                                          StringId = array[0];
					  if(StringId.equals(idNum))
					  {
						  idAvail = true;
						  System.out.println("ERROR!! ID NUMBER EXISTS!!");
						  break;
					  }
                                     s = reader.readLine();
				  }
				  
				  //If id number is not repeated
				  //Write record to file
				  if(idAvail == false)
				  {
					  s = idNum + delimiter + lastName + delimiter + zipCode + System.getProperty("line.separator");
					  byte[] data = s.getBytes();
					  ByteBuffer buffer = ByteBuffer.wrap(data);
					  id = Integer.parseInt(idNum);
					  fc = (FileChannel)Files.newByteChannel(file,READ,WRITE);
					  fc.position(id * RECSIZE);
					  fc.write(buffer);
					  fc.close();
				  }
				  
				  System.out.print("Enter customer's ID number or " + QUIT + " to quit >> ");
			      idNum = kb.nextLine();
				  
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
	 }
}