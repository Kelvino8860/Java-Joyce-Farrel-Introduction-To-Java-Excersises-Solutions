/*7. a. Create a CollegeCourse class. The class contains fields for the course ID (for
        example, “CIS 210”), credit hours (for example, 3), and a letter grade (for example, ‘A’).
        Include get and set methods for each field. Create a Student class containing an ID
        number and an array of five CollegeCourse objects. Create a get and set method
        for the Student ID number. Also create a get method that returns one of the
        Student’s CollegeCourses; the method takes an integer argument and returns
        the CollegeCourse in that position (0 through 4). Next, create a set method that
        sets the value of one of the Student’s CollegeCourses; the method takes two
        arguments—a CollegeCourse and an integer representing the CollegeCourse’s
        position (0 through 4). Save the files as CollegeCourse.java and Student.java.
     b. Write an application that prompts a professor to enter grades for five different
        courses each for 10 students. Prompt the professor to enter data for one student at
        a time, including student ID and course data for five courses. Use prompts
        containing the number of the student whose data is being entered and the course
        number—for example, “Enter ID for student #s”, where s is an integer from 1
        through 10, indicating the student, and “Enter course ID #n”, where n is an integer
        from 1 through 5, indicating the course number. Verify that the professor enters
        only A, B, C, D, or F for the grade value for each course. Save the file as
        InputGrades.java*/

public class CollegeCourse{
       private String courseId;
       private int creditHours;
       private char grade;

   public CollegeCourse(){
      
     }

  public String getCourseId(){
       return courseId;
     }
  public void setCourseId(String courseId){
       this.courseId = courseId;
     }

  public int getCreditHours(){
        return creditHours;
     }
  public void setCreditHours(int creditHours){
        this.creditHours = creditHours;
     }

  public char getGrade(){
        return grade;
     }
  public void setGrade(char grade){
        this.grade = grade;
     }
}