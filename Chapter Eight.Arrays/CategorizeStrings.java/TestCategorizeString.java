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
          System.out.print("Enter 1 to display all the short strings that have 10 characters or less: ");
           int value = inputVal.nextInt();
           obj.choose(value);
        }
}