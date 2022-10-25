import java.util.Scanner;
import java.io.IOException;
public class CalculatorDemo2
{
   public static void main(String[] args) throws Eception
     {
        Scanner input = new Scanner(System.in);

     
        Runtime proc = Runtime.getRuntime(); 
             proc.exec("calc");

        double num1 = 279.6;
        double num2 = 872.8;
        double answer = num1 + num2;
        double usersAnswer;
  
        System.out.print("What is the sum of " + num1 +
            " and " + num2 + "? >> ");
        usersAnswer = input.nextDouble();
        if(usersAnswer == answer)
        System.out.println("Correct!");
        else
        System.out.println("Sorry - the answer is " + answer);
     }
}