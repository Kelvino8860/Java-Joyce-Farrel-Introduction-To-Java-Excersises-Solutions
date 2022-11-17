  /* 1. In several Game Zone assignments earlier in this book, you created games similar to
		Hangman in which the user guesses a secret phrase by selecting a series of letters.
		These versions had limited appeal because each contained only a few possible
		phrases to guess; after playing the games a few times, the user would have memorized all the phrases. 
		Now create a version in which any number of secret phrases
		can be saved to a file before the game is played. Use a text editor such as Notepad to
		type any number of phrases into a file, one per line. Save the file as Phrases.txt.
		Then, create a game that randomly selects a phrase from the file and allows a user to
		guess the phrase letter by letter. Save the game as SecretPhraseUsingFile.java.*/
		
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import static java.nio.file.StandardOpenOption.*;

public class SecretPhraseUsingFile
{
	public static void main(String[] args)
	{
		Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\Phrases.txt");
		ArrayList<String> list = new ArrayList<>();

        storePhrases(file, list);	
        choosePhrase(list);		
	}
	
	/* Store all phrases in the file in an array list
	*/
	public static void storePhrases(Path file, ArrayList<String> list)
	{
		InputStream input = null;
		String line;
		
		try
		{
			input = new BufferedInputStream(Files.newInputStream(file,READ));
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			line = reader.readLine();
			while(line != null)
			{
				list.add(line);
				line = reader.readLine();
			}
			
			reader.close();
		}
		catch(Exception e)
		{
			System.out.println("Message: " + e);
		}
		
		//for(int i = 0; i < list.size(); ++i)
		//{
		//	System.out.println(list.get(i));
		//}
	}
	
	/* Choose a phrase randomly
	*/
	public static void choosePhrase(ArrayList<String> list)
	{
		Scanner input = new Scanner(System.in);

            do{

					int phraseIndex = (int)(Math.random()*list.size());
					
					String phrase = list.get(phraseIndex);
					//System.out.println(phrase);
					
					//Create a char array of asterics and 
					//a char array of the phrase
					char[] astericks = new char[phrase.length()];
					char[] phraseArray = new char[phrase.length()];
					
					//initialize the array containig astericks
					for(int i = 0; i < astericks.length; ++i)
					{
						astericks[i] = '*';
						phraseArray[i] = phrase.charAt(i);
					}
					
					//Prompt user for letters in a do...while loop
					//compare if what the user enters matches any character in the phrase
					//if it matches replace the asteric with the letter
					   char guess;
					   int present = 0, absent = 0, correct = 0, miss = 0;
	 

					do
					{

                                  System.out.print("\n(Guess)Enter a character(Phrases start with capital letters) " + String.valueOf(astericks) + " >> ");
			                      guess = input.nextLine().charAt(0);
						//Replace asteric with character if the guess is right
						for(int i = 0; i < phrase.length(); ++i)
						{
							if(guess == astericks[i])
							{
								present++;
								break;
							}
							if(guess == phrase.charAt(i))
							{
								astericks[i] = guess;
								correct++;
							}
							if(guess != phrase.charAt(i))
								{
									absent++;
								}
							}
						
						if(present > 0)
						{
							System.out.println("The letter already exists!!!");
						}
						else
							if(corr ect > 0)
							{
								System.out.println("You guessed a correct letter ");
							}
						else
							if(absent == phrase.length())
							{
								System.out.println("You entered an incorrect letter!!!");
								miss++;
							}	

						  present = 0;
						  correct = 0;
						  absent = 0;

							//Break loop once the word is correct			  
					}while(!Arrays.equals(astericks,phraseArray));
					
			 //Display the word and the number of times player missed
			 System.out.println("The word is " + phrase + ". You missed " + miss + " times.");
			 //promp user to user to input y if they want to continue playing
             //or n if they want to terminate programm
             System.out.print("Do you want to guess another word? Enter y or n >> ");
              char askPermision;
              askPermision = input.nextLine().charAt(0);
       
              if(askPermision == 'n')
                 break;
					
					
		   }while(true);
	}
}