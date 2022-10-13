package kelvino.element;

public class MetalElement extends Element
{
    public MetalElement(String symbol, int num, double weight)
      {
          super(symbol, num, weight);
      }

    @Override
    public void describeElement()
      {
         System.out.println("\nElement Symbol: " + getSymbol() +
                            "\nAtomic Number: " + getAtomicNum() +
                            "\nAtomic Weight: " + getAtomicWeight() +
                            "\nExplanation: Metals are good conducors of electricity.");
      }
}