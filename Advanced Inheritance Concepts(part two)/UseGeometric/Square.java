public class Square extends GeometricFigure
{
    public Square(double height, double width)
      {
         super(height, width, "Square");
         area();
      }

    @Override
    public void area()
      {
           area = height * width;
      }
}