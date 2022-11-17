/* c. Write an application that takes customer orders. Allow a user to enter a
      customer number and item ordered. Display an error message if the customer
      number does not exist in the customer file or the item does not exist in the item
      file; otherwise, display all the customer information and item information. Save
      the program as CustomerItemOrder.java*/
	  
import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CustomerItemOrder
{
	 public static void main(String[] args)
	 {
		 Scanner kb = new Scanner(System.in);
		 Path customerFile = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CustomerFile.txt");
		 Path itemFile = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CreateItemFile.txt");
		 
		 String idNum;
		 String itemNum = "";
		 
		 System.out.print("Enter customer's ID number >> ");
		 idNum = kb.nextLine();
		 //Check customer's id number if its in the records
		 checkID(customerFile,idNum);
		 
		 if(checkID(customerFile,idNum) == false)
		 {
			 JOptionPane.showMessageDialog(null, "ERROR!!! \nThe ID NUMBER does not exist");
		 }
		 else
		 {
		     System.out.print("Enter item number >> ");
		     itemNum = kb.nextLine();
		     //Check item number if it's in the records
		     checkItem(itemFile,itemNum);
		 }
		 
		 if(checkItem(itemFile,itemNum) == false)
		 {
			 JOptionPane.showMessageDialog(null, "ERROR!!! \nThe ITEM NUMBER does not exist");
		 }
		 else
		 {
			 displayOrder(customerFile,itemFile,idNum,itemNum);
		 }
		 
	 }
	 
	 /* Display customers info and item orderd info
	 */
	 public static void displayOrder(Path customerFile, Path itemFile, String idNum, String itemNum)
	 {
		 FileChannel fcCustomer = null;
		 FileChannel fcItem = null;
		 
		 final String ID_FORMAT = "000";
		 final String NAME_FORMAT = "      ";
		 final String ZIP_FORMAT = "00000";
		 String delimiter = ",";
		 String sCustomer = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + ZIP_FORMAT + System.getProperty("line.separator");
		 byte[] dataCustomer = sCustomer.getBytes();
		 final int RECSIZE_CUSTOMER = sCustomer.length();
		 
		 final String ITEM_NUMBER_FORMAT = "000";
		 final String DESCRIPTION_FORMAT = "                    ";
		 final int DESC_LENGTH = DESCRIPTION_FORMAT.length();
		 String sItem = ITEM_NUMBER_FORMAT + delimiter + DESCRIPTION_FORMAT + System.getProperty("line.separator");
		 byte[] dataItem = sItem.getBytes();
		 final int RECSIZE_ITEM = sItem.length();
		 
		 int id,item;
		 	 
		 try
		 {
			 id = Integer.parseInt(idNum);
			 item = Integer.parseInt(itemNum);
			 
			 fcCustomer = (FileChannel)Files.newByteChannel(customerFile, READ);
			 ByteBuffer bufferCustomer = ByteBuffer.wrap(dataCustomer);
			 fcCustomer.position(id * RECSIZE_CUSTOMER);
			 fcCustomer.read(bufferCustomer);
			 sCustomer = new String(dataCustomer);
			 
			 fcItem = (FileChannel)Files.newByteChannel(itemFile, READ);
			 ByteBuffer bufferItem = ByteBuffer.wrap(dataItem);
			 fcItem.position(item * RECSIZE_ITEM);
			 fcItem.read(bufferItem);
			 sItem = new String(dataItem);
			 
			 System.out.println("\nDesired customer record: " + sCustomer);
			 System.out.println( "Desired item record: " + sItem);
			 	 
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
		 
	 }
	 
	 
	 
	 /*Returns true if customer's id entered is in the records
	 */
	 public static boolean checkID(Path customerFile, String idNum)
	 {
		 boolean available = false;
		 
		 InputStream input = null;
		 String[] array = new String[3];
		 String delimiter = ",";
		 String s,temp;
		 
		 try
		 {
			 input = new BufferedInputStream(Files.newInputStream(customerFile));
			 BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			 s = reader.readLine();
			 while(s != null)
			 {
				 array = s.split(delimiter);
				 temp = array[0];
				 
				 if(temp.equals(idNum))
				 {
					 available = true;
					 break;
				 }
				 
				 s = reader.readLine();
			 }
			 reader.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
		 
		 return available;
	 }
	 
	 /* Return true if the item number entered by user is in the records
	 */
	 public static boolean checkItem(Path itemFile, String itemNum)
	 {
		  boolean available = false;
		 
		 InputStream input = null;
		 String[] array = new String[2];
		 String delimiter = ",";
		 String s,temp;
		 
		 try
		 {
			 input = new BufferedInputStream(Files.newInputStream(itemFile));
			 BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			 s = reader.readLine();
			 while(s != null)
			 {
				 array = s.split(delimiter);
				 temp = array[0];
				 
				 if(temp.equals(itemNum))
				 {
					 available = true;
					 break;
				 }
				 
				 s = reader.readLine();
			 }
			 reader.close();
		 }
		 catch(Exception e)
		 {
			 System.out.println("Message: " + e);
		 }
		 
		 return available;
	 }
}