public class DemoSalesPerson{
    public static void main(String[]  args){
          SalesPerson[] objArray = new SalesPerson[10];

          for(int i = 0; i < objArray.length; i++){
                 objArray[i] = new SalesPerson(9999, 0);
              }

              int idNum = 111;
              double annualSales = 25_000;
           for(int i = 0; i < objArray.length; i++){
                 objArray[i].setIdNum(idNum);
                 objArray[i].setAnnualSales(annualSales);
                 idNum++;
                 annualSales += 5_000;
               }
    
            System.out.println("ID NUMBER" + "\t" + "ANNUAL SALES");
          for(int i = 0; i < objArray.length; i++){
                 System.out.print(objArray[i].getIdNum() + "\t\t");
                 System.out.println("$" + objArray[i].getAnnualSales());
              }
       }
}