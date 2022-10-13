package kelvino.element;

public abstract class Element
{
   private String symbol;
   private int atomicNum;
   private double atomicWeight;

   public Element(String symbol, int num, double weight)
     {
         this.symbol = symbol;
         atomicNum = num;
         atomicWeight = weight;
     }
   
   public String getSymbol()
     {
        return symbol;
     }
   public int getAtomicNum()
     {
        return atomicNum;
     }
   public double getAtomicWeight()
     {
        return atomicWeight;
     }

   public abstract void describeElement();
}