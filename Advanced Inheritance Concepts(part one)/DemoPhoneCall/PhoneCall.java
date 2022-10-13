package com.phone;

public abstract class PhoneCall
{
    protected String phoneNumber;
    protected double priceOfCall;

    public PhoneCall(String number)
       {
          phoneNumber = number;
          priceOfCall = 0.0;
       }
    public void setPrice(double price)
       {
          priceOfCall = price;
       }

    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract String display();
}
