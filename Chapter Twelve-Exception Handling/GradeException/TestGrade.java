/* 9. Write an application that displays a series of at least 10 student ID numbers
      (that you have stored in an array) and asks the user to enter a test letter grade
      for the student. Create an Exception class named GradeException that contains
      a static public array of valid grade letters (‘A’, ‘B’, ‘C’, ‘D’, ‘F’, and ‘I’) that you
      can use to determine whether a grade entered from the application is valid. In
      your application, throw a GradeException if the user does not enter a valid
      letter grade. Catch the GradeException, and then display an appropriate message.
      In addition, store an ‘I’ (for Incomplete) for any student for whom an exception is
      caught. At the end of the application, display all the student IDs and grades. Save
      the files as GradeException.java and TestGrade.java*/

import javax.swing.*;
import java.util.*;

public class TestGrade
{
    public static void main(String[] args)
       {
          final int ARRAY_LENGTH = 5;
          String[] idNum = {"I08","I14","I20","I16","I24"};
          ArrayList<Character> letter = new ArrayList<>(ARRAY_LENGTH);
          displayLetter(letter,idNum);
          display(letter,idNum);

       }
    public static void displayLetter(ArrayList<Character> lett, String[] id)
       {
           String input;
           int i,j;
           for(i = 0; i < id.length; ++i)
              {
                 boolean similar = false;
                 try
                  {
                     input = JOptionPane.showInputDialog(null, "Enter Grade of student " +
                              id[i]);
                     for(j = 0; j < GradeException.LETTERS.length; ++j)
                       {
                          if(input.charAt(0) == GradeException.LETTERS[j])
                             {
                                similar = true;
                                break;
                             }
                       }
                     if(similar == true)
                        lett.add(input.charAt(0));
                     else
                       throw(new GradeException());
                  }
                 catch(GradeException e)
                   {
                       JOptionPane.showMessageDialog(null, e.getMessage());
                       input = "I";
                       lett.add(input.charAt(0));
                   }
              }
           
       }
   public static void display(ArrayList<Character> lett, String[] id)
       { 
           int j;
           String disp = "";
           for(j = 0; j < lett.size(); ++j)
             {
                disp = disp + "\n" + "Student ID: " + id[j] + "    Grade: " + lett.get(j);
             }
           JOptionPane.showMessageDialog(null, disp);
       }
}

















