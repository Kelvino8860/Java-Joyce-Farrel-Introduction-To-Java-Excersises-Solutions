/* 1. In Chapter 10, you created an Alien class as well as two descendant classes, Martian
      and Jupiterian. Because you never create any “plain” Alien objects, alter the Alien
      class so it is abstract. Verify that the Martian and Jupiterian classes can still inherit
      from Alien and that the CreateAliens program still works correctly. Save the
      altered Alien file as Alien.java.*/

public class CreateAliens
{
   public static void main(String[] args)
       {
          Martian objOne = new Martian();
          Jupiterian objTwo = new Jupiterian();

          System.out.println(objOne.toString());
          System.out.println(objTwo.toString());   
       }
}