public class DinnerEvent extends Event
{
    private int entree;
    private int sideDishOne;
    private int sideDishTwo;
    private int dessert;
    private final String[] entereeArray = {"Butter Chicken", "Grilled Chicken", "Palak Paneer", "Rogan Josh"};
    private final String[] sideDishArray = {"Cabbage", "Baked Beans", "Brocoli", "Baked Potatoes"};
    private final String[] dessertArray = {"Cookies", "Biscuits", "Pastries", "Puddings"};

    public DinnerEvent(String eventNum, int numGuest, int entrees, int sideDishOne, int sideDishTwo, int desserts)
       {
           super(eventNum, numGuest);
           this.entree = entrees;
           this.sideDishOne = sideDishOne;
           this.sideDishTwo = sideDishTwo;
           this.dessert = desserts;
       }

    public String getMenu()
       {
          return "\nEvent number >> " + super.getEventNumber() + 
                 "\nEvent Type >> " + super.getEventsNames() + 
                 "\nPhone Number >> " + super.getPhoneNumber() +
                 "\nNumber of guests >> " + super.getGuest() + 
                 "\nPrice per guest >> " + super.getPricePerGuest() +
                 "\nTotal price >> " + super.getPrice() + 
                 "\nEvent is large >> " + super.isLargeEvent() +
                 "\nMENU CHOICE" +
                 "\nEntre`e >> " + entereeArray[entree - 1] +
                 "\nSide Dish >> " + sideDishArray[sideDishOne - 1] +
                 "\nSid Dish >> " + sideDishArray[sideDishTwo - 1] +
                 "\nDessert >> " + dessertArray[dessert - 1];
                  
       }
}