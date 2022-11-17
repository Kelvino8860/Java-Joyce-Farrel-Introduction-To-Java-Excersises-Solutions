/*1. Create a file using any word-processing program or text editor. Write an application
that displays the file’s name, containing folder, size, and time of last modification.
Save the file as FileStatistics.java.*/

import java.nio.file.*;
import java.io.IOException;
import java.nio.file.attribute.*;

public class FileStatistics
{
   public static void main(String[] args)
      {
	      Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\FileStats.txt");
		  
		  try
		    {
			   BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
			   System.out.println("\nFile Name: " + file.getFileName() + "\nContaining folder: " + file.getName(4) +
			          "\nCreation time: " + attr.creationTime() + "\nLast modified time: " + attr.lastModifiedTime() + 
					  "\nFile size: " + attr.size());
			}
		catch(IOException e)
		    {
			    System.out.println(e);
			}
	  }
}