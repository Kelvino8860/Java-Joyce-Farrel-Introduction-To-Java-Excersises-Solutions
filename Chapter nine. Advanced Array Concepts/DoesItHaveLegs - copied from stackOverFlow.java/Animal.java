import java.util.*;
class Animal
{
    private ArrayList<String> answers;
    private ArrayList<String> questions;

    private ArrayList<String> actualAnimals;
    public Animal()
    {
        answers = new ArrayList<String>();
        questions = new ArrayList<String>();

        actualAnimals=new ArrayList<String>();
        actualAnimals.add("dog");

        questions.add("Does the animal you are thinking of have legs?");
        answers.add("Is it a dog?");
    }
    public String getActualAnimals(int actualAnimal)
    {
        return actualAnimals.get(actualAnimal);
    }
    public String getQuestions(int questionNumber)
    {
        return questions.get(questionNumber);

    }
    public String getAnswers(int answerNumber)
    {
        return answers.get(answerNumber);
    }   
    public void addQuestions(String question)
    {
        questions.add(question);
    }
    public void addAnswers(String answer)
    {
        answers.add(answer);
    }
    public void addActualAnimals(String animal)
    {
        actualAnimals.add(animal);
    }
    public void displayQuestion(int questionNumber)
    {
        System.out.println(questions.get(questionNumber));
    }
    public void displayAnswer(int answer)
    {
        System.out.println(answers.get(answer));
    }

    public void giveUpMessage()
    {
        System.out.println("I give up What was your animal");
    }
    public int getAnswersLength()
    {
        return answers.size();
    }
    public int getQuestionsLength()
    {
        return questions.size();
    }

    public int getActualAnimalsLength()
    {
        return actualAnimals.size();
    }
}