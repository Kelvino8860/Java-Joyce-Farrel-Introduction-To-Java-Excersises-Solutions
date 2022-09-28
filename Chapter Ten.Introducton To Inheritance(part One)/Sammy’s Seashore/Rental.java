/*Modify the Rental class to include an integer field that holds an equipment type.
  Add a final String array that holds names of the types of equipment that
  Sammy’s rents—jet ski, pontoon boat, rowboat, canoe, kayak, beach chair,
  umbrella, and other. Include get and set methods for the integer equipment type
  field. If the argument passed to the method that sets the equipment type is larger
  than the size of the array of String equipment types, then set the integer to the
  element number occupied by “other”. Include a get method that returns a
  rental’s String equipment type based on the numeric equipment type.*/

public class Rental
{  public static final int NUMBER_MIN_HOUR = 60;
   public static final int HOURLY_RENTAL_PAY = 40;
   public static final int PRICE_REM_MINUTES = 1;
   public static final String[] equipmentNames = {"jet ski", "pontoon boat", "rowboat", "canoe", "kayak", "beach chair", "umbrella", "other"};
   private int equipmentTypes;
   private String equipment;
   private String contractNumber;
   private int numberHours;
   private int numberRemMinutes;
   private String phoneNumber;
   private int price;
   private int minutes;
   public Rental()
    {  contractNumber = "A000";
       numberHours = 0;
          }
  public Rental(String contractNumber, int numberHours)
     {  this.contractNumber = contractNumber;
        this.numberHours = numberHours;
          }

public void setEquipmentTypes(int equipmentTypes){

       this.equipmentTypes = equipmentTypes;
          
       switch(getEquipmentTypes()){
            
             case 0:
               equipment = equipmentNames[0];
               break;
             
             case 1:
               equipment = equipmentNames[1];
               break;

             case 2:
               equipment = equipmentNames[2];
               break;
 
             case 3:
               equipment = equipmentNames[3];
               break;

             case 4:
               equipment = equipmentNames[4];
               break;

             case 5:
               equipment = equipmentNames[5];
               break;

             case 6:
               equipment = equipmentNames[6];
               break;
          }

          if(getEquipmentTypes() > 6){
                equipment = equipmentNames[7];
             }
   }

public int getEquipmentTypes(){

       return equipmentTypes;
   }

public String getEquipmentName(){

      return equipment;
   }

/*Modify the method that sets the contract number in the Rental class so that if the
  argument passed to the method is not a four-character String that starts with a
  letter followed by three digits, then the contract number is forced to “A000”. If the
  initial letter in the contract number is not uppercase, force it to be so*/
public void setContractNumber(String contract)
    {
       //Check whether the length of the number is 4
         //Whether the first character is a letter and the rest is a digit
          if(contract.length() == 4 && Character.isLetter(contract.charAt(0)) &&
           Character.isDigit(contract.charAt(1)) && Character.isDigit(contract.charAt(2)) &&
           Character.isDigit(contract.charAt(3)))
              {  
                //if the the letter is lower case turn it to upper case
                  char ch = Character.toUpperCase(contract.charAt(0)); 
                  if(Character.isLowerCase(contract.charAt(0))) 
                    { String newNumber = contract.replace(contract.charAt(0), ch);
                      contractNumber = newNumber;
                     }
                   else
                     contractNumber = contract;
               }
       //If the number does not meet the requirements initialize it
       else
         contractNumber = "A000";

          }

/* Add a set method for the contact phone number field in the Rental class.
   Whether the user enters all digits or any combination of digits, spaces, dashes,
   dots, or parentheses for a phone number, store it as all digits. For example, if the
   user enters (920) 872-9182, store the phone number as 9208729182. If the user
   enters a number with fewer or more than 10 digits, store the number as
   0000000000.
   Add a get method for the phone number field. The get method returns the
   phone number as a String constructed as follows: parentheses surround a
   three-digit area code, followed by a space, followed by the three-digit phone
   exchange, followed by a hyphen, followed by the last four digits of the phone
   number*/
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

public void setHoursAndMinutes(int minute)
    {   this.minutes = minute;
       numberHours = minutes / NUMBER_MIN_HOUR;
       numberRemMinutes = minutes % NUMBER_MIN_HOUR;
      if(numberRemMinutes <= 40)
       price = (numberHours * HOURLY_RENTAL_PAY) + (numberRemMinutes * PRICE_REM_MINUTES);
      else
       if(numberRemMinutes > 40)
           price = (numberHours * HOURLY_RENTAL_PAY) + (HOURLY_RENTAL_PAY);  
           }
public String getContractNumber()
   {
      return contractNumber;
         }
public int getMinutes()
   {  return minutes;
       }
public int getNumberHours()
   {
        return numberHours;
        }
public int getNumberRemMinutes()
    {
       return numberRemMinutes;
            }
public int getPrice()
    {
        return price;
           }
}
