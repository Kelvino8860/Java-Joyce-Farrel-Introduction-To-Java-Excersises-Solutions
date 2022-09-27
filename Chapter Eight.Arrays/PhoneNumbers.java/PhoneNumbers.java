/*9. A personal phone directory contains room for first names and phone numbers for
    30 people. Assign names and phone numbers for the first 10 people. Prompt the user
    for a name, and if the name is found in the list, display the corresponding phone
    number. If the name is not found in the list, prompt the user for a phone number, and
    add the new name and phone number to the list. Continue to prompt the user for
    names until the user enters quit. After the arrays are full (containing 30 names), do
    not allow the user to add new entries. Save the file as PhoneNumbers.java*/

public class PhoneNumbers{
     public String names;
     public long phoneNumber;

  public PhoneNumbers(){
     }
  public String getNames(){
        return names;
     }
  public void setNames(String names){
        this.names = names;
    }
  public long getPhoneNumber(){
       return phoneNumber;
    }
  public void setPhoneNumber(long phoneNumber){
       this.phoneNumber = phoneNumber;
    }
}