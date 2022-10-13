
public abstract class Alien
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