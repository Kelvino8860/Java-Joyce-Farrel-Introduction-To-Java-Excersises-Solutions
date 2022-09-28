public class CollegeCourse
{
   protected String depertment;
   protected int courseNum;
   protected int creditHours;
   protected double fees;
   protected final int PAY_RATE = 120;

   public CollegeCourse(String depertment, int courseNum, int creditHours)
      {
         this.depertment = depertment;
         this.courseNum = courseNum;
         this.creditHours = creditHours;
         fees = creditHours * PAY_RATE;
      }
 
   public void display()
      {
         System.out.println("\nDepartment: " + depertment.toUpperCase() + "\nCourse Number: " +
               courseNum + "\nCredits: " + creditHours + "\nFees: " + fees);
      }
}