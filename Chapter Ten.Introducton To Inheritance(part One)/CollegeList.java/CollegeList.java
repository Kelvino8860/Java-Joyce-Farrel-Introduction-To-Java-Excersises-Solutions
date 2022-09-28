/* 10. Develop a set of classes for a college to use in various student service and personnel
       applications. Classes you need to design include the following:

       Person—A Person contains a first name, last name, street address, zip code, and
              phone number. The class also includes a method that sets each data field, using a
              series of dialog boxes and a display method that displays all of a Person’s
              information on a single line at the command line on the screen
       CollegeEmployee—CollegeEmployee descends from Person. A CollegeEmployee
             also includes a Social Security number, an annual salary, and a department name,
             as well as methods that override the Person methods to accept and display all
             CollegeEmployee data.
      Faculty—Faculty descends from CollegeEmployee. This class also includes a
             Boolean field that indicates whether the Faculty member is tenured, as well as
             methods that override the CollegeEmployee methods to accept and display this
             additional piece of information.
             Student—Student descends from Person. In addition to the fields available in
             Person, a Student contains a major field of study and a grade point average as
             well as methods that override the Person methods to accept and display these
             additional facts.
      Write an application named CollegeList that declares an array of four “regular”
      CollegeEmployees, three Faculty, and seven Students. Prompt the user to specify
      which type of person’s data will be entered (C, F, or S), or allow the user to quit (Q).
      While the user chooses to continue (that is, does not quit), accept data entry for the
      appropriate type of Person. If the user attempts to enter data for more than four
      CollegeEmployees, three Faculty, or seven Students, display an error message.
      When the user quits, display a report on the screen listing each group of Persons
      under the appropriate heading of “College Employees,” “Faculty,” or “Students.” If
      the user has not entered data for one or more types of Persons during a session,
      display an appropriate message under the appropriate heading.
      Save the files as Person.java, CollegeEmployee.java, Faculty.java, Student.java,
      and CollegeList.java.                                  
          */


import java.util.*;
import javax.swing.JOptionPane;

