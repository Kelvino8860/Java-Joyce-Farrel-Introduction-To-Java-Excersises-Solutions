public class PetSold extends ItemSold
{
    private boolean vaccinated;
    private boolean neutered;
    private boolean housebroken;

    public boolean getVaccinated()
       {
          return vaccinated;
       }
    public boolean getNeutered()
       {
          return neutered;
       }
    public boolean getHouseBroken()
       {
          return housebroken;
       }

    public void setVaccinated(boolean vaccine)
       {
          vaccinated = vaccine;
       }
    public void setNeutered(boolean neut)
       {
          neutered = neut;
       }
    public void setHouseBroken(boolean house)
       {
          housebroken = house;
       }
   
   @Override
   public void display()
     {
        super.display();
        System.out.println("Pet Vaccinated: " + getVaccinated() +
                "\nPet Neutered: " + getNeutered() + 
                "\nPet Housebroken: " + getHouseBroken());
     }
}