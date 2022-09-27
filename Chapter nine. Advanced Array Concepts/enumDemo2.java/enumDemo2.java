import java.util.Scanner;

public class enumDemo2{
    
      enum Property {SINGLE_FAMILY, MULTIPLE_FAMILY, CONDOMINIUM,
                     LAND, BUSINESS};
     
      public static void main(String[] args){
          
           Property availProperty;
           String userEntry;
           Scanner input = new Scanner(System.in);

           System.out.println("Available properties: ");
            for(Property prop : Property.values())
                System.out.print(prop + " ");

           System.out.print("\n\nEnter the type of property you want: ");
           userEntry = input.nextLine().toUpperCase();
           availProperty = Property.valueOf(userEntry);

           switch(availProperty){
                case SINGLE_FAMILY:
                case MULTIPLE_FAMILY:
                    System.out.println("Listing fee is 5%");
                        break;
                case CONDOMINIUM:
                    System.out.println("Listing fee is 6%");
                        break;
                case LAND:
                case BUSINESS:
                    System.out.println
                      ("We do not handle this type of property");
             }
        }
}