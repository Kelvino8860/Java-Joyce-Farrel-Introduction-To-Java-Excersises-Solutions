/* 3. Create an ItemSold class for Francis Pet Supply. Fields include an invoice
      number, description, and price. Create get and set methods for each field.
      Create a subclass named PetSold that descends from ItemSold and includes
      three Boolean fields that indicate whether the pet has been vaccinated, neutered,
      and housebroken, and include get and set methods for these fields. Write an
      application that creates two objects of each class, and demonstrate that all the
      methods work correctly. Save the files as ItemSold.java, PetSold.java, and
      DemoItemsAndPets.java*/

public class DemoItemsAndPets
{
    public static void main(String[] args)
       {
          ItemSold obj1 = new ItemSold();
          ItemSold obj2 = new ItemSold();

          obj1.setInvoiceNumber("QW8860");
          obj1.setDescription("Puppy");
          obj1.setPrice(100);
          obj1.display();
          
          obj2.setInvoiceNumber("FG4356");
          obj2.setDescription("Cat");
          obj2.setPrice(90);
          obj2.display();

          PetSold obj3 = new PetSold();
          PetSold obj4 = new PetSold();

          obj3.setInvoiceNumber("Y890");
          obj3.setDescription("Rabbit");
          obj3.setPrice(78);
          obj3.setVaccinated(false);
          obj3.setNeutered(false);
          obj3.setHouseBroken(false);
          obj3.display();
         
          obj4.setInvoiceNumber("THC89");
          obj4.setDescription("BULL-DOG");
          obj4.setPrice(400);
          obj4.setVaccinated(true);
          obj4.setNeutered(true);
          obj4.setHouseBroken(true);
          obj4.display();
       }
}












