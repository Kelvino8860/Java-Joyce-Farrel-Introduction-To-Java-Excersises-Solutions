/* 4. Write an application that determines which, if any, of the following files are
      stored in the folder where you have saved the exercises created in this chapter:
      autoexec.bat, CompareFolders.java, FileStatistics.class, and Hello.doc. Save the file
      as FindSelectedFiles.java*/
	  
import java.io.*;

public class FindSelectedFiles
{
   public static void main(String[] args)
     {
	    String fileName = "";
		String[] array = {"autoexec.bat", "CompareFolders.java", "FileStatistics.class", "Hello.doc"};
		
		for(int count = 0; count < array.length; ++count)
		    {
                            fileName = array[count];
			    File file = new File("C:\\Users\\NJORO\\Desktop\\Chapter.13\\CatchePro\\" + fileName);
				
				if(file.exists())
				   {
				       System.out.println(array[count] + " exists in CatchePro folder");
				   }
                                else
                                  System.out.println(fileName + " not available in CatchePro folder");
			}
	 }
}