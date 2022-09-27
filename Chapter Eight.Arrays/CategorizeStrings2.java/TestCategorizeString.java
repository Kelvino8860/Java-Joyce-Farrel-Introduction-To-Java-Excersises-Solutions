import java.util.Scanner;
public class TestCategorizeString{
     public static void main(String[]  args){
          CategorizeString obj = new CategorizeString(10);

          Scanner input = new Scanner(System.in);
          System.out.print("Enter 10 strings or enter exit to stop: ");
          String words;
      
        do{
                 words = input.nextLine();
             if(!words.equalsIgnoreCase("exit"))
                 obj.push(words);

           }while(!words.equalsIgnoreCase("exit") && CategorizeString.size < CategorizeString.DEFAULT_CAPACITY);

          obj.divideString();
          
          Scanner inputVal = new Scanner(System.in);
          int value;
         do{
               System.out.println("Enter 1 to display all strings with 1 space, 2 to display all strings with two spaces and 3 to display all strings with more spaces: ");
               value = inputVal.nextInt();
               obj.choose(value);
            }while(value != 0);
        }
}