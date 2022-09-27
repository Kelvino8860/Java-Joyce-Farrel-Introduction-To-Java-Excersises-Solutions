/*8. Write an application that allows a user to enter the names and birthdates of up to
     10 friends. Continue to prompt the user for names and birthdates until the user
     enters the sentinel value “ZZZ” for a name or has entered 10 names, whichever comes
     first. When the user is finished entering names, produce a count of how many names
     were entered, and then display the names. In a loop, continuously ask the user to type
     one of the names and display the corresponding birthdate or an error message if the
     name has not been previously entered. The loop continues until the user enters
     “ZZZ” for a name. Save the application as BirthdayReminder.java.*/

public class Birthday{
     private String name;
     private String date;
     public static int size;

    public Birthday(){
     }
   
    public void setName(String name){
       this.name = name;
       size++;
     } 
   public String getName(){
       return name;
     }

   public void setDate(String date){
       this.date = date;
     }
   public String getDate(){
       return date;
     }
}