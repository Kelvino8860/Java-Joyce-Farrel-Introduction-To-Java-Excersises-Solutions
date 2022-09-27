import java.util.Scanner;

class DoesItHaveLegs
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int answer=0;
        int question=0;
        int anotherQuestion=0;
        int actualAnimals=0;
        int roundAbout=0;
        String quitter="YES";
        String userInput=null;
        Animal animal = new Animal();
        do
        {
            userInput="";
            for(int a=0;a<animal.getQuestionsLength();++a)
            {
                userInput="";
                if(a>0)
                {

                    animal.displayQuestion(a);
                    userInput=scan.nextLine();
                    if(userInput.equalsIgnoreCase("Yes"))
                    {
                        answer=a;
                        a=animal.getQuestionsLength();
                    }
                }
                else
                {
                    animal.displayQuestion(a);
                    userInput=scan.nextLine();
                    if(userInput.equalsIgnoreCase("No"))
                    {
                        a=animal.getQuestionsLength();
                    }
                }

            }

            if(userInput.equalsIgnoreCase("Yes"))
            {
                String enteredAnswer=null;

                        if(answer>0)
                        {
                            animal.displayAnswer(answer-1);
                            enteredAnswer=scan.nextLine();
                        }
                        else
                        {
                            animal.displayAnswer(answer);
                            enteredAnswer=scan.nextLine();
                        }
                        if(enteredAnswer.equalsIgnoreCase("Yes"))
                        {
                            System.out.println("Yay I won");
                            System.out.println("Do you want to play again?");
                            quitter=scan.nextLine();
                        }
                        else
                        {
                            animal.giveUpMessage();
                            String enteredAnimal = scan.nextLine();
                            animal.addActualAnimals(enteredAnimal);
                            animal.addAnswers("Is it a "+enteredAnimal);
                            actualAnimals=animal.getActualAnimalsLength()-1;
                            System.out.println("Type a question for which the answer is Yes for " +
                                           animal.getActualAnimals(actualAnimals-1)+" but No for " + animal.getActualAnimals(actualAnimals));
                            String enteredQuestion = scan.nextLine();
                            animal.addQuestions(enteredQuestion);
                            System.out.println("Do you want to play again?");
                            quitter=scan.nextLine();

                        }



            }
            else if(userInput.equalsIgnoreCase("No"))
            {
                String enteredAnswer=null;
                for(int i=0;i<=animal.getAnswersLength();++i)
                {
                    if(i==animal.getAnswersLength())
                    {
                        animal.displayAnswer(i-1);
                        enteredAnswer=scan.nextLine();
                        if(enteredAnswer.equalsIgnoreCase("Yes"))
                        {
                            System.out.println("Yay I won");
                            System.out.println("Do you want to play again?");
                            quitter=scan.nextLine();
                        }
                        else
                        {
                            animal.giveUpMessage();
                            String enteredAnimal = scan.nextLine();
                            animal.addActualAnimals(enteredAnimal);
                            animal.addAnswers("Is it a "+enteredAnimal);
                            actualAnimals=animal.getActualAnimalsLength()-1;
                            System.out.println("Type a question for which the answer is Yes for "+
                                  animal.getActualAnimals(actualAnimals-1)+" but No for " + animal.getActualAnimals(actualAnimals));
                            String enteredQuestion = scan.nextLine();
                            animal.addQuestions(enteredQuestion);
                            i=animal.getAnswersLength();
                            System.out.println("Do you want to play again?");
                            quitter=scan.nextLine();
                        }
                    }
                }
            }



        }
        while(!(quitter.equalsIgnoreCase("NO")));

    }
}
