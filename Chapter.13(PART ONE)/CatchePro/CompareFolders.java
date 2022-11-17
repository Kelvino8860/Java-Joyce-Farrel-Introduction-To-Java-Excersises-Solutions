/* Create three files of any type you choose—for example, word-processing documents,
   spreadsheets, or pictures. Write an application that determines whether the first two
   files are located in the same folder as the third one. Test the program when the files are
   in the same folder and when they are not. Save the file as CompareFolders.java*/
   
import java.io.*;

public class CompareFolders
{
    public static void main(String[] args)
	  {
	     File file1 = new File("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\Image.jpg");
		 File file2 = new File("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\Number2.txt");
		 File file3 = new File("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\Number2a.xlsx");
		 
	     //Check whether files 2 & 3 are located in the same folder as file 1
            if(file2.exists() && file3.exists() && file1.exists())
                {
				    System.out.println("\nAll the files are in the same folder");
                }	
            else 
              if(file2.exists() && file3.exists() && !(file1.exists()))		
                {
				    System.out.println("\nImage.jpg does not reside in Chapter.13 folder");
                }				
	  }
}   