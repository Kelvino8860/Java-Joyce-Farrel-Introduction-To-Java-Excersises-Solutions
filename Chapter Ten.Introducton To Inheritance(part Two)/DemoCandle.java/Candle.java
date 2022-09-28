public class Candle
{
   private String color;
   private double height;
   protected double price;

   public String getColor()
    {
       return color;
    }
  public double getHeight()
    {
       return height;
    }
  public double getPrice()
    {
       return price;
    }

  public void setColor(String color)
    {
      this.color = color;
    }
  public void setHeight(double height)
    {
        this.height = height;
        price = 2 * this.height;
    }
}