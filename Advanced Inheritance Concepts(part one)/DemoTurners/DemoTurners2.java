/* b. Think of two more objects that use turn(), create classes for them, and then add
      objects to the DemoTurners application, renaming it DemoTurners2.java. Save
      the files, using the names of new objects that use turn().*/

public class DemoTurners2
{
   public static void main(String[] args)
      {
         Leaf aLeaf = new Leaf();
         Page aPage = new Page();
         Pancake aPancake = new Pancake();
         Animal aAnimal = new Animal();
         Matter aMatter = new Matter();

         aLeaf.turn();
         aPage.turn();
         aPancake.turn();
         aAnimal.turn();
         aMatter.turn();
      }
}