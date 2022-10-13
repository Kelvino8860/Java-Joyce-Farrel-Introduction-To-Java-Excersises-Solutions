public abstract class GeometricFigure2 
{
   protected double height;
   protected double width;
   private String figureType;
   protected double area;

   public GeometricFigure2(double height, double width, String figureType)
     {
         this.height = height;
         this.width = width;
         this.figureType = figureType;  
     }

   public abstract void area();
}