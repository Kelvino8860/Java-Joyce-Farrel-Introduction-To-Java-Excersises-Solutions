package com.phone;

public class IncomingPhoneCall extends PhoneCall
{
   public IncomingPhoneCall(String number)
     {
        super(number);
        super.setPrice(0.02);
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
              "\nRate: $" + getPrice() +
              "\nPrice: $" + getPrice());
    }
}