/* 2. a. The Talk-A-Lot Cell Phone Company provides phone services for its customers.
         Create an abstract class named PhoneCall that includes a String field for a
         phone number and a double field for the price of the call. Also include a
         constructor that requires a phone number parameter and that sets the price to 0.0.
         Include a set method for the price. Also include three abstract get methods—one
         that returns the phone number, another that returns the price of the call, and
         a third that displays information about the call. Create two child classes of
         PhoneCall: IncomingPhoneCall and OutgoingPhoneCall. The IncomingPhoneCall
         constructor passes its phone number parameter to its parent’s constructor and sets the
         price of the call to 0.02. The method that displays the phone call information displays
         the phone number, the rate, and the price of the call (which is the same as the rate).
         The OutgoingPhoneCall class includes an additional field that holds the time of the
         call in minutes. The constructor requires both a phone number and the time. The
         price is 0.04 per minute, and the display method shows the details of the call,
         including the phone number, the rate per minute, the number of minutes, and
         the total price. Write an application that demonstrates you can instantiate and
         display both IncomingPhoneCall and OutgoingPhoneCall objects. Save the files
         as PhoneCall.java, IncomingPhoneCall.java, OutgoingPhoneCall.java, and
         DemoPhoneCalls.java.*/

import com.phone.OutGoingPhoneCall;
import com.phone.IncomingPhoneCall;
import com.phone.PhoneCall;

public class DemoPhoneCalls
{
   public static void main(String[] args)
     {
        IncomingPhoneCall obj1 = new IncomingPhoneCall("0772526382");
        OutGoingPhoneCall obj2 = new OutGoingPhoneCall("0746061885", 30);

        display(obj1);
        display(obj2);
     }

   public static void display(PhoneCall obj)
      {
         System.out.println(obj.display());
      }
}