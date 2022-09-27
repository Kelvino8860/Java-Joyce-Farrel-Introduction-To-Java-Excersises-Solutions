/* 2. a. The mean of a list of numbers is its arithmetic average. The median of a list is its
         middle value when the values are placed in order. For example, if a list contains 1,
         4, 7, 8, and 10, then the mean is 6 and the median is 7. Write an application that
         allows you to enter five integers and displays the values, their mean, and their
         median. Save the file as MeanMedian.java*/

import java.util.Scanner;

public class MeanMedian{

        public static void main(String[] args){
             
              int[] array = new int[5];
              Scanner input = new Scanner(System.in);
              
              System.out.print("Enter five integers >> ");
                for(int i = 0; i < array.length; ++i){
                      
                      array[i] = input.nextInt();
                   }

             displayMean(array);
           }

       public static void displayMean(int[] a){
          
           //Display all values
               System.out.print("The values are >> ");
               for(int value : a)
                System.out.print(value + " ");
   
          //Display mean
              double total = 0;
                for(int i = 0; i < a.length; ++i){
                     total += a[i];
                  }

               System.out.println("\nThe mean is >> " + (total / a.length));

          
         //Display median
            java.util.Arrays.sort(a);
            System.out.println("The Meadian is >> " + a[2]);
           }
}