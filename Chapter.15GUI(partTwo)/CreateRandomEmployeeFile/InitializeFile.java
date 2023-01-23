/*Initialize Employee data file */

import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;

public class InitializeFile
{
    public static void main(String[] args)
    {
        Path file = Paths.get("/home/kelvino/Chapter.15/CreateRandomEmployeeFile/Employee.txt");
        String s = "00,          ,          ,00.00" + System.getProperty("line.separator");
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        final int NUMRECS = 100;

        try {
              OutputStream output = new BufferedOutputStream(Files.newOutputStream(file,CREATE,WRITE));
              BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

              for(int i = 0; i < NUMRECS; ++i)
                 writer.write(s,0,s.length());
                 writer.close();

        } catch (Exception e) {
            
            System.out.println("Error message: " + e);
        }
    }
}