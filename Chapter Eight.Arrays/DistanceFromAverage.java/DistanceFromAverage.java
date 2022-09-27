/* Allow a user to enter any number of double values up to 20. The user should enter
99999 to quit entering numbers. Display an error message if the user quits without
entering any numbers; otherwise, display each entered value and its distance from the
average. Save the file as DistanceFromAverage.java.*/

public class DistanceFromAverage{
       
       private double[] elements;
       public static int size;
       private double average;
       public static final int DEFAULT_CAPACITY = 20;

       public DistanceFromAverage(){
               this(DEFAULT_CAPACITY);
           }
       public DistanceFromAverage(int capacity){
              
              elements = new double[capacity];
           }
      
       public void push(double value){
              
                if(value == 99999 && size == 0){
                      System.out.println("Sorry kindly input a value");
                    }
              if(value != 99999){
              elements[size++] = value;
             }

           }
       public double average(){
             double sum = 0;
             double count = 0;
             for(int i = 0; i < size; i++){
                     sum += elements[i];
                     count++;
                 }
             average = sum/count;
            return average;
           }

       public void pop(){
                double distance = 0;
               for(int i = 0; i < size; i++){
                       distance = average() - elements[i];
                   
                       System.out.println(elements[i] + " is " + distance + 
                                           " numbers away from the average " + average());
                           distance = 0;
                        
                    }
           }
}






