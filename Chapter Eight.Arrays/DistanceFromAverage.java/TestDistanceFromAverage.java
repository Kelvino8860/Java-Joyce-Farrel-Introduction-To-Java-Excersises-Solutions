import java.util.Scanner;
public class TestDistanceFromAverage{

    public static void main(String[]  args){
            DistanceFromAverage obj = new DistanceFromAverage(20);
            double element;
            Scanner input = new Scanner(System.in);
               
               int i = 0;
            System.out.print("Enter value: ");
            while(i <= DistanceFromAverage.DEFAULT_CAPACITY){
                   i++;
                  element = input.nextDouble();

                if(element == 99999 && obj.size > 0){
                      break;
                }
           
                 obj.push(element);

                }
         
         obj.pop();
       }
}