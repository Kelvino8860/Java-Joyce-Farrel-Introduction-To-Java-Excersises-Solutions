
import java.util.ArrayList;
public class DinnerEvent extends Event
{
    private int entree;
    private ArrayList<Employee> employee = new ArrayList<Employee>(15);
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

    public void employee(Employee obj)
       {
          employee.add(obj);
       }

    public String getMenu()
       {
          return "\nEvent number >> " + super.getEventNumber() + 
                 "\nPhone Number >> " + super.getPhoneNumber() +
                 "\nEvent type >> " + super.getEventsNames() +
                 "\nNumber of guests >> " + super.getGuest() + 
                 "\nPrice per guest >> " + super.getPricePerGuest() +
                 "\nTotal price >> " + super.getPrice() + 
                 "\nEvent is large >> " + super.isLargeEvent() +
                 "\n\nMENU CHOICE" +
                 "\n_______________" +
                 "\nEntre`e >> " + entereeArray[entree - 1] +
                 "\nSide Dish >> " + sideDishArray[sideDishOne - 1] +
                 "\nSid Dish >> " + sideDishArray[sideDishTwo - 1] +
                 "\nDessert >> " + dessertArray[dessert - 1];
                  
       }

   public void displayEmployee()
      {
          System.out.println("\nEMPLOYEES DATA");
          System.out.println("_____________________");
          for(int i = 0; i < employee.size(); ++i)
            {
              System.out.println("\nEmployee's ID number: " + employee.get(i).getEmployeesId()+
                 "\nEmployee's last name: " + employee.get(i).getLastName() +
                 "\nEmployee's first name: " + employee.get(i).getFirstName() +
                 "\nEmployee's pay rate: $" + employee.get(i).getPayRate() + " per hour." +
                 "\nEmployee's job title: " + employee.get(i).getJobTitle());
            }
      }
}









