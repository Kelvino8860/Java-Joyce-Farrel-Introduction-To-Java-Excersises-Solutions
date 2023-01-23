/*9. a. Create an application that uses a graphic interface to capture employee data and
        writes that data to a random access output file. The data required for each
        employee includes an employee ID number from 1 through 99 inclusive, the first
        and last names of the employee, and the employee’s hourly pay rate. Allow the
        user to enter data one record at a time and to click a button to save each record.
        Save the class as CreateRandomEmployeeFile.java.
     b. Create an application that allows the user to enter an employee ID number.
        When the user clicks a button, display all the stored data for the employee. Save
        the file as ReadRandomEmployeeFile.java */


import javax.lang.model.util.ElementScanner14;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.*;

public class employeeGUI extends JFrame implements ActionListener
{
    private String idNum;
    private String idDisplay;
    private String firstName;
    private String lastName;
    private String payRate;
    private writeData wrD = new writeData();
    private readFile reD = new readFile();

    private JPanel panel1 = new JPanel(new GridLayout(5,2));
    private JLabel idLabel = new JLabel("Enter ID number: ");
    private JTextField idField = new JTextField(5);
    private JLabel firstNameLabel = new JLabel("Enter First Name: ");
    private JTextField firstNameField = new JTextField(15);
    private JLabel LastNameLabel = new JLabel("Enter Last Name: ");
    private JTextField LastNameField = new JTextField(15);
    private JLabel payRateLabel = new JLabel("Enter Pay Rate: ");
    private JTextField payRateField = new JTextField(15);
    private JButton submit = new JButton("SUBMIT");

    private JPanel panel2 = new JPanel(new GridLayout(2,1));
    private JLabel idNumLabel = new JLabel("Enter ID Number: ");
    private JTextField idNumField = new JTextField(5);
    private JButton display = new JButton("DISPLAY");

    private JPanel panel3 = new JPanel();
    private JTextArea displayArea = new JTextArea();

    private Container con = getContentPane();

    private String[] array;
    private JButton next = new JButton("NEXT");
    private JButton clear = new JButton("CLEAR");
    private JButton displayNext = new JButton("NEXT");

    public employeeGUI()
    {
        setTitle("Employee Data");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2,5,5));
        con.setBackground(Color.PINK);
        panel1.setBackground(Color.CYAN);
        panel3.setBackground(Color.CYAN);
        panel2.setBackground(Color.CYAN);

        con.add(panel1);
        panel1.add(idLabel);
        panel1.add(idField);
        panel1.add(firstNameLabel);
        panel1.add(firstNameField);
        panel1.add(LastNameLabel);
        panel1.add(LastNameField);
        panel1.add(payRateLabel);
        panel1.add(payRateField);
        panel1.add(submit);
        panel1.add(next);

        con.add(panel3);
        panel3.add(displayArea);
        panel3.add(clear);

        con.add(panel2);
        panel2.add(idNumLabel);
        panel2.add(idNumField);
        panel2.add(display);
        panel2.add(displayNext);

        submit.addActionListener(this);
        display.addActionListener(this);
        next.addActionListener(this);
        clear.addActionListener(this);
        displayNext.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();

        if(source == submit)
        {
            idNum = idField.getText();
            firstName = firstNameField.getText();
            lastName = LastNameField.getText();
            payRate = payRateField.getText();
            double rate = Double.parseDouble(payRate);
           
            try
            {
                wrD.setIdNum(idNum);
                wrD.setName(firstName, lastName);
                wrD.setPayRate(rate);
                wrD.writeFile();
            }
            catch(IdNumException error)
            {
                JOptionPane.showMessageDialog(null, error);
            }
            
        }
        else
        if(source == next)
        {
            idField.setText("");
            firstNameField.setText("");
            LastNameField.setText("");
            payRateField.setText("");
        }
        else
        if(source == display)
        {
            idDisplay = idNumField.getText();

            reD.setStringId(idDisplay);
            reD.reading();
            array = reD.getData();

            displayArea.append(array[0] + "   " + array[1] + "   " + array[2] + "   " + array[3]);
        }
        else
        if(source == clear)
        {
            displayArea.setText("");
        }
        else
        if(source == displayNext)
        {
            idNumField.setText("");
        }
    }

    public static void main(String[] args)
        {
            employeeGUI aFrame = new employeeGUI();
            aFrame.setBounds(300,300,400,400);
            aFrame.setVisible(true);
        }
    }
