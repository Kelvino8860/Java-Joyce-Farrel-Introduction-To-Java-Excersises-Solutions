/*Game Zone
     2. In Chapter 8, you created a game named Quiz in which the user could respond to
        multiple-choice questions. Modify the game so that it stores the player’s highest
        score from any previous game in a file and displays the high score at the start of each
        new game. (The first time you play the game, the high score is 0.) Save the game as
        QuizUsingFile.java.
  */

import java.util.Scanner;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class Quiz{
     public static void main(String[] args){
		 
		 //Create a file path to store the highest score
		 Path file = Paths.get("C:\\Users\\NJORO\\Desktop\\Java\\Chapter.13\\QuizHighestScore.txt");

         //Create an array to store all correct answers
            String[] quizArray = {"1.An array is a list of data items that?\nA. all have the same type\nB. all have different names\nC. all are integers ",
                                  "2.A sequence of characters enclosed in double quotation marks is a?\nA. Symbolic string\nB. literal string\nC. command",
                                  "3.The term programmers use to describe objects that cannot be changed is?\nA. irrevocable\nB. immutable\nC. stable",
                                  "4.The method that determines whether two String objects are equivalent, regadless of case is?\nA. equalsIgnoreCase()\nB. equals()\nC. equalsNoCase()",
                                  "5.A structure that allows repeated execution of a block of statements is a?\nA. cycle\nB. ring\nC. loop",
                                  "6.To construct a loop that works correctly, you should initialize a loop?\nA. Variable\nB. constatnt\nC. condition",
                                  "7.The logical structure in which one instruction occurs after another with no branching is a?\nA. Case\nB. loop\nC. sequence",
                                  "8.Which of the following is typically used in a flowchart to indicate a decision?\nA. Square\nB. Diamond\nC. Rectangle",
                                  "9.In java, the value of (14 > 7) is?\nA. false\nB. 7\nC. true",
                                  "10.A constructor ___________ overloaded?\nA. must be\nB. can be\nC. cannot be"};
      
       //Create array to store all correct answers
           String[] answersArray = {"A","B","B","A","C","A","C","B","C","B"};
                  Scanner input = new Scanner(System.in);
                   String answer;
                   int countCorrect = 0;
                   int countIncorrect = 0;
		   String s = "";
				   
				   try
				   {
						   InputStream input1 = new BufferedInputStream(Files.newInputStream(file,CREATE,READ));
						   BufferedReader reader = new BufferedReader(new InputStreamReader(input1));
						   s = reader.readLine();
						   
						   if(s == null)
						   {
							   String w = "00";
							   OutputStream output = new BufferedOutputStream(Files.newOutputStream(file,CREATE,WRITE));
							   BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
							   writer.write(w,0,w.length());
							   writer.close();
						   }
						   
						   reader.close();
				   }
				   catch(Exception e)
				   {
					   System.out.println("Message: " + e);
				   }
				   
	   //Display the highest score from the previous round

             try
			 {
				 InputStream input2 = new BufferedInputStream(Files.newInputStream(file,CREATE,READ));
				 BufferedReader reader = new BufferedReader(new InputStreamReader(input2));
				 s = reader.readLine();
				 
				 System.out.println("HIGHEST SCORE: " + s);
			 }
            catch(Exception e)
			 {
			   System.out.println("Message: " + e);
		     }			 
       //Prompt the user to answer the questions
            for(int i = 0; i < quizArray.length; i++){
 
                      System.out.println(quizArray[i]);
                      System.out.print("Choose the correct answer; A,B or C >>> ");
                         answer = input.nextLine();
                            
                   //Ensure the user enters either A, B or C if not remprompt user till the required input is entered
                            if(!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") && !answer.equalsIgnoreCase("C")){
                                  do{
                                             System.out.println(quizArray[i]);
                                             System.out.print("Choose the correct answer; A,B or C >>> ");
                                             answer = input.nextLine();
                        
                                              //Break the loop if the righ answer is entered
                                                   if(answer.equalsIgnoreCase("A") || answer.equalsIgnoreCase("B") || answer.equalsIgnoreCase("C")){
                                                            break;
                                                          }
                                    }while(true);
                           }

                        //Display a message if the choise is correct
                            if(answer.equalsIgnoreCase(answersArray[i])){
                                   System.out.println("Correct!");
                                    countCorrect++;
                                 }
                      //Display a message and correct answer if the user failed the question
                            else{
                                  System.out.println("The correct answer is " + answersArray[i]);
                                      countIncorrect++;
                                 }
                      System.out.println(); //spacing
               
               }
       //Display the number of questions that are correct and the number of questions that are not correct
           System.out.println("Number of correct answers: " + countCorrect);
           System.out.println("Number of incorrect answers: " + countIncorrect);
		   String highScore = Integer.toString(countCorrect);
                   int score;

                      if(countCorrect < 10)
                         {
                             StringBuilder sb = new StringBuilder("0" + highScore);
		             sb.setLength(2);
		             highScore = sb.toString();
		             score = Integer.parseInt(s);
                         }
                      else
                        {
                              StringBuilder sb = new StringBuilder(highScore);
		              sb.setLength(2);
		              highScore = sb.toString();
		              score = Integer.parseInt(s);
                        }
		   
		   
		   if(score < countCorrect)
		   {
				   try
				 {	  
					String w = highScore;
					OutputStream output = new BufferedOutputStream(Files.newOutputStream(file,CREATE,WRITE));
					BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
					writer.write(w,0,w.length());
					writer.close();		   
				 }
			   catch(Exception e)
				{
				   System.out.println("Message: " + e);
				}
		   }
		   
        }
}