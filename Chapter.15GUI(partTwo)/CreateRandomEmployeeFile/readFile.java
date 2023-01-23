import java.nio.file.*;
import java.nio.ByteBuffer;
import javax.swing.JOptionPane;
import java.nio.channels.FileChannel;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class readFile
{
    private Path file = Paths.get("/home/kelvino/Chapter.15/CreateRandomEmployeeFile/Employee.txt");
    private writeData data = new writeData();
    private String[] array = new String[4];
    private String s;
    private String delimiter = ",";
    private int id;
    private String StringId;
    private String firstName;
    private String lastName;
    private double payRate;
    
    public void setStringId(String id)
    {
        StringId = id;
    }
    public int getStringId()
    {
       id = Integer.parseInt(StringId);
       return id;
    }

    public void  reading()
    {
         s = data.getS();//Data formart saved in Employee file
         int RECSIZE = s.length();
         byte[] data = s.getBytes();
         ByteBuffer buffer = ByteBuffer.wrap(data);
         FileChannel fc = null;

        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ,WRITE);
            buffer = ByteBuffer.wrap(data);
            fc.position(this.getStringId() * s.length());
            fc.read(buffer);
            s = new String(data);
            array = s.split(delimiter);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
        }
    }
    public String[] getData()
    {
        return array;
    }
}