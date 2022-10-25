/* 1. In Chapter 1, you created a class called RandomGuess. In this game, the application
      generates a random number for a player to guess. In Chapter 5, you improved the
      application to display a message indicating whether the player’s guess was correct,
      too high, or too low. In Chapter 6, you further improved the game by adding a loop
      that continually prompts the user to enter the correct value, if necessary. As written,
      the game should work as long as the player enters numeric guesses. However, if the
      player enters a letter or other nonnumeric character, the game throws an exception.
      Discover the type of Exception thrown, then improve the game by handling the
      exception so that the user is informed of the error and allowed to attempt to enter
      the correct data again. Save the file as RandomGuess4.java*/

import javax.swing.JOptionPane;
import java.util.*;
public class RandomGuess4
{  public static void main(String[]   args)
    { String guessString, randomString;
      int guess = 0;
      int count = 0;
      int random = 0;

        do{ 
            guessString = JOptionPane.showInputDialog(null, "Guess a number from 1 to 10", "RANDOM GUESSING FUN", JOptionPane.QUESTION_MESSAGE);
            random = (1 + (int)(Math.random() * 10));
            
              try
               {
                       guess = Integer.parseInt(guessString);
                       if(guess > random)
                           JOptionPane.showMessageDialog(null, "TOO HIGH", "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE);
                       else
                        if(guess < random)
                          JOptionPane.showMessageDialog(null, "TOO LOW", "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE); 
                      JOptionPane.showMessageDialog(null, "The number is " + random, "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE);
                      ++count;
               }
              catch(NumberFormatException e)
                {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }

           }while(guess != random);

      JOptionPane.showMessageDialog(null, "Number of trials >> " + count, "RANDOM GUESSING FUN", JOptionPane.INFORMATION_MESSAGE);
   }
}
        
   