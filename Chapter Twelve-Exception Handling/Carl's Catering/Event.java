
public class Event
{
   public static final int LOWER_PRICE_PER_GUEST = 32;
   public static final int HIGHER_PRICE_PER_GUEST = 35;
   public static final int LARGE_EVENT = 50;
   public static final String[] eventsNames = {"wedding", "baptism", "birthday", "corporate", "other"};
   private int eventType;
   private String eventNumber;
   private String phoneNumber;
   private String returnName;
   private int guest;
   private int price;
   private int pricePerGuest;
   public Event()
       {  this.eventNumber = "A000";
          this.guest = 0;
           }
   public Event(String eventNumber, int guest)
       {   this.eventNumber = eventNumber;
           this.guest = guest;
            }

public void setEventType(int eventType){
        
       this.eventType = eventType;

       switch(getEventType())
          {
            case 0:
              returnName = eventsNames[0];
              break;

            case 1:
              returnName = eventsNames[1];
              break;
        
            case 2:
              returnName = eventsNames[2];
              break;

            case 3:
              returnName = eventsNames[3];
              break;
            }
       if(eventType > 3){
             returnName = eventsNames[4];
          }

     }
public int getEventType(){

       return eventType;
     }

public String getEventsNames(){
       
       return returnName;
     }

 /* Modify the method that sets the event number in the Event class so that if the
    argument passed to the method is not a four-character String that starts with a
    letter followed by three digits, then the event number is forced to “A000”. If the
    initial letter in the event number is not uppercase, force it to be so. */

public  void setEventNumber(String number)
    {  
         //Check whether the length of the number is 4
         //Whether the first character is a letter and the rest is a digit
          if(number.length() == 4 && Character.isLetter(number.charAt(0)) &&
           Character.isDigit(number.charAt(1)) && Character.isDigit(number.charAt(2)) &&
           Character.isDigit(number.charAt(3)))
              {  
                //if the the letter is lower case turn it to upper case
                  char ch = Character.toUpperCase(number.charAt(0)); 
                  if(Character.isLowerCase(number.charAt(0))) 
                    { String newNumber = number.replace(number.charAt(0), ch);
                      eventNumber = newNumber;
                     }
                   else
                     eventNumber = number;
               }
       //If the number does not meet the requirements initialize it
       else
         eventNumber = "A000";

          }
public  void setGuest(int noGuest)
    {
       guest = noGuest;
        if(isLargeEvent() == true)
           {  price = guest * LOWER_PRICE_PER_GUEST;
              pricePerGuest = price / guest;
             }
        else 
          if(isLargeEvent() == false)
            {  price = guest * HIGHER_PRICE_PER_GUEST;
               pricePerGuest = price / guest;
          }
     }

    /* Add a set method for the contact phone number field in the Event class.
       Whether the user enters all digits or any combination of digits, spaces, dashes,
       dots, or parentheses for a phone number, store it as all digits. For example, if
       the user enters (920) 872-9182, store the phone number as 9208729182. If the
       user enters a number with fewer or more than 10 digits, store the number as
       0000000000*/
public void setPhoneNumber(String phone){
        StringBuilder newPhone = new StringBuilder();
        newPhone.setLength(20);
         int insertNum = 0;
        String filteredPhone;

          //Use the StringBuilder object to record all the digits in a String object
         //Emiting all other characters
            for(int i = 0; i < phone.length(); i++){
                  if(Character.isDigit(phone.charAt(i))){
                       newPhone.setCharAt(insertNum, phone.charAt(i));
                       insertNum++;
                     }
               }
     
            filteredPhone = newPhone.toString(); //convert the StringBuilder object to string
            int countDigits = 0;
             
         //Count how many digits are in the string since the string has a default length 
         //equal to that of the StringBuilder object
              for(int i = 0; i < filteredPhone.length(); i++){
                    if(Character.isDigit(filteredPhone.charAt(i))){
                         countDigits++;
                     }
                 }

            //if the digits are ten save them and assign them to the phoneNumber dataField
               if(countDigits == 10){
                       phoneNumber = filteredPhone;
                  }
           //If they are less then use the default value
        else if(countDigits < 10 || countDigits > 10){
             phoneNumber = "0000000000";
          }
        }
public String getPhoneNumber()
      { 
           StringBuilder newPhone = new StringBuilder(phoneNumber);
           StringBuilder newPhoneOne = newPhone.insert(0,"(");
           newPhoneOne = newPhoneOne.insert(4, ")");
           newPhoneOne = newPhoneOne.insert(5, " ");
           newPhoneOne = newPhoneOne.insert(9, "-");
           
          return newPhoneOne.toString();
          }
public String getEventNumber()
    {
          return eventNumber;

        }
public int getGuest()
     {
        return guest;

         }
public int getPrice()
    {
         return price;

            }
public int getPricePerGuest()
   {  
        return pricePerGuest;
    
          }

/*Check whether the event is large*/
public boolean isLargeEvent()
    {   if(guest >= LARGE_EVENT)
           return true;
        else
          return false;
    }
}
























