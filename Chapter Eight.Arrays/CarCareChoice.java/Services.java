/* 3. a. Write an application for Cody’s Car Care Shop that shows a user a list of available
         services: oil change, tire rotation, battery check, or brake inspection. Allow the user
         to enter a string that corresponds to one of the options, and display the option and
         its price as $25, $22, $15, or $5, accordingly. Display an error message if the user
         enters an invalid item. Save the file as CarCareChoice.java.*/

/* b. It might not be reasonable to expect users to type long entries such as “oil change”
      accurately. Modify the CarCareChoice class so that as long as the user enters the
      first three characters of a service, the choice is considered valid. Save the file as
      CarCareChoice2.java.*/

public class Services{ 
        private final String[] services = {"oil change", "tire rotation", "battery check", "brake inspection"};
        private final double[] prices = {25, 22, 15, 5};
        private String inputServices;

        public Services(){
           }
        
     /* Accept user input*/
        public void setServices(String service){
              
             inputServices = service;
           }

     /* Retrive user input*/
        public String getService(){
             
              return inputServices;
           }
      
    /* Display all the services offered*/
        public void displayServices(){
                System.out.println("Welcome to Cody's Car Care for the following services: " + "\n");
                System.out.println("Services" + "\t\t" + "Prices");
                for(int i = 0; i < services.length; i++){
                       System.out.println(services[i] + "\t\t" + "$" + prices[i]);
                    }
           }

    /* Display user input and the price*/
        public void chooseServices(){
              int count = 0;
              for(int i = 0; i < services.length; i++){
                       if(getService().equalsIgnoreCase(services[i])){
                             System.out.println("\nFor " + getService() + " you will be charged $" + prices[i]);
                             count++;
                             break;
                         }
                  }
              if(count == 0){
                     System.out.println("Sorry you entered an incorrect service");
                  }
              
           }
}