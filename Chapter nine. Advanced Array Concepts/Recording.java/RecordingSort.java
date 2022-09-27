/* b. Write an application that instantiates five Recording objects and prompts the user
      for values for the data fields. Then prompt the user to enter which field the
      Recordings should be sorted by—song title, artist, or playing time. Perform the
      requested sort procedure, and display the Recording objects. Save the file as
      RecordingSort.java*/

import java.util.Scanner;

public class RecordingSort{

     public static void main(String[]  args){

               //Initialize five Recording objects
           Recording[] objArray = new Recording[5];
           for(int i = 0; i < objArray.length; i++){
                 objArray[i] = new Recording();
                 objArray[i] = getData(objArray[i]);
              }

            sortArray(objArray);
        }
     
  /*Input data for the Recording objects*/
     public static Recording getData(Recording details){
            
            Scanner inputString = new Scanner(System.in);
            Scanner inputInt = new Scanner(System.in);
            String title, artist;
            int time;
            
            System.out.print("Title >> ");
            title = inputString.nextLine();
            details.setTitle(title);
            
            System.out.print("Artist >> ");
            artist = inputString.nextLine();
            details.setArtist(artist);
    
            System.out.print("Duration(sec) >> ");
            time = inputInt.nextInt();
            details.setSeconds(time);
            
            System.out.println();            

            return details;
        }

  /*Sort the Recording objects according to user will*/
     public static void sortArray(Recording[] b){
          
            Scanner input = new Scanner(System.in);
            int choice;
            System.out.println("Which field would you like the Recording-list to be sorted by?");

             do{
                    System.out.print("1.Title" + "\n2.Artist" + "\n3.Playing Time" + "\nEnter an integer >> " + "\n");
                    choice = input.nextInt();
                   
                 //Ensure the user inputs the correct value
                    if(choice > 0 && choice < 4){
                        
                       //Use the bubble sort method 
                          for(int i = 0; i < b.length; i++){
                               for(int j = 0; j < b.length - 1; j++){
                                    
                                   if(choice == 1){
                                          if(b[j].getTitle().compareTo(b[j + 1].getTitle()) > 0){
                                               
                                                 Recording temp = b[j];
                                                 b[j] = b[j + 1];
                                                 b[j + 1] = temp;
                                             }
                                      }
                                   
                                   if(choice == 2){
                                          if(b[j].getArtist().compareTo(b[j + 1].getArtist()) > 0){
                                               
                                                 Recording temp = b[j];
                                                 b[j] = b[j + 1];
                                                 b[j + 1] = temp;
                                             }
                                      }

                                   if(choice == 3){
                                         if(b[j].getSeconds() > b[j + 1].getSeconds()){
                       
                                               Recording temp = b[j];
                                                 b[j] = b[j + 1];
                                                 b[j + 1] = temp;
                                           }
                                      }
                                }
                             }
                      }               
 
                }while(choice < 1 || choice > 3);
            
              display(b);
        }

 /*Display the sorted array*/
    public static void display(Recording[] x){
        
           for(int i = 0; i < x.length; ++i){
                 
                   System.out.println("Title >> " + x[i].getTitle());
                   System.out.println("Artist >> " + x[i].getArtist());
                   System.out.println("Playing Time >> " + x[i].getSeconds() + "sec.\n");
                   
               }
       }
}



































