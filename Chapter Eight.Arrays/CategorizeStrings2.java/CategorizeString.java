/* 5.b. Modify the CategorizeStrings application to divide the entered Strings into
        those that contain no spaces, one space, or more. After data entry is complete,
        continuously prompt the user to enter the type of String to display. If the user
        does not enter one of the three valid choices, display all of the Strings. Save the
        file as CategorizeStrings2.java.*/

public class CategorizeString{
       private String[] elements;
       private String[] listOne = new String[10];
       private String[] listTwo = new String[10];
       private String[] listThree = new String[10];
       public static final int DEFAULT_CAPACITY = 10;
       public static int size;
       public static int sizeOne;
       public static int sizeTwo;
       public static int sizeThree;
       
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
              int countSpace = 0;
            for(int i = 0; i < size; i++){
                 for(int j = 0; j < elements[i].length(); j++){
                       if(elements[i].charAt(j) == ' '){
                             ++countSpace;
                              }
                     }
                if(countSpace == 1){
                     listOne[++sizeOne] = elements[i];
                    }
                else
                  if(countSpace == 2){
                      listTwo[++sizeTwo] = elements[i];
                     }
                else
                  if(countSpace > 2){
                      listThree[++sizeThree] = elements[i];
                     }
               countSpace = 0;
                  }
         }
   /*Decide which string to display*/
       public void choose(int value){
            if(value == 1){
               
              //check whether the list is empty, if its empty produce an appropriet message
                if(sizeOne != 0){
                    for(int i = 1; i <= sizeOne; i++){
                       System.out.println(listOne[i]);
                    }
                  }
                else{
                      System.out.println("Sorry!! the list containing short strings is empty");
                      }
              }

            else if(value == 2){

            //check whether the list is empty, if its empty produce an appropriet message
              if(sizeTwo != 0){
                   for(int i = 1; i <= sizeTwo; i++){
                     System.out.println(listTwo[i]);
                   }
                 }
               else{
                     System.out.println("Sorry!! the list containing long strings is empty");
                     }
                 }

          else if(value == 3){
                  
                    //check whether the list is empty, if its empty produce an appropriet message
              if(sizeThree != 0){
                   for(int i = 1; i <= sizeThree; i++){
                     System.out.println(listThree[i]);
                   }
                 }
               else{
                     System.out.println("Sorry!! the list containing long strings is empty");
                     }
                }

         else{
                  for(int i = 0; i < size; i++){
                         System.out.println(elements[i]);
                       }
               }
         }
}