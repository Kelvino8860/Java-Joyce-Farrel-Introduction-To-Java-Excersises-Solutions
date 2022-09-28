public class InsuredPackage extends Package
{   
    private double newCost = 0;

    public InsuredPackage(double weight, char shipping)
      {
         super(weight, shipping);
         calculate2();
      }

    public void calculate2()
      {
        if(shippingCost >= 0 && shippingCost <= 1)
           {
              newCost = shippingCost + 2.45;
           }
         if(shippingCost >= 1.01 && shippingCost <= 3)
           {
              newCost = shippingCost + 3.95;
           }
         if(shippingCost >= 3.01)
           {
              newCost = shippingCost + 5.55;
           }
      }

     @Override
    public void display()
       {
          System.out.println("\nWeight(oz.): " + weight + "\nShipping Method: " +
                 shippingMethod + "\nShipping Cost: " + shippingCost + "\nInsured Shipping Cost: $" + newCost);
       }
}