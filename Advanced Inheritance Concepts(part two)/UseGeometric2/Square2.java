public class Square2 extends GeometricFigure2 implements SidedObject
{
    public Square2(double height, double width)
      {
         super(height, width, "Square");
         area();
      }

    @Override
    public void area()
      {
           area = height * width;
      }
    @Override
    public void displaySides()
      {
         System.out.println("This object has 4 sides");
      }
}