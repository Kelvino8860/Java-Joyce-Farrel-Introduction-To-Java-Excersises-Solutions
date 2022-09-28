public class Package
{
   protected double weight;
   protected char shippingMethod;
   protected double shippingCost;

   public Package(double weight, char shipping)
      {
         this.weight = weight;
         shippingMethod = shipping;

         calculateCost();   
      }

   public void calculateCost()
      {
         //Set shipping cost when using air
          if(shippingMethod == 'A')
            {
               if(weight >= 1 && weight <= 8)
                   {
                      shippingCost = 2.00; 
                   }
               else if(weight >= 9 && weight <=16)
                   {
                      shippingCost = 3.00;
                   }
               else if(weight >= 17)
                  {
                     shippingCost = 4.50;
                  }
            }

         //set shipping cost using truck
           if(shippingMethod == 'T')
            {
               if(weight >= 1 && weight <= 8)
                   {
                      shippingCost = 1.50; 
                   }
               else if(weight >= 9 && weight <=16)
                   {
                      shippingCost = 2.35;
                   }
               else if(weight >= 17)
                  {
                     shippingCost = 3.25;
                  }
            }
        //set shipping cost using mail
          if(shippingMethod == 'M')
            {
               if(weight >= 1 && weight <= 8)
                   {
                      shippingCost = 0.50; 
                   }
               else if(weight >= 9 && weight <=16)
                   {
                      shippingCost = 1.50;
                   }
               else if(weight >= 17)
                  {
                     shippingCost = 2.15;
                  }
            }
      }

   public void display()
     {
         System.out.println("\nWeight(oz.): " + weight + "\nShipping Method: " +
                 shippingMethod + "\nShipping Cost: $" + shippingCost);
     }
}















