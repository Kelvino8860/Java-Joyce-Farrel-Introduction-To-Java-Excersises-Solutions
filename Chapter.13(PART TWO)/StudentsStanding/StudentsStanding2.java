/* b. Create an application that displays each record in the two files created in the
      StudentsStanding application in Exercise 8a. Display a heading to introduce the list
      produced from each file. For each record, display the ID number, first name, last
      name, grade point average, and the amount by which the grade point average exceeds
      or falls short of the 2.0 cutoff. Save the program as StudentsStanding2.java.*/
	  
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class StudentsStanding2
{
	public static void main(String[] args)
	{
		Path fileGood = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\StudentsGoodStanding.txt");
		Path fileBad = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\StudentsBadStanding.txt");
		
		final double LEAST_POINTS = 2.0;
		
		System.out.println("\nSTUDENTS WITH AVERAGE POINTS ABOVE OR EQUAL TO " + LEAST_POINTS);
		displayFile(fileGood,LEAST_POINTS);
		System.out.println("\nSTUDENTS WITH AVERAGE POINTS BELOW " + LEAST_POINTS);
		displayFile(fileBad,LEAST_POINTS);
		
	}

    public static void displayFile(Path file, double LEAST_POINTS)	
	{
		
		final String ID_FORMAT = "000";
		final String NAME_FORMAT = "          ";
		final String GRADE_FORMAT = "00.00";
		String delimiter = ",";
		String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter + NAME_FORMAT +
		             GRADE_FORMAT + System.getProperty("line.separator");
		
		InputStream input = null;
		final String EMPTYID = "000";
		double grade, gradeDiff = 0;
		String[] array = new String[4];
		
		try
		{
			input = new BufferedInputStream(Files.newInputStream(file));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			s = reader.readLine();
			  while(s != null)
			  {
				  array = s.split(delimiter);
				  if(!(array[0].equals(EMPTYID)))
				  {
					  grade = Double.parseDouble(array[3]);
					  
					    if(grade >= LEAST_POINTS)
						{
							gradeDiff = grade - LEAST_POINTS;
							System.out.println("#ID: " + array[0] + "   First Name: " + array[1] +
					          "   Last Name: " + array[2] + "   Grade Point Average: " + array[3] +
						      "   Grade Exceeds cutoff(" + LEAST_POINTS + ") by: " + gradeDiff);
						}
						else
							if(grade < LEAST_POINTS)
							{
								gradeDiff = LEAST_POINTS - grade;
								System.out.println("#ID: " + array[0] + "   First Name: " + array[1] +
					              "   Last Name: " + array[2] + "   Grade Point Average: " + array[3] +
						          "   Grade Falls Short of cutoff(" + LEAST_POINTS + ") by: " + gradeDiff);
							}
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