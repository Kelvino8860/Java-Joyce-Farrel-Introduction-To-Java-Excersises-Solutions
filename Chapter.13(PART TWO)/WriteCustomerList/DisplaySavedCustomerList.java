/* b. Write an application that reads the file created by the WriteCustomerList
      application and displays the records. Save the file as
      DisplaySavedCustomerList.java*/
	  
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;

public class DisplaySavedCustomerList
{
	 public static void main(String[] args)
	 {
		  Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\CustomerRecords.txt");
		  
		  final String ID_FORMAT = "000";
		  final String NAME_FORMAT = "          ";
		  final String BALANCE_FORMAT = "0000.00";
		  String delimiter = ",";
		  String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + NAME_FORMAT + delimiter + BALANCE_FORMAT +
		             System.getProperty("line.separator");
					 
	      byte[] data = s.getBytes();
		  String[] array = new String[4];
		  final String EMPTY_ACCT = "000";
					 
					 try
					 {
						  InputStream input = new BufferedInputStream(Files.newInputStream(file, READ));
						  BufferedReader reader = new BufferedReader(new InputStreamReader(input));
						  s = reader.readLine();
						  
						  while(s != null)
						  {
							   array = s.split(delimiter);
							   
							   if(!(array[0].equals(EMPTY_ACCT)))
							   {
								   System.out.println("#ID " + array[0] + "   First Name: " + array[1] +
								        "   Last Name: " + array[2] + "   Balance Owed: " + array[3]);
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