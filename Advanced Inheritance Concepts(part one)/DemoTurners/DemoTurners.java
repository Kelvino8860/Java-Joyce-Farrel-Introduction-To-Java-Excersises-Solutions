/* 9. a. Create an interface named Turner, with a single method named turn(). Create
         a class named Leaf that implements turn() to display “Changing colors”. Create
         a class named Page that implements turn() to display “Going to the next page”.
         Create a class named Pancake that implements turn() to display “Flipping”. Write
         an application named DemoTurners that creates one object of each of these class
         types and demonstrates the turn() method for each class. Save the files as
         Turner.java, Leaf.java, Page.java, Pancake.java, and DemoTurners.java*/

public class DemoTurners
{
   public static void main(String[] args)
      {
         Leaf aLeaf = new Leaf();
         Page aPage = new Page();
         Pancake aPancake = new Pancake();

         aLeaf.turn();
         aPage.turn();
         aPancake.turn();
      }
}