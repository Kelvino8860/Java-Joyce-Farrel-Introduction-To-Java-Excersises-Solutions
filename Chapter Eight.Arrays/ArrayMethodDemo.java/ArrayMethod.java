/* 4. Create an application containing an array that stores 10 integers. The application
      should call five methods that in turn (1) display all the integers, (2) display all the
      integers in reverse order, (3) display the sum of the integers, (4) display all values less
      than a limiting argument, and (5) display all values that are higher than the calculated
      average value. Save the file as ArrayMethodDemo.java.*/

public class ArrayMethod{
       private int[] integers = {1,2,3,4,5,6,7,8,9,10};
       
       public ArrayMethod(){
           
         }
       public void displayAll(){
           for(int i = 0; i < integers.length; i++){
              System.out.print(integers[i] + " ");
               }
             System.out.println();
         }
       public void displayReverse(){
            for(int i = integers.length-1; i >= 0; i--){
                System.out.print(integers[i] + " ");
                 }
             System.out.println();
         }
       public void sumIntegers(){
           int sum = 0;
           for(int i = 0; i < integers.length; i++){
              sum += integers[i];
               }
           System.out.println("Sum of the integers: " + sum);
         }
       public void displayTill(){
           System.out.println("Integers less than 8: ");
           for(int i = 0; i < integers.length; i++){
                 if(integers[i] < 8){
                    System.out.print(integers[i] + " ");
                   }
              }
             System.out.println();
         }
      public void displayAboveAverage(){
            int sum = 0;
            for(int i = 0; i < integers.length; i++){
                   sum += integers[i];
                 }
            double average = sum / integers.length;
               System.out.println("All integers above the average value: ");
            for(int i = 0; i < integers.length; i++){
                  if(integers[i] > average){
                     System.out.print(integers[i] + " ");
                      }
                }
         }
}