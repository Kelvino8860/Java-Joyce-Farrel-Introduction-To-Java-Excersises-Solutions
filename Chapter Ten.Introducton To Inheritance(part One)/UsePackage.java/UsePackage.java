/* 7. Create a class named Package with data fields for weight in ounces, shipping method,
      and shipping cost. The shipping method is a character: A for air, T for truck, or M for
      mail. The Package class contains a constructor that requires arguments for weight and
      shipping method. The constructor calls a calculateCost() method that determines
      the shipping cost, based on the following table:
         
            Weight(oz.)     Air($)    Truck($)     Mail($)
             1 to 8         2.00       1.50         .50
             9 to 16        3.00       2.35        1.50
            17 and over     4.50       3.25        2.15
 
      The Package class also contains a display() method that displays the values in all
      four fields. Create a subclass named InsuredPackage that adds an insurance cost to
      the shipping cost, based on the following table:

            Shipping Cost Before Insurance($)         Additional Cost($)
                 0 to 1.00                               2.45
                1.01 to 3.00                             3.95
                3.01 and over                            5.55          

      Write an application named UsePackage that instantiates at least three objects of
      each type (Package and InsuredPackage) using a variety of weights and shipping
      method codes. Display the results for each Package and InsuredPackage. Save the
      files as Package.java, InsuredPackage.java, and UsePackage.java*/


import java.util.Scanner;

public class UsePackage
{
   public static void main(String[] args)
     {
        Package[] obj1 = new Package[3];
        InsuredPackage[] obj2 = new InsuredPackage[3];

        Scanner input = new Scanner(System.in);
        Scanner inputChar = new Scanner(System.in);

        for(int i = 0; i < obj1.length; ++i)
          {
             System.out.print("Enter weight of package >>> ");
             double weight = input.nextDouble();
             System.out.print("Enter shipping method(A for Air, T for Truck and M for mail) >>> ");
             char shipping = Character.toUpperCase(inputChar.nextLine().charAt(0));
    
             obj1[i] = new Package(weight, shipping);
          }
       
         System.out.println();
         for(int i = 0; i < obj1.length; ++i)
          {
             System.out.print("Enter weight of package >>> ");
             double weight = input.nextDouble();
             System.out.print("Enter shipping method(A for Air, T for Truck and M for mail) >>> ");
             char shipping = Character.toUpperCase(inputChar.nextLine().charAt(0));
    
             obj2[i] = new InsuredPackage(weight, shipping);
          }

        //Display all information
           for(int i = 0; i < obj1.length; ++i)
              {
                 obj1[i].display();
              }
            for(int i = 0; i < obj2.length; ++i)
              {
                 obj2[i].display();
              }
           
       }
}