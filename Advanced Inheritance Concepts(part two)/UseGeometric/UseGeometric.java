/* 11. Create an abstract class called GeometricFigure. Each figure includes a height, a
       width, a figure type, and an area. Include an abstract method to determine the area
       of the figure. Create two subclasses called Square and Triangle. Create an application that        demonstrates creating objects of both subclasses, and store them in an
       array. Save the files as GeometricFigure.java, Square.java, Triangle.java, and
       UseGeometric.java*/


import java.util.Scanner;

public class UseGeometric
{
    public static void main(String[] args)
       {
          GeometricFigure[] objArray = new GeometricFigure[4];

          Scanner input = new Scanner(System.in);
          double height, width;

          for(int i = 0; i < objArray.length; ++i)
             {
                if(i < 2)
                  {
                     System.out.print("Enter height of Square >>> ");
                     height = input.nextDouble();
                     System.out.print("Enter width of Square >>> ");
                     width = input.nextDouble();
                     objArray[i] = new Square(height, width);                
 
                     System.out.println();//Spacing
                  }
                else if(i > 1)
                  {
                     System.out.print("Enter height of Triangle >>> ");
                     height = input.nextDouble();
                     System.out.print("Enter width of Triangle >>> ");
                     width = input.nextDouble();
                     objArray[i] = new Triangle(height, width);                
 
                     System.out.println();//Spacing
                  }
             }
       }
}