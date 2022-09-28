/* 1. Create a class named Horse that contains data fields for the name, color, and birth
      year. Include get and set methods for these fields. Next, create a subclass named
      RaceHorse, which contains an additional field that holds the number of races in
      which the horse has competed and additional methods to get and set the new field.
      Write an application that demonstrates using objects of each class. Save the files as
      Horse.java, RaceHorse.java, and DemoHorses.java*/

public class DemoHorse
{
    public static void main(String[] args)
       {
           Horse aHorse = new Horse();
           
           aHorse.setName("John");
           aHorse.setColor("Black");
           aHorse.setYear(2010);

           System.out.println("\nUsing the Parent class" +
                   "\nThe name of the Horse is: " + aHorse.getName() +
                   "\nThe color of the Horse is: " + aHorse.getColor() +
                   "\nThe year of birth is: " + aHorse.getYear());

            RaceHorse aRaceHorse = new RaceHorse();
 
            aRaceHorse.setName("Tracy");
            aRaceHorse.setColor("White");
            aRaceHorse.setYear(2013);
            aRaceHorse.setNumRaces(10);

             System.out.println("\nUsing the Child class" +
                   "\nThe name of the Horse is: " + aRaceHorse.getName() +
                   "\nThe color of the Horse is: " + aRaceHorse.getColor() +
                   "\nThe year of birth is: " + aRaceHorse.getYear() +
                   "\nThe number of races participated: " + aRaceHorse.getNumRaces());

       }
}