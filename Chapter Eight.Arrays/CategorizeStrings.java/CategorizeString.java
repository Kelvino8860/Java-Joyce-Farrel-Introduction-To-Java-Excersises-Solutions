/* 5. a. Write an application that accepts up to 10 Strings, or fewer if the user enters
      a terminating value. Divide the entered Strings into two lists—one for short
      Strings that are 10 characters or fewer and the other for long Strings. After
      data entry is complete, prompt the user to enter which type of String to display,
      and then output the correct list. For this exercise, you can assume that if the
      user does not request the list of short strings, the user wants the list of long
      strings. If there are no Strings in a requested list, output an appropriate
      message. Prompt the user continuously until a sentinel value is entered. Save
      the file as CategorizeStrings.java*/

public class CategorizeString{
       private String[] elements;
       private String[] listOne = new String[10];
       private String[] listTwo = new String[10];
       public static final int DEFAULT_CAPACITY = 10;
       public static int size;
       public static int sizeOne;
       public static int sizeTwo;
       
       public CategorizeString(){
            this(DEFAULT_CAPACITY);
         }
       public CategorizeString(int capacity){
             elements = new String[capacity];
         }
       public void push(String words){
           elements[size++] = words;
         }
       
   /*Divide string into two depending on length*/
       public void divideString(){
            for(int i = 0; i < size; i++){
                  if(elements[i].length() <= 10){
                           listOne[++sizeOne] = elements[i];
                         }
                   else{
                      listTwo[++sizeTwo] = elements[i];
                         }
               }
         }
   /*Decide which string to display*/
       public void choose(int value){
            if(value == 1){
               
              //check whether the list is empty, if its empty produce an appropriet message
                if(sizeOne != 0){
                    for(int i = 1; i <= sizeOne; i++){
                       System.out.print(listOne[i] + " ");
                    }
                  }
                else{
                      System.out.println("Sorry!! the list containing short strings is empty");
                      }
              }
            else{

            //check whether the list is empty, if its empty produce an appropriet message
              if(sizeTwo != 0){
                   for(int i = 1; i <= sizeTwo; i++){
                     System.out.print(listTwo[i] + " ");
                   }
                 }
               else{
                     System.out.println("Sorry!! the list containing long strings is empty");
                     }
                 }
         }
}