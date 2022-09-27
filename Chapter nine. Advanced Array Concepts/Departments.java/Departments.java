/* 6. Write an application that stores at least five different department and supervisor
      names in a two-dimensional array. Allow the user to enter a department name (such
      as “Marketing”) and display the corresponding supervisor’s name. If the department
      does not exist, display an error message. Save the file as Departments.java*/

import java.util.Scanner;

public class  Departments{
    public static void main(String[] args){
              String[][] array = {{"Kiswahili", "Mr.Kibonzo"},
                                  {"Biology", "Mr.Otieno"},
                                  {"Chemistry", "Mrs.Gitonga"},
                                  {"Physics", "Mr.Kamwaro"},
                                  {"History", "Mr.Cheruiyot"}};
              Scanner input = new Scanner(System.in);
              String department;
    
        System.out.println("Departments: Kiswahili, Biology, Chemistry, physics, History");
        System.out.print("Kindly entere a department name to display the supervisor >> ");
            department = input.nextLine();
            int count = 0;

           for(int row = 0; row < array.length; row++){
                 for(int col = 0; col < array[row].length; ++col){

                      if(department.equalsIgnoreCase(array[row][col])){
                             System.out.println("\nThe " + department + " supervisor is " + array[row][col + 1]);
                             count++;
                          }
                  }
               }
              
            if(count == 0){
                       System.out.println("Sorry the department does not exist!!!");
                 }
       }
}