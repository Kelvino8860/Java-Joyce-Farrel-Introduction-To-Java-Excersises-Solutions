/* 7. The Cullerton Park District holds a mini-Olympics each summer. Create a class
      named Participant with fields for a name, age, and street address. Include a
      constructor that assigns parameter values to each field and a toString() method that
      returns a String containing all the values. Also include an equals() method that
      determines two Participants are equal if they have the same values in all three fields.
      Create an application with two arrays of at least eight Participants each—one holds
      Participants in the mini-marathon, and the other holds Participants in the
      diving competition. Prompt the user for participant values. After the data values
      are entered, display values for Participants who are in both events. Save the files
      as Participant.java and TwoEventParticipants.java.*/


import javax.swing.*;

public class TwoEventParticipants
{
   public static void main(String[] args)
      {
         String name, age, address;
         int input, i;

         Participants[] miniMarathon = new Participants[8];
         Participants[] diving = new Participants[8];

         JOptionPane.showMessageDialog(null, "Enter mini-marathon data.");
           for(i = 0; i < miniMarathon.length; ++i)
             {
                name = JOptionPane.showInputDialog(null, "Enter Name for participant" + (i + 1));
                age = JOptionPane.showInputDialog(null, "Enter Age for participant" + (i + 1));
                input = Integer.parseInt(age);
                address = JOptionPane.showInputDialog(null, "Enter Street Address for participant" + (i + 1));

                miniMarathon[i] = new Participants(name, input, address);
             }

         JOptionPane.showMessageDialog(null, "Enter Diving data.");
           for(i = 0; i < diving.length; ++i)
             {
                name = JOptionPane.showInputDialog(null, "Enter Name for participant" + (i + 1));
                age = JOptionPane.showInputDialog(null, "Enter Age for participant" + (i + 1));
                input = Integer.parseInt(age);
                address = JOptionPane.showInputDialog(null, "Enter Street Address for participant" + (i + 1));

                diving[i] = new Participants(name, input, address);
             }

        
         for(i = 0; i < miniMarathon.length; ++i)
             {
                for(int j = 0; j < diving.length; ++j)
                   {
                      if(miniMarathon[i].equals(diving[j]) == true)
                          {
                              System.out.println(miniMarathon[i].toString());
                          }
                   }
             }
      }
}