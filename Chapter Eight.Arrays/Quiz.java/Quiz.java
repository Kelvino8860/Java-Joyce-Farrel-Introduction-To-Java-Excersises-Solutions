/*Game Zone
  1. Write an application that contains an array of 10 multiple-choice quiz questions
     related to your favorite hobby. Each question contains three answer choices. Also
     create an array that holds the correct answer to each question—A, B, or C. Display
     each question and verify that the user enters only A, B, or C as the answer—if not,
     keep prompting the user until a valid response is entered. If the user responds to a
     question correctly, display “Correct!”; otherwise, display “The correct answer is” and
     the letter of the correct answer. After the user answers all the questions, display the
     number of correct and incorrect answers. Save the file as Quiz.java*/

import java.util.Scanner;

public class Quiz{
     public static void main(String[] args){

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
      
       //Create array to store all incorrect answers
           String[] answersArray = {"A","B","B","A","C","A","C","B","C","B"};
                  Scanner input = new Scanner(System.in);
                   String answer;
                   int countCorrect = 0;
                   int countIncorrect = 0;

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
        }
}