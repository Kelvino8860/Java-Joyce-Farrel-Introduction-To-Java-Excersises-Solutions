import java.util.Scanner;
public class TestDisplayInt{
      public static void main(String[] args){
     
      DisplayInt obj = new DisplayInt();

       Scanner input = new Scanner(System.in);
      
      System.out.println("Enter twelve integers: ");
      for(int i = 0; i < DisplayInt.DEFAULT_SIZE; i++){

             int value = input.nextInt();
             obj.setValue(value);
          }
     obj.display();
     }
  }