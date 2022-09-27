import java.util.Scanner;
public class TestServices{
  public static void main(String[]  args){
     Services obj = new Services();
     
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the service that you require: ");
     String service = input.nextLine();
     obj.setServices(service);
     obj.displayServices();
     obj.chooseServices();
   }
}