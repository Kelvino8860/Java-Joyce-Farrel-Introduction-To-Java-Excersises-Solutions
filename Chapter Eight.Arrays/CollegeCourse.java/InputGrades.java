import java.util.Scanner;
public class InputGrades{
     public static void main(String[] args){
              Students[] studentsArray = new Students[10];
              CollegeCourse courseObj = new CollegeCourse();

              Scanner input = new Scanner(System.in);
              Scanner inputString = new Scanner(System.in);
              int studId, posStud = 1, cosNum = 1, courseCreditHours;
              String courseId;
              char courseGrade;   boolean verifyGrade = false;
              

                 for(int i = 0; i < studentsArray.length; i++){
                        studentsArray[i] = new Students();
                       System.out.print("Enter ID(integer) for student #" + posStud + " >>> ");
                         studId = input.nextInt();
                         studentsArray[i].setStudId(studId);

                           for(int j = 0; j < 5; j++){
                              System.out.print("Enter course ID(string) #" + cosNum + " >>> ");
                               courseId = inputString.nextLine();
                              courseObj.setCourseId(courseId);

                           //VERIFY GRADE
                               do{  
                                    System.out.print("Enter course grade >>> ");
                                    courseGrade = inputString.nextLine().charAt(0);
                                        if(courseGrade == 'A' || courseGrade == 'B' || courseGrade == 'C' ||
                                           courseGrade == 'D' || courseGrade == 'F'){

                                                  courseObj.setGrade(courseGrade);
                                                  verifyGrade = true;
                                           }

                                  }while(!verifyGrade);
                               
                              System.out.print("Enter course credit hours >>> ");
                                 courseCreditHours = input.nextInt();
                                courseObj.setCreditHours(courseCreditHours); 
                              System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
                                verifyGrade = false;
                                cosNum++;
                            }
                       System.out.println("____________________________________________________________________________________________________________");                           
                         cosNum = 1;  
                         posStud++;
                  }
        }
}