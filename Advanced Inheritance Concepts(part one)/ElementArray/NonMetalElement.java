package kelvino.element;

public class NonMetalElement extends Element
{
    public NonMetalElement(String symbol, int num, double weight)
      {
          super(symbol, num, weight);
      }

    @Override
    public void describeElement()
      {
         System.out.println("\nElement Symbol: " + getSymbol() +
                            "\nAtomic Number: " + getAtomicNum() +
                            "\nAtomic Weight: " + getAtomicWeight() +
                            "\nExplanation: NonMetals are poor conducors of electricity.");
      }
}