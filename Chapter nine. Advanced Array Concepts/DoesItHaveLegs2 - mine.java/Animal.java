import java.util.*;

public class Animal
{
   private ArrayList<String> questions;
   private ArrayList<String> answers;
   private ArrayList<String> actualAnimals;

    public Animal()
      {
           questions = new ArrayList<String>();
           answers = new ArrayList<String>();
           actualAnimals = new ArrayList<String>();

           questions.add("Does the animal you are thinking of have legs?");
           answers.add("Is it a dog?");
           actualAnimals.add("Dog");
       }

public void giveUpMessage()
    {
        System.out.println("I give up. What was your animal?");
     }
public void setQuestions(String question)
    {
         questions.add(question);
     }
public void setActualAnimals(String answer)
    {
        actualAnimals.add(answer);
     }
public void setAnswers(String answ)
   {
       answers.add(answ);
     }
public String getQuestions(int value)
    {
        return questions.get(value);
     }
public String getAnswers(int value)
    {
       return answers.get(value);
     }
public String getActualAnimals(int value)
    { 
       return actualAnimals.get(value);
      }
public int getQuestionsLength()
    {
        return questions.size();
     }
}