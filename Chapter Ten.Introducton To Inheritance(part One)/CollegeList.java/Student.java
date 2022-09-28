public class Student extends Person
{
    private String fieldOfStudy;
    private double averageGradePoints;

    public String getFieldOfStudy()
       {
          return fieldOfStudy;
       }
    public double getAverageGradePoints()
       {
          return averageGradePoints;
       }

    public void setFieldOfStudy(String field)
       {
          fieldOfStudy = field;
       }
    public void setAverageGradePoints(double grade)
       {
          averageGradePoints = grade;
       }

    @Override
    public void display()
       {
           System.out.println("\nFirst Name: " + super.getFirstName() + "\nLast Name: " + super.getLastName() +
              "\nStreet Address: " + super.getStreetAddress() + "\nZip Code: " + super.getZipCode() + 
              "\nPhone Number: " + super.getPhoneNumber() + "\nField Of Study: " + getFieldOfStudy() +
              "\nAverage Grade Points: " + getAverageGradePoints());
       }
}