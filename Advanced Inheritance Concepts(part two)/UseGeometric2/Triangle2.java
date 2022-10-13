public class Triangle2 extends GeometricFigure2 implements SidedObject
{
    public Triangle2(double height, double width)
      {
          super(height, width, "Triangle");
          area();  
      }

    @Override
    public void area()
      {
         area = (height * width) * 0.5;
      }
    @Override
    public void displaySides()
      {
         System.out.println("This object has 3 sides");
      }
}