import java.io.*;
import java.nio.file.*;
import java.nio.ByteBuffer;
import java.util.*;
import javax.swing.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.channels.FileChannel;
import java.text.*;

public class writeData 
{
   private String idNum = "00";
   private String firstName = "          ";
   private String lastName = "          ";
   private String payRate = "00.00";
   private final int NAME_LENGTH = 10;
   private final String DECIMAL_FORMAT = "00.00";
   private String delimiter = ",";
   private String s = idNum + delimiter + firstName + delimiter + lastName + delimiter +
                     payRate + System.getProperty("line.separator");
   private Path file = Paths.get("/home/kelvino/Chapter.15/CreateRandomEmployeeFile/Employee.txt");

   public void setIdNum(String ids) throws IdNumException
   {
       int id = Integer.parseInt(ids);
      if(id < 100)
      {
         if(ids.length() == 2)
           idNum = ids;
           else
           {
              StringBuilder sb = new StringBuilder(ids);
              sb.insert(0,"0");
              idNum = sb.toString();
           }
      }
       else
       if(id > 100)
       throw(new IdNumException());
   }
   public void setName(String first, String second)
   {
      StringBuilder name = new StringBuilder(first);
      name.setLength(NAME_LENGTH);
      firstName = name.toString();

      StringBuilder name2 = new StringBuilder(second);
      name2.setLength(NAME_LENGTH);
      lastName = name2.toString();

   }
   public void setPayRate(double rate)
   {
             DecimalFormat df = new DecimalFormat(DECIMAL_FORMAT);
             payRate = df.format(rate);
   }
   public String getIdNum()
   {
      return idNum;
   }
   public String getFirstName()
   {
    return firstName;
   }
   public String getLastName()
   {
    return lastName;
   }
   public String getPayRate()
   {
    return payRate;
   }
   public String getS()
   {
    return s;
   }
   public void writeFile()
   {
      s = this.getIdNum() + delimiter + this.getFirstName() + delimiter +
                  this.getLastName() + delimiter + this.getPayRate() + System.getProperty("line.separator");
      byte[] data = s.getBytes();
      ByteBuffer buffer = ByteBuffer.wrap(data);
      FileChannel fc = null;
      final int RECSIZE = s.length();
      int idLength = Integer.parseInt(this.getIdNum());

      try
      {
           fc = (FileChannel)Files.newByteChannel(file, READ,WRITE);
           fc.position(idLength * s.length());
           fc.write(buffer);
           fc.close();
      }
      catch(Exception e)
      {
          JOptionPane.showMessageDialog(null, e);
      }
   }
}