/* b. Write an application that accepts any number of String values from a user up to
      20, and display them in ascending order. Save the file as StringSort2.java*/

import java.util.Scanner;

public class StringSort2{
    
         public static void main(String[] args){
               
                Scanner input = new Scanner(System.in);
                String[] array = new String[20];
                
                System.out.print("Enter 20 strings >> ");
                  for(int i = 0; i < array.length; ++i){
                      
                       array[i] = input.nextLine();
                   }

                java.util.Arrays.sort(array);   
             
                for(String name : array)
                  System.out.print(name + " ");
             }
}