/* b. Write a program that creates a file of items carried by the company. Include a
      three-digit item number and up to a 20-character description for each item.
	  Issue an error message if the user tries to store an item number that has already
	  been used. Save the program as CreateItemFile.java.*/
	  
import java.util.Scanner;
import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;

public class CreateItemFile
{
	 public static void main(String[] args)
	 {
		 Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CreateItemFile.txt");
		 
		 final String ITEM_NUMBER_FORMAT = "000";
		 final String DESCRIPTION_FORMAT = "                    ";
		 String delimiter = ",";
		 final int DESC_LENGTH = DESCRIPTION_FORMAT.length();
		 String s = ITEM_NUMBER_FORMAT + delimiter + DESCRIPTION_FORMAT + System.getProperty("line.separator");
		 
		 initializeFile(file,s,DESC_LENGTH);
	 }
	 
	 /*
	 Initialize file
	 */
	 public static void initializeFile(Path file, String s, int DESC_LENGTH)
	 {
		 final int RECSIZE = 1000;
		 OutputStream output = null;
		 
		 try
		 {
			 output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
			 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
			 for(int count = 0; count < RECSIZE; ++count)
				 writer.write(s,0,s.length());
			 writer.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
		 
		 writeRecords(file,s,DESC_LENGTH);
	 }
	 
	 /*
	 Write items numbers and description and record them in 
	 the initialized file
	 */
	 public static void writeRecords(Path file, String s, int DESC_LENGTH)
	 {
		 Scanner kb = new Scanner(System.in);
		 FileChannel fc = null;
		 
		 String itemNum;
		 String itemDescription;
		 String delimiter = ",";
		 int item;
		 final String QUIT = "999";
		 
		 System.out.print("Enter items's number >> ");
		 itemNum = kb.nextLine();
		 while(!(itemNum.equals(QUIT)))
		 {
			 item = Integer.parseInt(itemNum);
			 System.out.print("Enter items's description >> ");
			 itemDescription = kb.nextLine();
			 //Ensure the item's description meets the required format
			 StringBuilder sb = new StringBuilder(itemDescription);
			 sb.setLength(DESC_LENGTH);
			 itemDescription = sb.toString();
			 s = itemNum + delimiter + itemDescription + System.getProperty("line.separator");
			 
			 //If the user inputs an item number that already exists 
			 //poduce an error
			 checkForError(file,s,itemNum);
			 
			 if(checkForError(file,s,itemNum) == true)
			 {
				 JOptionPane.showMessageDialog(null, "ERROR!" + "\nThe item already exists in the records");
			 }
			 else
			 {
				  try
			      {
					 fc = (FileChannel)Files.newByteChannel(file,READ,WRITE);
					 byte[] data = s.getBytes();
					 ByteBuffer buffer = ByteBuffer.wrap(data);
					 fc.position(item * s.length());
					 fc.write(buffer);
					 fc.close();
				 
			      }
			    catch(Exception e)
			      {
				     System.out.println("Message: " + e);
			      }
			 }
			 
			 
			 System.out.print("Enter item's number or " + QUIT + " to quit >> ");
			 itemNum = kb.nextLine();
		 }
	 }
	 
	 /*
	   Check if user tries to enter an item number that already exists
	   and return true if the item number exists
	 */
	 public static boolean checkForError(Path file, String s, String itemNum)
	 {
		 boolean itemAvailable = false;
		 
		 InputStream input = null;
		 String[] array = new String[2];
		 String delimiter = ",";
		 String temp;
		 
		 try
		 {
			 input = new BufferedInputStream(Files.newInputStream(file,READ));
			 BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			 s = reader.readLine();
			 
			 while(s != null)
			 {
				 array = s.split(delimiter);
				 temp = array[0];
				 
				 if(temp.equals(itemNum))
				 {
					 itemAvailable = true;
					 break;
				 }
				
               s = reader.readLine();				
			 }
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
		 
		 return itemAvailable;
	 }
}