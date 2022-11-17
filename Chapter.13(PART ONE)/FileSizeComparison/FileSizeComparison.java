/*3. Create a file that contains your favorite song lyric. Use a text editor such as Notepad,
     and save the file. Copy the file contents, and paste them into a word-processing
     program such as Word. Write an application that displays the sizes of the two files as
     well as the ratio of their sizes to each other. Save the file as FileSizeComparison.java*/
	 
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class FileSizeComparison
{
   public static void main(String[] args)
      {
	     Path file1 = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\FavouriteLyrics.rtf");
		 Path file2 = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\FavouriteSongLyrics.txt");
		 
		 try
		 {
		    BasicFileAttributes attr = Files.readAttributes(file1, BasicFileAttributes.class);
			BasicFileAttributes attr2 = Files.readAttributes(file2, BasicFileAttributes.class);
			
			System.out.println("\nFile path of file1 is: " + file1.toString() +
			      "\nFile size of file1 is: " + attr.size());
				  
		    System.out.println("\nFile path of file2 is: " + file2.toString() +
			      "\nFile size of file1 is: " + attr2.size());
				  
		//Ratio of their sizes
		   System.out.println("\nfile1 : file2 >> " + attr.size()+ ":" + attr2.size());
		 }
		 catch(IOException e)
		  {
		    System.out.println("IOException");
		  }
	  }
}
