/* 13. In a “You Do It” section of this chapter, you created a CalculatorDemo program that
       asked the user to solve an arithmetic problem and provided the system calculator for
       assistance. Now modify that program to include the following improvements:
       Both numbers in the arithmetic problem should be random integers
       between 1 and 5,000.
       The program should ask the user to solve five problems.
       The program should handle any noninteger data entry by displaying an
       appropriate message and continuing with the next problem.
       Save the file as CalculatorDemo2.java.*/


import java.util.*;
import java.io.IOException;
public class CalculatorDemo3
{
   public static void main(String[] args) throws Exception
     {
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec
            ("cmd /c C:\\Windows\\System32\\calc.exe");
        int i = 0;

      while(i < 5)
        {
            ++i;
            int num1 = 2 + (int)(Math.random()*4999);
            int num2 = 2 + (int)(Math.random()*4999);
            double answer = num1 + num2;
            double usersAnswer;
  
            System.out.print("What is the sum of " + num1 +
                 " and " + num2 + "? >> ");
          try
           {
               usersAnswer = input.nextDouble();
               if(usersAnswer == answer)
                 System.out.println("Correct!");
               else
                 System.out.println("Sorry - the answer is " + answer);
            }
           catch(InputMismatchException e)
             {
                   System.out.println(e.getMessage());   
             }
         input.nextLine();
       }
     }
}