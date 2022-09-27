/* 1. a. Write an application containing an array of 20 String values, and display them in
         ascending order. Save the file as StringSort.java.*/


public class  StringSort{
   
        public static void main(String[] args){
                 String[] array = {"Kelvin", "Njoroge", "John", "Mwaura", "Peter", "Githinji",
                                   "Zack", "Lydia", "Amazon", "Fangs", "Tracy", "Octavia", "Sinyorita",
                                   "Ruto", "Uhuru", "Queen", "Bishop", "Yusuf", "Inactive", "Dercy",
                                   "Viola"};

                 java.util.Arrays.sort(array);
      
                 for(String name : array)
                     System.out.print(name + " ");        
              }
}