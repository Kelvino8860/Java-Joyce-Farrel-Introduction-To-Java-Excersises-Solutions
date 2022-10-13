/* b. Write an application in which you assign data to a mix of 10 IncomingPhoneCall
      and OutgoingPhoneCall objects into an array. Use a for loop to display the data.
      Save the file as PhoneCallArray.java.*/

import com.phone.OutGoingPhoneCall;
import com.phone.IncomingPhoneCall;
import com.phone.PhoneCall;
import javax.swing.*;

public class PhoneCallArray
{
   public static void main(String[] args)
     {
        String entry, number;
        int input,minutes;
        PhoneCall[] objArray = new PhoneCall[10];

        for(int i = 0; i < objArray.length; ++i)
          {
             entry = JOptionPane.showInputDialog(null, "Chose to enter data for \nincoming or outgoing call" +
                                        "\n1.OUTGOING CALL \n2.INCOMING CALL");
             input = Integer.parseInt(entry);

             if(input == 1)
               {
                 number = JOptionPane.showInputDialog(null, "Enter Phone Number");
                 String min = JOptionPane.showInputDialog(null, "Enter minutes taken");
                 minutes = Integer.parseInt(min);

                 objArray[i] = new OutGoingPhoneCall(number, minutes);
               }

             else if(input == 2)
               {
                  number = JOptionPane.showInputDialog(null, "Enter Phone Number");
                  
                  objArray[i] = new IncomingPhoneCall(number);
               }
          }     

        for(int j = 0; j < objArray.length; ++j)
           {
               display(objArray[j]);
           }
     }

   public static void display(PhoneCall obj)
      {
         System.out.println(obj.display());
      }
}