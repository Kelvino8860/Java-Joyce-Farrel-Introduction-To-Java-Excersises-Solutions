/* 8. a. Create an application that allows you to enter student data that consists of an ID
         number, first name, last name, and grade point average. Depending on whether
         the student’s grade point average is at least 2.0, output each record either to a file
         of students in good standing or those on academic probation. Save the program as
         StudentsStanding.java.*/
		 
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.text.*;

public class StudentsStanding
{
	 public static void main(String[] args)
	 {
		  Path fileGood = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\StudentsGoodStanding.txt");
		  Path fileBad = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\StudentsBadStanding.txt");
		  
		  final String ID_FORMAT = "000";
		  final String NAME_FORMAT = "          ";
		  final int NAME_LENGTH = NAME_FORMAT.length();
		  final String GRADE_FORMAT = "00.00";
		  String delimiter = ",";
		  final String QUIT = "999";
		  final double LEAST_POINTS = 2.0;
		  String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + NAME_FORMAT +
		             delimiter + GRADE_FORMAT + System.getProperty("line.separator");
	      final int RECSIZE = s.length();		 
					 
					  //Initialize the files to default records to be
			         //able to write the files randomly
                  initializeFile(fileGood,s);
                  initializeFile(fileBad,s);
					 
		  FileChannel fcGood = null;
		  FileChannel fcBad = null;
		  Scanner input = new Scanner(System.in);
		  String firstName;
		  String secondName;
		  double averagePoints;
		  String idNum;
		  int idNumber;
		  
		  try
		  {
			  fcGood = (FileChannel)Files.newByteChannel(fileGood, CREATE, WRITE);
			  fcBad = (FileChannel)Files.newByteChannel(fileBad, CREATE, WRITE);
			  
			   System.out.print("Enter student’s ID number >> ");
			   idNum = input.nextLine();
			   
			   while(!(idNum.equals(QUIT)))
			   {
				   idNumber = Integer.parseInt(idNum);
				   System.out.print("Enter student’s first name >> ");
				   firstName = input.nextLine();
				   //Ensure the name is in correct format
				   StringBuilder sb = new StringBuilder(firstName);
				   sb.setLength(NAME_LENGTH);
				   firstName = sb.toString();
				   
				   System.out.print("Enter student’s last name >> ");
				   secondName = input.nextLine();
				   //Ensure the name is in correct format
				   StringBuilder sb2 = new StringBuilder(secondName);
				   sb2.setLength(NAME_LENGTH);
				   secondName = sb2.toString();
				   
				   System.out.print("Enter student’s average points >> ");
				   averagePoints = input.nextDouble();
				   input.nextLine();
				    
				//Ensure the averagePoints are in correctFormat
			    DecimalFormat df = new DecimalFormat(GRADE_FORMAT);
				
				s = idNum + delimiter + firstName + delimiter + secondName +
					 delimiter + df.format(averagePoints) + System.getProperty("line.separator");
							   
                byte[] data = s.getBytes();
                ByteBuffer buffer = ByteBuffer.wrap(data); 				
				
				//Validate file entry
				if(averagePoints < LEAST_POINTS)
				{
					 fcBad.position(idNumber * RECSIZE);
					 fcBad.write(buffer);
				}
				else
					if(averagePoints >= LEAST_POINTS)
					{
						fcGood.position(idNumber * RECSIZE);
						fcGood.write(buffer);
					}
					
			      System.out.print("Enter student’s ID number or " + QUIT + " to quit >> ");
                  idNum = input.nextLine();				  
			   }
			   fcBad.close();
			   fcGood.close();
		  }
		  catch(Exception e)
		  {
			   System.out.println("Message: " + e);
		  }
	 }
	 
	 public static void initializeFile(Path file, String s)
	 {
		 final int NUMRECS = 1000;
		 
		 try
		 {
		     OutputStream output = new BufferedOutputStream(Files.newOutputStream(file));
		     BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
		 
		     for(int count = 0; count < NUMRECS; ++count)
		     {
			     writer.write(s, 0, s.length());
		     }
		     writer.close();
		 }
		 catch(Exception e)
		 {
			  System.out.println("Message: " + e);
	         }
		 	 
	 }
}