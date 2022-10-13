public class Triangle extends GeometricFigure
{
    public Triangle(double height, double width)
      {
          super(height, width, "Triangle");
          area();   
      }

    @Override
    public void area()
      {
         area = (height * width) * 0.5;
      }
}