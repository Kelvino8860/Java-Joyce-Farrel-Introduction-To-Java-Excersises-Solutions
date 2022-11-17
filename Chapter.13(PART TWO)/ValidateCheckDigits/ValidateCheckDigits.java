/* 6. Using a text editor, create a file that contains a list of at least 10 six-digit account
      numbers. Read in each account number and display whether it is valid. An account
      number is valid only if the last digit is equal to the sum of the first five digits
      divided by 10. For example, the number 223355 is valid because the sum of the first
      five digits is 15, the remainder when 15 is divided by 10 is 5, and the last digit is 5.
      Write only valid account numbers to an output file, each on its own line. Save the
      application as ValidateCheckDigits.java.*/
	  
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class ValidateCheckDigits
{
  public static void main(String[] args)
    {
	   Path readFile = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\ValidateCheckDigits.txt");
	   Path writeFile = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\WriteValidateCheckDigits.txt");
	   
	   String recFormat = "000000";
	   String s = recFormat + System.getProperty("line.separator");
	   String w = "";
	   char[] numsArr = new char[6];
	   int numsTotal = 0, nums;
	   
	   try
	   {
		   InputStream input = new BufferedInputStream(Files.newInputStream(readFile, READ));
		   BufferedReader reader = new BufferedReader(new InputStreamReader(input));
		   s = reader.readLine();
		   
		   while(s != null)
		   {
			    for(int i = 0; i < numsArr.length; ++i)
				{
					numsArr[i] = s.charAt(i);
				}
				
				for(int i = 0; i <= 4; ++i)
				{
					nums = Character.getNumericValue(numsArr[i]);
					numsTotal += nums;
				}
				
           //If the acount is valid it should be printed out
				if(((numsTotal % 10) == Character.getNumericValue(numsArr[5])))
				{
					w += s + System.getProperty("line.separator");
					OutputStream output = new BufferedOutputStream(Files.newOutputStream(writeFile));
                                        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
                                        writer.write(w, 0, w.length());
                                        writer.close();
					
				}
				s = reader.readLine();
                         numsTotal = 0;
		   }
		   reader.close();
	   }
	   catch(Exception e)
	   {
		   System.out.println("Message: " + e);
	   }
	   
	}
}