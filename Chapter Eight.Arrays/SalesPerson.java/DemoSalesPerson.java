public class DemoSalesPerson{
    public static void main(String[]  args){
          SalesPerson[] objArray = new SalesPerson[10];

          for(int i = 0; i < objArray.length; i++){
                 objArray[i] = new SalesPerson(9999, 0);
              }
    
            System.out.println("ID NUMBER" + "\t" + "ANNUAL SALES");
          for(int i = 0; i < objArray.length; i++){
                 System.out.print(objArray[i].getIdNum() + "\t\t");
                 System.out.println(objArray[i].getAnnualSales());
              }
       }
}