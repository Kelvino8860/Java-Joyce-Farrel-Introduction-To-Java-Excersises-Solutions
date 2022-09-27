/* 1. Create a guessing game called “Does It Have Legs?”, in which you think of an animal
      and the computer tries to guess what it is. The game continually becomes “smarter”
      as you play because you teach it how to become more specific with its questions. For
      example, a typical game session might proceed as follows:

           Computer: Does the animal you are thinking of have legs?
           Player: Yes.
           Computer: Is it a dog?
           Player: Yes.
           Computer: Yay! I win. Do you want to play again?
           Player: Yes.
           Computer: Does the animal you are thinking of have legs?
           Player: Yes.
           Computer: Is it a dog?
           Player: No.
           Computer: I give up. What was your animal?
           Player: Horse.
           Computer: Type a question for which the answer is Yes for Dog but No for Horse.
           Player: Does it live in the house?
           Computer: Do you want to play again?
           Player: Yes.
           Computer: Does the animal you are thinking of have legs?
           Player: Yes.
           Computer: Does it live in the house?
           Player: No.
           Computer: Is it a Horse?
           Player: No.
           Computer: I give up. What was your animal?
           Player: Cow.
           Computer: Type a question for which the answer is Yes for Horse but No for Cow.
           Player: Do people ride it?
           Computer: Do you want to play again?
           Player: Yes.
           Computer: Does the animal you are thinking of have legs?
           Player: Yes.
           Computer: Does it live in the house?
           Player: No.
           Computer: Do people ride it?
           Player: No.
           Computer: Is it a Cow?
           Player: Yes.
           Computer: Yay! I win. Do you want to play again?
           Player: No.

       (Hint: You might want to look up “binary trees” on the Internet as a method to
       organize this application.)
       Save the application as DoesItHaveLegs.java.*/


import java.util.Scanner;

public class DoesItHaveLegs{

     public static void main(String[] args){
           
             Animal obj = new Animal();
             Scanner input = new Scanner(System.in);
             String answer = "";
             String quitter = "";   
             int length = 0;
             int question = 0;      

     do{
           System.out.println("Computer: " + obj.getQuestions(question));
           System.out.print("Player: ");
           answer = input.nextLine();

            if(answer.equalsIgnoreCase("yes"))  //main
                {
                     if(quitter.equalsIgnoreCase("Yes") && obj.getQuestionsLength() > 1)
                          {
                            for(int i = 0; i < obj.getQuestionsLength() - 1; ++i){
                              System.out.println("Computer: " + obj.getQuestions(i + 1));
                              System.out.print("Player: ");
                              String answer2 = input.nextLine();
                             }
                              System.out.println("Computer: " + "Is it a " + obj.getActualAnimals(obj.getQuestionsLength() - 1));
                              System.out.print("Player: ");
                              answer = input.nextLine();
                          }
                   
             if(obj.getQuestionsLength() == 1){   
                   System.out.println("Computer: " + obj.getAnswers(obj.getQuestionsLength() - 1));
                   System.out.print("Player: ");
                   answer = input.nextLine();
                 }

                    if(answer.equalsIgnoreCase("No"))
                       {
                          System.out.println("Computer: " + "I give up. What was your animal?");
                          System.out.print("Player: ");
                          String animal = input.nextLine();
                          obj.setActualAnimals(animal);
                          System.out.println("Computer: " + "Type a question that is yes for " + obj.getActualAnimals(obj.getQuestionsLength() - 1) + " but No for " + animal);
                          System.out.print("Player: ");
                          String questions = input.nextLine();
                          obj.setQuestions(questions);
                          String answer3 = "Is it a " + animal;
                          obj.setAnswers(answer3);
                          System.out.println("Computer: " + "Do you want to play again?");
                          System.out.print("Player: ");
                          quitter = input.nextLine();
                       }

                   else if(answer.equalsIgnoreCase("Yes"))
                       {
                          System.out.println("Computer: " + "Yay! I win. Do you want to play again?");
                          System.out.print("Player: ");
                          quitter = input.nextLine();
                       }
                  
                }//main


             else if(answer.equalsIgnoreCase("No"))
                {
                  System.out.println("Good Bye!!!");
                  break;
                }
       }while(quitter.equalsIgnoreCase("Yes"));
   }
}