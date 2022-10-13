/* 14. Create a Building class and two subclasses, House and School. The Building class
       contains fields for square footage and stories. The House class contains additional
       fields for number of bedrooms and baths. The School class contains additional
       fields for number of classrooms and grade level (for example, elementary or
       junior high). All the classes contain appropriate get and set methods. Place the
       Building, House, and School classes in a package named com.course.buildings.
       Create an application that declares objects of each type and uses the package.
       Save the necessary files as Building.java, House.java, School.java, and
       CreateBuildings.java.*/

import java.util.Scanner;
import com.course.buildings.Building;
import com.course.buildings.House;
import com.course.buildings.School;

public class CreateBuildings
{
   public static void main(String[] args)
     {
         Scanner input = new Scanner(System.in);
         Scanner inputString = new Scanner(System.in);
         double footage;
         int stories,bedrooms,baths,classrooms;
         String gradeLevel;

         Building obj1 = new Building();    
         System.out.print("Enter square footage of the building >>> ");
         footage = input.nextDouble();
         System.out.print("Enter number of stories >>> ");
         stories = input.nextInt();
         obj1.setFootage(footage);
         obj1.setStories(stories);

         House obj2 = new House();
         System.out.print("\nEnter square footage of the building >>> ");
         footage = input.nextDouble();
         System.out.print("Enter number of stories >>> ");
         stories = input.nextInt();
         System.out.print("Enter number of bedrooms >>> ");
         bedrooms = input.nextInt();
         System.out.print("Enter number of baths >>> ");
         baths = input.nextInt();
         obj2.setFootage(footage);
         obj2.setStories(stories);
         obj2.setBedrooms(bedrooms);
         obj2.setBaths(baths);

         School obj3 = new School();
         System.out.print("\nEnter square footage of the building >>> ");
         footage = input.nextDouble();
         System.out.print("Enter number of stories >>> ");
         stories = input.nextInt();
         System.out.print("Enter number of classrooms >>> ");
         classrooms = input.nextInt();
         System.out.print("Enter grade level >>> ");
         gradeLevel = inputString.nextLine();
         obj3.setFootage(footage);
         obj3.setStories(stories);
         obj3.setClassrooms(classrooms);
         obj3.setGradeLevel(gradeLevel);

         display(obj1, obj2, obj3);
       
     }

  public static void display(Building x, House y, School z)
      {
          System.out.println("\nBuilding Square Footage: " + x.getFootage() +
                            "\nBuilding Stories: " + x.getStories());
 
          System.out.println("\nHouse Square Footage: " + y.getFootage() +
                             "\nHouse Stories: " + y.getStories() +
                             "\nNumber of bedrooms: " + y.getBedrooms() +
                             "\nNumber of baths: " + y.getBaths());

           System.out.println("\nSchool Square Footage: " + z.getFootage() +
                             "\nSchool Stories: " + z.getStories() +
                             "\nNumber of classrooms: " + z.getClassrooms() +
                             "\nGrade Level: " + z.getGradeLevel());
      }
}
















