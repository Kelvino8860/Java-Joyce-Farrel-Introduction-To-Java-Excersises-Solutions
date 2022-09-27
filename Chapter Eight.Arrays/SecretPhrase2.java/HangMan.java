/* 4. In Chapter 7, you created a Secret Phrase game similar to Hangman, in which the
      user guesses letters in a partially hidden phrase in an attempt to determine the
      complete phrase. Modify the program so that:
      The phrase to be guessed is selected randomly from a list of at least 10 phrases.
      The clue is presented to the user with asterisks replacing letters to be guessed but
      with spaces in the appropriate locations. For example, if the phrase to be guessed
      is “No man is an island,” then the user sees the following as a first clue:
      ** *** ** ** ******
      The spaces provide valuable clues as to where individual words start and end.
      Make sure that when a user makes a correct guess, all the matching letters are
      filled in, regardless of case.
      Save the game as SecretPhrase2.java*/

import java.util.Scanner;
import java.util.Arrays;
public class HangMan{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create an array of strings
        String[] words = {"program","java","kelvin","italy"};
        checkWord(words);
    }
    
    //create an array with asteriks and
    //an array of letters for a random String from words array
    public static void checkWord(String[] words)
    {   Scanner input = new Scanner(System.in);
    
    //use a do loop to play the number of times you wish
       
     do{  
         //chose a word randomly
         //create a char array to hold astericks with
         //equal length to the choosen word
           String choosen = words[(int)(Math.random()*4)];
           char[] asterick = new char[choosen.length()];
        
           //create a char array and fill it with the characters
           //of the word choosen randomly
           char[] choosenArray = new char[choosen.length()];
            for(int i = 0; i < choosenArray.length; i++)
            {
                choosenArray[i] = choosen.charAt(i);
            }
            
            //also fill the asterick array with astericks
            //it will be used to replace the asterick with letters
         for(int j = 0; j < asterick.length; j++)
          {
             asterick[j] = '*';
          }
             
         //initialize miss to calculate the number of wrong entries
         //absent to be used to display a message if character entered by user is not in the word
         //present to display message is a user enters same character twice or more
            int miss = 0;
            int absent = 0,present = 0;
            
            //the do..while loop allows user to continue entering characters
            //till the righ word is complete
  do{
        System.out.print("(Guesss) Enter a letter in word " + String.valueOf(asterick) + " > ");
        char guess = input.nextLine().charAt(0);
        
        //use while loop to search through the array 
        //and replace characters
        for(int i = 0; i < asterick.length; i++)
        {
             if(guess == asterick[i])
            {
                present++;
            }
            if(guess == choosen.charAt(i))
            {  
                asterick[i] = guess;
                absent++;
            }
           
        }
        
        if(absent == 0)
        {
            System.out.println(guess + " is not in the word");
            miss++;
        }
        if(present > 0)
        {
            System.out.println(guess + " is already in the word");
        }
        
        //reset the values of absent and present to zero
        //after every input
        absent = 0;
        present = 0;
        
        //break loop once the whole word is complete
        
    }while(!Arrays.equals(asterick,choosenArray));
  
  //Display the word and number of failed attempts
     System.out.println("The word is " + choosen + ". You missed " +
                  miss + " time");
  
     //promp user to user to input y if they want to continue playing
     //or n if they want to terminate programm
  System.out.println("Do you want to guess another word? Enter y or n >> ");
       char askPermision;
       askPermision = input.nextLine().charAt(0);
       
       if(askPermision == 'n')
           break;
       
     }while(true);
     }
}