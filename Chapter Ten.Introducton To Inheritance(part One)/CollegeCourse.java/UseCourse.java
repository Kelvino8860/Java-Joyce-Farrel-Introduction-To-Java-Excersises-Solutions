/* 8. Create a class named CollegeCourse that includes data fields that hold the
      department (for example, ENG), the course number (for example, 101), the credits
      (for example, 3), and the fee for the course (for example, $360). All of the fields are
      required as arguments to the constructor, except for the fee, which is calculated at
      $120 per credit hour. Include a display() method that displays the course data.
      Create a subclass named LabCourse that adds $50 to the course fee. Override the
      parent class display() method to indicate that the course is a lab course and to
      display all the data. Write an application named UseCourse that prompts the
      user for course information. If the user enters a class in any of the following
      departments, create a LabCourse: BIO, CHM, CIS, or PHY. If the user enters any
      other department, create a CollegeCourse that does not include the lab fee. Then
      display the course data. Save the files as CollegeCourse.java, LabCourse.java, and
      UseCourse.java. */

import java.util.Scanner;


public class UseCourse
{
   public static void main(String[]  args)
      {
         Scanner input = new Scanner(System.in);

         String department;
         int courseNum;
         int creditHours;
         
         System.out.print("Enter department >> ");
         department = input.nextLine();

         if(department.equalsIgnoreCase("BIO") || department.equalsIgnoreCase("CHM") ||
            department.equalsIgnoreCase("CIS") || department.equalsIgnoreCase("PHY"))  
               {
                  System.out.print("Enter course number >> ");
                  courseNum = (int)input.nextInt();
                  System.out.print("Enter credit >> ");
                  creditHours = input.nextInt();

                  LabCourse obj1 = new LabCourse(department, courseNum, creditHours);
                  obj1.display();                 
               }   
         else
           {
                  System.out.print("Enter course number >> ");
                  courseNum = (int)input.nextInt();
                  System.out.print("Enter credit >> ");
                  creditHours = input.nextInt();

                  CollegeCourse obj2 = new CollegeCourse(department, courseNum, creditHours);
                  obj2.display();
           }  
      }
}