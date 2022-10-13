/* 3. Create an abstract NewspaperSubscription class with fields for the subscriber
      name, address, and rate. Include get and set methods for the name field and get
      methods for the address and subscription rate; the setAddress() method is
      abstract. Create two subclasses named PhysicalNewspaperSubscription and
      OnlineNewspaperSubscription. The parameter for the setAddress() method of the
      PhysicalNewspaperSubscription class must contain at least one digit; otherwise, an
      error message is displayed and the subscription rate is set to 0. If the address is
      valid, the subscription rate is assigned $15. The parameter for the setAddress()
      method of the OnlineNewspaperSubscription class must contain an at sign (@) or
      an error message is displayed. If the address is valid, the subscription rate is assigned
      $9. Finally, write an application that declares several objects of both subscription
      subtypes and displays their data fields. Save the files as NewspaperSubscription.java,
      PhysicalNewspaperSubscription.java, OnlineNewspaperSubscription.java,
      and DemoSubscriptions.java.*/

import javax.swing.*;

public class DemoSubscriptions
{

 public static void main(String[] args)
  {
    NewspaperSubscription[] obj = new NewspaperSubscription[5];

    String entry;
    int input;

    for(int i = 0; i < obj.length; ++i)
       {
          entry = JOptionPane.showInputDialog(null, "Choose a Newspaper Subscription" +
                    "\n1.Physical Newspaper Subscription \n2.Online Newspaper Subscription");
          input = Integer.parseInt(entry);

           if(input == 1)
             {
                obj[i] = new PhysicalNewspaperSubscription();
                entry = JOptionPane.showInputDialog(null, "Enter Subscriber's name");
                obj[i].setName(entry);
                entry = JOptionPane.showInputDialog(null, "Enter Subscriber's Address" +
                          "\nAddress should have atleast one digit.");
                obj[i].setAddress(entry);
             }
           else if(input == 2)
             {
                obj[i] = new OnlineNewspaperSubscription();
                entry = JOptionPane.showInputDialog(null, "Enter Subscriber's name");
                obj[i].setName(entry);
                entry = JOptionPane.showInputDialog(null, "Enter Subscriber's Address" +
                          "\nAddress should have a (@) sign");
                obj[i].setAddress(entry);
             }
       }

      for(int i = 0; i < obj.length; ++i)
        {
           display(obj[i]);
        }
  }

 public static void display(NewspaperSubscription obj)
     {
         System.out.println("\nSubscriber's Name: " + obj.getName() +
                            "\nSubscriber's Address: " + obj.getAddress() +
                            "\nRates: $" + obj.getRate());
     }
}













