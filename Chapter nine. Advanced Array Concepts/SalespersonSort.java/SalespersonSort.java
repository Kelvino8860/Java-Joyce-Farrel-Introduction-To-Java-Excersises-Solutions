/* 4. In Chapter 8, you created a Salesperson class with fields for an ID number and
      sales values. Now, create an application that allows a user to enter values for an
      array of seven Salesperson objects. Offer the user the choice of displaying the
      objects in order by either ID number or sales value. Save the application as
      SalespersonSort.java*/

import java.util.Scanner;

public class SalespersonSort{
     public static void main(String[] args){
            
         //Initialize an array of seven objects
             SalesPerson[] arrayObj = new SalesPerson[7];
             Scanner input = new Scanner(System.in);
             int idNum;
             double sales;
         
        //Prompt user to provide data for each object data field
             for(int i = 0; i < arrayObj.length; ++i){
                   
                   System.out.print("Enter your ID number >> ");
                   idNum = input.nextInt();
                   System.out.print("Enter your annual sales >> ");
                   sales = input.nextDouble();

                   arrayObj[i] = new SalesPerson(idNum, sales);

                   System.out.println();//spacing
                }

          //Display the objects in order of your will
             System.out.println("Display objects in order by either ID number or sales value");
             int choice;

             do{
                  System.out.print("\n1.ID number \n2.Annual Sales \nEnter an integer >> ");
                  choice = input.nextInt();
                  
                 //use the bubble sort technique
                    if(choice > 0 && choice < 3){
                          for(int i = 0; i < arrayObj.length; ++i){
                                 for(int j = 0; j < arrayObj.length - 1; ++j){
                                      
                                       if(choice == 1){
                                            if(arrayObj[j].getIdNum() > arrayObj[j + 1].getIdNum()){
                                                  SalesPerson temp = arrayObj[j];
                                                  arrayObj[j] = arrayObj[j + 1];
                                                  arrayObj[j + 1] = temp;
                                                }
                                         }

                                        if(choice == 2){
                                              if(arrayObj[j].getAnnualSales() > arrayObj[j + 1].getAnnualSales()){
                                                  SalesPerson temp = arrayObj[j];
                                                  arrayObj[j] = arrayObj[j + 1];
                                                  arrayObj[j + 1] = temp;
                                                }
                                           }
                                    }
                              }
                      }

                }while(choice < 1 || choice > 2);

           display(arrayObj);
        }

   /*Display objects*/
    public static void display(SalesPerson[] x){
            
            for(int i = 0; i < x.length; ++i){
                 System.out.println("ID Number: " + x[i].getIdNum());
                 System.out.println("Annual Sales: $" + x[i].getAnnualSales());
                 System.out.println();
              }
        }
}