public class DinnerPartyWithConstructor extends PartyWithConstructor
{
    private int dinnerChoice;

    public int getDinnerChoice()
      {
          return dinnerChoice;
      }
    public void setDinnerChoice(int choice)
      {
         dinnerChoice = choice;
      }
   
    @Override
    public void displayInvitation()
      {
        System.out.println("Welcome to my dinner party!");
      }
}