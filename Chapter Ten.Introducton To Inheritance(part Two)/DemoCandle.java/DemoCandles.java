/* 2. Mick’s Wicks makes candles in various sizes. Create a class for the business named
      Candle that contains data fields for color, height, and price. Create get methods for
      all three fields. Create set methods for color and height, but not for price. Instead,
      when height is set, determine the price as $2 per inch. Create a child class named
      ScentedCandle that contains an additional data field named scent and methods to
      get and set it. In the child class, override the parent’s setHeight() method to set the
      price of a ScentedCandle object at $3 per inch. Write an application that instantiates
      an object of each type and displays the details. Save the files as Candle.java,
      ScentedCandle.java, and DemoCandles.java.*/

public class DemoCandles
{
    public static void main(String[] args)
        {
           Candle aCandle = new Candle();

           aCandle.setColor("White");
           aCandle.setHeight(3.0);

           System.out.println("Object of Parent class"+
               "\nColor: " + aCandle.getColor() +
               "\nHeight: " + aCandle.getHeight() + "inches" +
               "\nPrice: $" + aCandle.getPrice());

           ScentedCandle aScentedCandle = new ScentedCandle();
            
           aScentedCandle.setColor("Red");
           aScentedCandle.setHeight(4.0);
           aScentedCandle.setScent("Lemon");

            System.out.println("\nObject of Child class"+
               "\nColor: " + aScentedCandle.getColor() +
               "\nHeight: " + aScentedCandle.getHeight() + "inches" +
               "\nScent: " + aScentedCandle.getScent() +
               "\nPrice: $" + aScentedCandle.getPrice());
        }
}