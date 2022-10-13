public class Blanket
{
   private String blanketSize;
   private String blanketColor;
   private String blanketMaterial;
   protected double blanketPrice;

   public Blanket()
     {
        blanketSize = "Twin";
        blanketColor = "White";
        blanketMaterial = "Cotton";
        blanketPrice = 30.00;
     }

   public void setBlanketSize(int size)
     {
         if(size == 1)
           {
             blanketSize = "Double";
             blanketPrice += 10;
           }
        else if(size == 2)
           {
              blanketSize = "Queen";
              blanketPrice += 25;
           }
        else if(size == 3)
           {
             blanketSize = "King";
             blanketPrice += 40;
           }
        else if(size < 1 || size > 3)
           {
               blanketSize = "Twin";
               blanketColor = "White";
               blanketMaterial = "Cotton";
               blanketPrice = 30.00;
           }
        
     }
  public void setBlanketColor(String color)
     {
        blanketColor = color;
         
        if(blanketPrice == 30.00)
            {
               blanketSize = "Twin";
               blanketColor = "White";
               blanketMaterial = "Cotton";
               blanketPrice = 30.00;
            }
     }
  public void setBlanketMaterial(int material)
     {
         if(material == 1 && blanketPrice > 30.00)
           {
             blanketMaterial = "Wool";
             blanketPrice += 20;
           }
         else if(material == 2 && blanketPrice > 30.00)
           {
              blanketMaterial = "Cashmere";
              blanketPrice += 45;
           }
         else if(material < 1 || material > 2)
           {
               blanketSize = "Twin";
               blanketColor = "White";
               blanketMaterial = "Cotton";
               blanketPrice = 30.00;
           }
         else if(blanketPrice == 30.00)
            {
               blanketSize = "Twin";
               blanketColor = "White";
               blanketMaterial = "Cotton";
               blanketPrice = 30.00;
            }

     }

  public String getBlanketSize()
     {
         return blanketSize;
     }
  public String getBlanketColor()
     {
         return blanketColor;
     }
  public String getBlanketMaterial()
     {
         return blanketMaterial;
     }
  public double getBlanketPrice()
     {
         return blanketPrice;
     }

  public String toString()
     {
        return("\nBlanket Size: " + getBlanketSize() +
               "\nBlanket Color: " + getBlanketColor() +
               "\nBlanket Material: " + getBlanketMaterial() +
               "\nBlanket Price: " + getBlanketPrice());
     }
}













