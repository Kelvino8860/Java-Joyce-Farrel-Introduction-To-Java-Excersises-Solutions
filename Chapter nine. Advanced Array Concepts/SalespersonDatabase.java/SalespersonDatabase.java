/*5. In Chapter 8, you created a Salesperson class with fields for an ID number and sales
     values. Now, create an application that allows you to store an array that acts as a
     database of any number of Salesperson objects up to 20. While the user decides to
     continue, offer three options: to add a record to the database, to delete a record from
     the database, or to change a record in the database. Then proceed as follows:

     If the user selects the add option, issue an error message if the database is full.
     Otherwise, prompt the user for an ID number. If the ID number already exists in
     the database, issue an error message. Otherwise, prompt the user for a sales value
     and add the new record to the database.

     If the user selects the delete option, issue an error message if the database is
     empty. Otherwise, prompt the user for an ID number. If the ID number does not
     exist, issue an error message. Otherwise, do not access the record for any future
     processing.

     If the user selects the change option, issue an error message if the database is
     empty. Otherwise, prompt the user for an ID number. If the requested record
     does not exist, issue an error message. Otherwise, prompt the user for a new
     sales value and change the sales value for the record.

     After each option executes, display the updated database in ascending order by
     Salesperson ID number and prompt the user to select the next action. Save the
     application as SalespersonDatabase.java.*/

import java.util.Scanner;
import java.util.ArrayList;

public class SalespersonDatabase{
       public static void main(String[] args){
              
           //Initialize an arrayList to store 20 objects
              ArrayList<SalesPerson> objList = new ArrayList<>(20);
              Scanner input = new Scanner(System.in);
              int choice, idNum, sameNum;
              double annualSales;
              
          //Use a do while loop to carry out code operations
              do{
                    System.out.println("1.Enter(1) to add data to the database");
                    System.out.println("2.Enter(2) to delete data from the database");
                    System.out.println("3.Enter(3) to change data in the database");
                    System.out.println("4.Enter(4) to exit");
                    System.out.print("Enter your choice >> ");
                     
                    choice = input.nextInt();
                    
                    if(choice == 1){

                           System.out.println("\nADD DATA TO THE DATABASE\n");
                          
                       //Check whether the arrayList is full
                           if(objList.size() == 20){
                                System.out.println("\nSorry the database is full!!!\n");
                             }
                           else if(objList.size() < 20){
                                  System.out.print("Enter ID number >> ");
                                  idNum = input.nextInt();
                                  int count = 0;
                                 
                            //Check whether the ID number enterder is already in the database to ensure
                            //no objects share the same ID number
                                 for(int i = 0; i < objList.size(); ++i){
                                       sameNum = objList.get(i).getIdNum();
                                          if(sameNum == idNum){
                                                System.out.println("\nSorry the ID number exists!!!\n");
                                                count++;
                                              }
                                    }
                                 
                           //If everything is good prompt for annualsale and add the 
                          //new object to the arrayList
                                 if(count == 0){
                                      System.out.print("Enter annual sales >> ");
                                      annualSales = input.nextDouble();
                                      SalesPerson obj = new SalesPerson(idNum, annualSales);
                                      objList.add(obj);
                                    } 
                                 
                               }
                       }//choice 1



                  if(choice == 2){

                           System.out.println("\nDELETE DATA FROM THE DATABASE\n");                       
 
                        //Check whether the data base is empty
                           if(objList.size() == 0){
                                  System.out.println("\nSorry the database is empty!!!\n");
                               }
                           else if(objList.size() > 0){
                                  System.out.print("Enter an ID number >> ");
                                  int conId = input.nextInt();
                                  int count = 0, index = 0;

                                 //Check whether the entered id is in the database if the database is 
                                 //not empty   
                                 for(int i = 0; i < objList.size(); ++i){
                                       sameNum = objList.get(i).getIdNum();
                                          if(sameNum == conId){
                                                count++;
                                                index = i;
                                                break;
                                              }
                                    }
                                 
                                  //if the ID number entered is in the database,delete the object
                                    if(count > 0){
                                         objList.remove(index);
                                         System.out.println("Object at position " + index + " succesfully removed.\n");
                                       }
                                    if(count == 0){
                                         System.out.println("Sorry! the ID number does not exist in the Database.\n");
                                       }
                               }

                      }//choice 2


                  if(choice == 3){
                          
                             System.out.println("\nCHANGE DATA IN THE DATABASE\n"); 
                                                     
                               //Check whether the data base is empty
                           if(objList.size() == 0){
                                  System.out.println("\nSorry the database is empty!!!\n");
                               }
                           else if(objList.size() > 0){
                                  System.out.print("Enter an ID number >> ");
                                  int conId = input.nextInt();
                                  int count = 0, index = 0;

                                 //Check whether the entered id is in the database if the database is 
                                 //not empty   
                                 for(int i = 0; i < objList.size(); ++i){
                                       sameNum = objList.get(i).getIdNum();
                                          if(sameNum == conId){
                                                count++;
                                                index = i;
                                                break;
                                              }
                                    }
                                 
                                  //if the ID number entered is in the database,change the object's annualSales
                                    if(count > 0){
                                         
                                         System.out.print("Enter annual sales >> ");
                                         double salesAnnual = input.nextDouble();
                                         objList.get(index).setAnnualSales(salesAnnual);
                                         System.out.println("Object at position " + index + " annualsales succesfully changed.\n");
                                       }
                                    if(count == 0){
                                         System.out.println("Sorry! the ID number does not exist in the Database.\n");
                                       }
                               }

                     }//choice 3

                                           
                                              //Sort the objects in ascending order according to their ID numbers
                                                  for(int j = 0; j < objList.size(); ++j){
                                                         for(int k = 0; k < objList.size() - 1; ++k){
                                                                 if(objList.get(k).getIdNum() > objList.get(k + 1).getIdNum()){
                                   
                                                                               SalesPerson temp = objList.get(k);
                                                                               SalesPerson temp2 = objList.get(k + 1);
                                                                               objList.set(k, temp2);
                                                                               objList.set(k + 1, temp);
                                                                          }
                                                              }
                                                       }
                                          
                                         //Display the sorted objects after every operation
                                                     System.out.println("\nDisplay all info in the Database.\n");
                                                     System.out.println("..........................................................");
                                                 for(int j = 0; j < objList.size(); ++j){
                                                                     
                                                      System.out.println("ID NUMBER: " + objList.get(j).getIdNum());
                                                      System.out.println("ANNUALSALES: $" + objList.get(j).getAnnualSales());
                                                      System.out.println();
                                                   }
                                                     System.out.println("..........................................................");


                }while(choice != 4);
              
           }
}