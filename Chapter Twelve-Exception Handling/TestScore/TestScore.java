/* 8. Write an application that displays a series of at least five student ID numbers (that you
      have stored in an array) and asks the user to enter a numeric test score for the student.
      Create a ScoreException class, and throw a ScoreException for the class if the
      user does not enter a valid score (less than or equal to 100). Catch the ScoreException,
      and then display an appropriate message. In addition, store a 0 for the student’s score.
      At the end of the application, display all the student IDs and scores. Save the files
      as ScoreException.java and TestScore.java*/

import javax.swing.*;
import java.util.*;

public class TestScore
{
   public static void main(String[] args)
       {
          String[] idNum = {"I08","I64","I14","I20","I18"};
          ArrayList<Double> scores = new ArrayList<>(5);

          addScores(scores, idNum);
       }

   public static void addScores(ArrayList<Double> scores, String[] id)
      {
          int i;
          String input;
          Double score;

          for(i = 0; i < id.length; ++i)
            {
               input = JOptionPane.showInputDialog(null, "Enter score of student " + id[i]);
                try
                 {
                   score = Double.parseDouble(input);
                   if(score > 100)
                   throw(new ScoreException());
                   scores.add(score);
                 }
                catch(ScoreException e)
                 {
                   JOptionPane.showMessageDialog(null, e.getMessage());
                   scores.add(0.0);
                 }
            }

         String display = "";
          for(i = 0; i < id.length; ++i)
            {
                display = display + "\n" + id[i] + ": " + scores.get(i);
            }
         JOptionPane.showMessageDialog(null, display);
      }
}