public class CollegeList
{
    public static void main(String[] args)
          {
               ArrayList<CollegeEmployee> objOne = new ArrayList<CollegeEmployee>(4);
               ArrayList<Faculty> objTwo = new ArrayList<Faculty>(3);
               ArrayList<Student> objThree = new ArrayList<Student>(7);
               
               String choice, firstName, lastName, streetAddress, zipNum, phone, quit;
               int zipCode;
               long phoneNumber;
 
              do{
                  choice = JOptionPane.showInputDialog(null, "Specify which type of person's data will be entered:" +
                      "\nEnter(C) for College Employee \nEnter(F) for Faculty \nEnter(S) for Student" +
                      "\nEnter(Q) to Quit \nEnter choice >> ").toUpperCase();
                   
                  char ch = choice.charAt(0); 

                     
                    if(ch == 'Q')
                      break;

                   //Input all College Employee information
                    else if(ch == 'C')
                        {  
                                
                            do{
                                  //if user tries to add another object display error message 
                                  //and display the rest of the information of all the objects
                                  //break the do...while loop
                                    if(objOne.size() == 4)
                                       {
                                          System.out.println("\nSORRY!!! THE COLLEGE EMPLOYEE DATABASE IS FULL.");
                                          break;
                                       }

                                  JOptionPane.showMessageDialog(null, "Enter data of College Employees");
                             
                                  String socialSecurityNum;
                                  String salaryAmount;
                                  String depertment;
                                  long socialNum;
                                  double salary;
                
                              //Input all the required information
                                 CollegeEmployee obj = new CollegeEmployee();
                                 firstName = JOptionPane.showInputDialog(null, "Enter First Name");
                                 lastName = JOptionPane.showInputDialog(null, "Enter Last Name");
                                 streetAddress = JOptionPane.showInputDialog(null, "Enter Street Address");
                                 zipNum = JOptionPane.showInputDialog(null, "Enter Zip Code");
                                 zipCode = Integer.parseInt(zipNum);
                                 phone = JOptionPane.showInputDialog(null, "Enter Phone Number");
                                 phoneNumber = Long.parseLong(phone);

                                 socialSecurityNum = JOptionPane.showInputDialog(null, "Enter Social Security Number");
                                 socialNum = Long.parseLong(socialSecurityNum);
                                 salaryAmount = JOptionPane.showInputDialog(null, "Enter Annual Salary");
                                 salary = Double.parseDouble(salaryAmount);
                                 depertment = JOptionPane.showInputDialog(null, "Enter Department Name");                                

                                 obj.setFirstName(firstName);
                                 obj.setLastName(lastName);
                                 obj.setStreetAddress(streetAddress);
                                 obj.setZipCode(zipCode);
                                 obj.setPhoneNumber(phoneNumber);
                                 obj.setSocialSecurityNum(socialNum);
                                 obj.setAnnualSalary(salary);
                                 obj.setDepartmentName(depertment);
                                 objOne.add(obj);
                              
                             //If user quits display all the infor of the objects
                                 quit = JOptionPane.showInputDialog(null, "Do you wish to continue entering data? \nEnter 'Yes' to continue entering College Employee data" +
                                              "\nEnter 'No' to quit entering College Employee data");

                                  if(quit.equalsIgnoreCase("No"))
                                      {
                                         break;
                                      }

                             }while(true);

        
                      }

                   //Input all faculty information
                    else if(ch == 'F')
                       {
                            do{
                                  
                                    if(objTwo.size() == 3)
                                       {
                                          System.out.println("\nSORRY!!! THE FACULTY DATABASE IS FULL.");
                                          break;
                                       }

                                  JOptionPane.showMessageDialog(null, "Enter data for Faculty");
                             
                                  String socialSecurityNum;
                                  String salaryAmount;
                                  String depertment,tenuredEmployee;
                                  long socialNum;
                                  double salary;
                                  boolean tenured;
                
                                 Faculty obj = new Faculty();
                                 firstName = JOptionPane.showInputDialog(null, "Enter First Name");
                                 lastName = JOptionPane.showInputDialog(null, "Enter Last Name");
                                 streetAddress = JOptionPane.showInputDialog(null, "Enter Street Address");
                                 zipNum = JOptionPane.showInputDialog(null, "Enter Zip Code");
                                 zipCode = Integer.parseInt(zipNum);
                                 phone = JOptionPane.showInputDialog(null, "Enter Phone Number");
                                 phoneNumber = Long.parseLong(phone);

                                 socialSecurityNum = JOptionPane.showInputDialog(null, "Enter Social Security Number");
                                 socialNum = Long.parseLong(socialSecurityNum);
                                 salaryAmount = JOptionPane.showInputDialog(null, "Enter Annual Salary");
                                 salary = Double.parseDouble(salaryAmount);
                                 depertment = JOptionPane.showInputDialog(null, "Enter Department Name");
                                 tenuredEmployee = JOptionPane.showInputDialog(null, "Enter (true) if employed is tenured or (false) if otherwise");  
                                 tenured = Boolean.parseBoolean(tenuredEmployee);                              

                                 obj.setFirstName(firstName);
                                 obj.setLastName(lastName);
                                 obj.setStreetAddress(streetAddress);
                                 obj.setZipCode(zipCode);
                                 obj.setPhoneNumber(phoneNumber);
                                 obj.setSocialSecurityNum(socialNum);
                                 obj.setAnnualSalary(salary);
                                 obj.setDepartmentName(depertment);
                                 obj.setTenured(tenured);
                                 objTwo.add(obj);
                              
                                 quit = JOptionPane.showInputDialog(null, "Do you wish to continue entering data? \nEnter 'Yes' to continue entering Faculty data" +
                                              "\nEnter 'No' to quit entering Faculty data");

                                  if(quit.equalsIgnoreCase("No"))
                                      {
                                         break;
                                      }
                              }while(true);
                       }


                  //Input all Student information
                    else if(ch == 'S')
                       {
                           do{
                                   if(objThree.size() == 3)
                                       {
                                          System.out.println("\nSORRY!!! THE STUDENT DATABASE IS FULL.");
                                          break;
                                       }

                                  JOptionPane.showMessageDialog(null, "Enter data for Student");
                             
                                  String fieldOfStudy, grade;
                                  double averageGrade;
                
                                 Student obj = new Student();
                                 firstName = JOptionPane.showInputDialog(null, "Enter First Name");
                                 lastName = JOptionPane.showInputDialog(null, "Enter Last Name");
                                 streetAddress = JOptionPane.showInputDialog(null, "Enter Street Address");
                                 zipNum = JOptionPane.showInputDialog(null, "Enter Zip Code");
                                 zipCode = Integer.parseInt(zipNum);
                                 phone = JOptionPane.showInputDialog(null, "Enter Phone Number");
                                 phoneNumber = Long.parseLong(phone);

                                 fieldOfStudy = JOptionPane.showInputDialog(null, "Enter Field of Study");
                                 grade = JOptionPane.showInputDialog(null, "Enter Average Grade");
                                 averageGrade = Double.parseDouble(grade);

                                 obj.setFirstName(firstName);
                                 obj.setLastName(lastName);
                                 obj.setStreetAddress(streetAddress);
                                 obj.setZipCode(zipCode);
                                 obj.setPhoneNumber(phoneNumber);
                                 obj.setFieldOfStudy(fieldOfStudy);
                                 obj.setAverageGradePoints(averageGrade);
                                 objThree.add(obj);

                                 quit = JOptionPane.showInputDialog(null, "Do you wish to continue entering data? \nEnter 'Yes' to continue entering Student data" +
                                              "\nEnter 'No' to quit entering Student data");

                                  if(quit.equalsIgnoreCase("No"))
                                      {
                                         break;
                                      }
                                     
                             }while(true);
                       }

                }while(true);

               

                                  if(objOne.size() > 0)
                                     {
                                         System.out.println("\nCOLLEGE EMPLOYEE");
                                         System.out.println("______________________");
                                            for(int i = 0; i < objOne.size(); ++i)
                                                {
                                                   objOne.get(i).display();
                                                }
                                      }
                                   else
                                     {
                                         System.out.println("\nCOLLEGE EMPLOYEE");
                                         System.out.println("______________________");
                                         System.out.println("SORRY!!! THE DATABASE IS EMPTY");
                                     }

                                    
                                    if(objTwo.size() > 0)
                                     {
                                         System.out.println("\nFACULTY");
                                         System.out.println("______________________");
                                            for(int i = 0; i < objTwo.size(); ++i)
                                                {
                                                   objTwo.get(i).display();
                                                }
                                      }
                                   else
                                     {
                                         System.out.println("\nFACULTY");
                                         System.out.println("______________________");
                                         System.out.println("SORRY!!! THE DATABASE IS EMPTY");
                                     }

                                    if(objThree.size() > 0)
                                     {
                                         System.out.println("\nSTUDENT");
                                         System.out.println("______________________");
                                            for(int i = 0; i < objThree.size(); ++i)
                                                {
                                                   objThree.get(i).display();
                                                }
                                      }
                                   else
                                     {
                                         System.out.println("\nSTUDENT");
                                         System.out.println("______________________");
                                         System.out.println("SORRY!!! THE DATABASE IS EMPTY");
                                     }

          }
}



















