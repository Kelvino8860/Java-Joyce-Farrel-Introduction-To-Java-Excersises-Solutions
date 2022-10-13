package com.phone;

public class OutGoingPhoneCall extends PhoneCall
{
   private int minutes;

   public OutGoingPhoneCall(String number, int min)
     {
         super(number);
         setPrice(0.04 * min);
     }

  @Override
   public String getPhoneNumber()
     {
         return phoneNumber;
     }
  @Override
   public double getPrice()
     {
        return priceOfCall;
     }
  @Override
   public String display()
     {
        return("\nPhone Number: " + getPhoneNumber() +
               "\nRate: $" + 0.04 + " per minute" +
               "\nPrice: $" + getPrice());
     }
}