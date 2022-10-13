/* 8. Create an abstract Student class for Parker University. The class contains fields for
      student ID number, last name, and annual tuition. Include a constructor that requires
      parameters for the ID number and name. Include get and set methods for each field;
      the setTuition() method is abstract. Create three Student subclasses named
      UndergraduateStudent, GraduateStudent, and StudentAtLarge, each with a
      unique setTuition() method. Tuition for an UndergraduateStudent is $4,000 per
      semester, tuition for a GraduateStudent is $6,000 per semester, and tuition for a
      StudentAtLarge is $2,000 per semester. Write an application that creates an array
      of at least six objects to demonstrate how the methods work for objects for each
      Student type. Save the files as Student.java, UndergraduateStudent.java,
      GraduateStudent.java, StudentAtLarge.java, and StudentDemo.java*/


import javax.swing.*;

public class StudentDemo
{
     public static void main(String[] args)
        {
           Student[] objArray = new Student[6];
           
           String entry,name;
           long input;
           int i;

           for(i = 0; i < objArray.length; ++i)
             {
                 if(i < 2)
                  {
                     entry = JOptionPane.showInputDialog(null, "Enter ID Number of an Undergraduate Student");
                     input = Long.parseLong(entry);
                     name = JOptionPane.showInputDialog(null, "Enter last name");
                     objArray[i] = new UndergraduateStudent(input, name);
                  }
                 else if(i > 1 && i < 4)
                  {
                     entry = JOptionPane.showInputDialog(null, "Enter ID Number of a Graduate Student");
                     input = Long.parseLong(entry);
                     name = JOptionPane.showInputDialog(null, "Enter last name");
                     objArray[i] = new GraduateStudent(input, name);
                  }
                 else if(i > 3)
                  {
                     entry = JOptionPane.showInputDialog(null, "Enter ID Number of a Student at Large");
                     input = Long.parseLong(entry);
                     name = JOptionPane.showInputDialog(null, "Enter last name");
                     objArray[i] = new StudentAtLarge(input, name);
                  }
             }

           display(objArray);
        }

    public static void display(Student[] obj)
       {
           int j;
           for(j = 0; j < obj.length; ++j)
             {
                System.out.println("\nID NUMBER: " + obj[j].getIdNum() +
                                   "\nLAST NAME: " + obj[j].getLastName() +
                                   "\nANNUAL TUITION: $" + obj[j].getTuition());
             }
       }
}












