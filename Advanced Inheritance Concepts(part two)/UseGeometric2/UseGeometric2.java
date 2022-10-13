/* 12. Modify Exercise 11, adding an interface called SidedObject that contains a method
       called displaySides(); this method displays the number of sides the object possesses.
       Modify the GeometricFigure subclasses to include the use of the interface to display
       the number of sides of the figure. Create an application that demonstrates the use
       of both subclasses. Save the files as GeometricFigure2.java, Square2.java,
       Triangle2.java, SidedObject.java, and UseGeometric2.java*/

public class UseGeometric2
{
    public static void main(String[] args)
       {
          Square2 obj = new Square2(20,40);
          obj.displaySides();
          Triangle2 obj1 = new Triangle2(40,50);
          obj1.displaySides();
       }
}









