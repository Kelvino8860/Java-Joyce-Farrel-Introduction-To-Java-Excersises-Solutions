/*  9. Create a class named Rock that acts as a superclass for rock samples collected and
       catalogued by a natural history museum. The Rock class contains fields for a number
       of samples, a description of the type of rock, and the weight of the rock in grams.
       Include a constructor that accepts parameters for the sample number and weight.
       The Rock constructor sets the description value to Unclassified. Include get methods
       for each field. Create three child classes named IgneousRock, SedimentaryRock, and
       MetamorphicRock. The constructors for these classes require parameters for the
       sample number and weight. Search the Web for a brief description of each rock type
       and assign it to the description field. Create an application that instantiates an object
       of each type and demonstrate that the methods work appropriately. Save the files as
       Rock.java, IgneousRock.java, SedimentaryRock.java, MetamorphicRock.java,
       and DemoRocks.java*/

import java.util.Scanner;
public class DemoRocks
{
   public static void main(String[] args)
     {
       Scanner input = new Scanner(System.in);
       int samples;
       double weight;

       System.out.print("Enter number of samples collected >> ");
       samples = input.nextInt();
       System.out.print("Enter weight of samples in grams >> ");
       weight = input.nextDouble();
       Rock obj1 = new Rock(samples, weight);

       System.out.print("\nEnter number of samples collected >> ");
       samples = input.nextInt();
       System.out.print("Enter weight of samples in grams >> ");
       weight = input.nextDouble();
       IgneousRock obj2 = new IgneousRock(samples, weight);

       System.out.print("\nEnter number of samples collected >> ");
       samples = input.nextInt();
       System.out.print("Enter weight of samples in grams >> ");
       weight = input.nextDouble();
       SedimentaryRock obj3 = new SedimentaryRock(samples, weight);

       System.out.print("\nEnter number of samples collected >> ");
       samples = input.nextInt();
       System.out.print("Enter weight of samples in grams >> ");
       weight = input.nextDouble();
       MetamorphicRock obj4 = new MetamorphicRock(samples, weight);

       display(obj1);
       display(obj2);
       display(obj3);
       display(obj4);
     }

   public static void display(Rock y)
     {
        System.out.println("\nNumber of Samples: " + y.getNumSamples() + "\nWeight of samples: " +
                y.getWeight() + "\nDescription: " + y.getDescription());
     }
}