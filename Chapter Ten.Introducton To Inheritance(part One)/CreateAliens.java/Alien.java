/* 1. a. Create an Alien class. Include at least three protected data members of your
         choice, such as the number of eyes the Alien has. Include a constructor that
         requires a value for each data field and a toString() method that returns a
         String containing a complete description of the Alien. Save the file as
         Alien.java.
      b. Create two classes—Martian and Jupiterian—that descend from Alien. Supply
         each with a constructor that sets the Alien data fields with values you choose.
         For example, you can decide that a Martian has four eyes but a Jupiterian has
         only two. Save the files as Martian.java and Jupiterian.java.
      c. Create an application that instantiates one Martian and one Jupiterian. Call the
         toString() method with each object and display the results. Save the application
         as CreateAliens.java*/


public class Alien
{
   protected int numEyes;
   protected int numLimbs;
   protected String skinColor;

   public Alien(int eyes, int limbs, String color)
     {
        numEyes = eyes;
        numLimbs = limbs;
        skinColor = color;
     }

  public String toString()
     {
         return "The Alien has " + numEyes + " eyes, " + numLimbs +
              " limbs and a " + skinColor + " body color";
     }
}