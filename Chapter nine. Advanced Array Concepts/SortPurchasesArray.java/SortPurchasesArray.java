/* 7. In the exercises in Chapter 6, you created a class named Purchase. Each Purchase
      contains an invoice number, amount of sale, amount of sales tax, and several
      methods. Add get methods for the invoice number and sale amount fields so their
      values can be used in comparisons. Next, write a program that declares an array of
      five Purchase objects and prompt a user for their values. Then, in a loop that
      continues until a user inputs a sentinel value, ask the user whether the Purchase
      objects should be sorted and displayed in invoice number order or sale amount order.
      Save the file as SortPurchasesArray.java*/

import java.util.Scanner;
public class SortPurchasesArray{
      public static void main(String[]  args){
              
              Purchase[] objArray = new Purchase[5];
              int invoiceNumber, salesAmount;
              Scanner input = new Scanner(System.in);
              
                 for(int i = 0; i < objArray.length; i++){
                      objArray[i] = new Purchase();
                      System.out.print("Enter invoice number >> ");
                      invoiceNumber = input.nextInt();
                      System.out.print("Enter sales amount >> ");
                      salesAmount = input.nextInt();
                      objArray[i].setInvoiceNum(invoiceNumber);
                      objArray[i].setSalesAmount(salesAmount);
                      System.out.println();
                   }
                      
                    int choice;

                do{
                     System.out.print("1.Sort object using invoice number \n2.Sort objects using sale amount \n3.Quit \nEnter your choice >> ");
                     choice = input.nextInt();
                     System.out.println();

                      if(choice == 1){
                              
                              for(int i = 0; i < objArray.length; i++){
                                    for(int j = 0; j < objArray.length - 1; j++){
                                         if(objArray[j].getInvoiceNum() > objArray[j + 1].getInvoiceNum()){
                                                     Purchase temp = objArray[j];
                                                     objArray[j] = objArray[j + 1];
                                                     objArray[j + 1] = temp;
                                                  }
                                      }
                                  
                                  }
 
                                    for(int k = 0; k < objArray.length; k++)
                                       objArray[k].display(objArray[k]);
                           }

                      if(choice == 2){

                                for(int i = 0; i < objArray.length; i++){
                                    for(int j = 0; j < objArray.length - 1; j++){
                                         if(objArray[j].getSalesAmount() > objArray[j + 1].getSalesAmount()){
                                                     Purchase temp = objArray[j];
                                                     objArray[j] = objArray[j + 1];
                                                     objArray[j + 1] = temp;
                                                  }
                                      }
                                  }

                                      for(int k = 0; k < objArray.length; k++)
                                       objArray[k].display(objArray[k]);
                          }

                     if(choice == 3){

                             break;
                          }

                  }while(choice != 3);
           }
}