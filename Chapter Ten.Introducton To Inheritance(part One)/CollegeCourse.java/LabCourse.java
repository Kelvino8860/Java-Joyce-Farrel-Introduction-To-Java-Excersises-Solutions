public class LabCourse extends CollegeCourse
{   
    private double newFees;
    private final int LAB_FEES = 50;

    public LabCourse(String depertment, int course, int credit)
     {
         super(depertment, course, credit); 
         newFees = fees + LAB_FEES;  
     }

    @Override
    public void display()
      {
          System.out.println("\nTHIS COURSE IS A LAB COURSE" + "\nDepartment: " + depertment.toUpperCase() + "\nCourse Number: " +
               courseNum + "\nCredits: " + creditHours + "\nFees: " + newFees);
      }
}