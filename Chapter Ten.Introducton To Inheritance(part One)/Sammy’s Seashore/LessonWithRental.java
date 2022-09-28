public class LessonWithRental extends Rental
{
    private boolean lessonRequired;
    private final String[] namesArray = {"Mr.John", "Miss.Linda", "Mr.Helmer", "Sir.Jimmy", "Madam.Octane",
                                        "Sir.Alex", "Miss.June", "Mr.Wise"};

    public LessonWithRental(String eventNum, int minutes, int equipments)
      {
         super(eventNum,minutes);  
         super.setEquipmentTypes(equipments);   

         if(super.getEquipmentTypes() == 0 || super.getEquipmentTypes() == 1)
                {
                   lessonRequired = true;
                }
         else
           {
              lessonRequired = false;
           }
      }

    public String getInstructor()
      {
           return "\nContract Number: " + super.getContractNumber() +
                  "\nEquipment: " + super.getEquipmentName() +
                  "\nPhone Number: " + super.getPhoneNumber() +
                  "\nHours: " + super.getNumberHours() +
                  "\nMinutes: " + super.getNumberRemMinutes() +
                  "\nHourly Rate: " + HOURLY_RENTAL_PAY +
                  "\nTotal Price: " + super.getPrice() + 
                  "\nName of Instructor: " + namesArray[super.getEquipmentTypes()] +
                  "\nLesson Required: " + lessonRequired + "\n";
      }
}