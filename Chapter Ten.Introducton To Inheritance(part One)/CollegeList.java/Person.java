public class Person
{
   private String firstName;
   private String lastName;
   private String streetAddress;
   private int zipCode;
   private long phoneNumber;

   public String getFirstName()
     {
        return firstName;
     }
   public String getLastName()
     {
        return lastName;
     }
   public String getStreetAddress()
     {
        return streetAddress;
     }
   public int getZipCode()
     {
        return zipCode;
     }
   public long getPhoneNumber()
     {
        return phoneNumber;
     }

   public void setFirstName(String first)
     {
         firstName = first;
     }
   public void setLastName(String last)
     {
         lastName = last;
     }
   public void setStreetAddress(String address)
     {
         streetAddress = address;
     }
   public void setZipCode(int code)
     {
         zipCode = code;
     }
   public void setPhoneNumber(long phone)
     {
         phoneNumber = phone;
     }

  public void display()
     {
       System.out.println("\nFirst Name: " + getFirstName() + "\nLast Name: " + getLastName() +
              "\nStreet Address: " + getStreetAddress() + "\nZip Code: " + getZipCode() + 
              "\nPhone Number: " + getPhoneNumber());
     }
}




