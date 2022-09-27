import java.util.Scanner;

public class TestPurchase{
     public static void main(String[]  args){
            Purchase[] objArray = new Purchase[5];
 
             Scanner input = new Scanner(System.in);
             int invoiceNum;
             int salesTax;

           for(int i = 0; i < objArray.length; i++){
                 objArray[i] = new Purchase();
                 System.out.print("Enter invoice number: ");
                  invoiceNum = input.nextInt();
                   objArray[i].setInvoiceNum(invoiceNum);
                     do{
                          System.out.print("Enter the sales amount: $");
                           salesTax = input.nextInt();

                            if(salesTax > 1000 && salesTax <= 8000){
                                  objArray[i].setSalesAmount(salesTax);
                                    break;
                                 }
                         }while(true);
                   System.out.println();
               }

            for(int j = 0; j < objArray.length; j++){
                 objArray[j].display(objArray[j]);
                 System.out.println();
              }
        }
}