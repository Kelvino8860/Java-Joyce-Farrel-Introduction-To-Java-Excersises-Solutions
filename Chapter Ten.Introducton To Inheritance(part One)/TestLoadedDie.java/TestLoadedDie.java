/*  2. a. In Chapter 4, you created a Die class that you can use to instantiate objects that
          hold one of six randomly selected values. Modify this class so its value field is
          protected instead of private. This will allow a child class to access the value.
          Save the file as Die.java.
       b. Create a LoadedDie class that can be used to give a player a slight advantage over
          the computer. A LoadedDie never rolls a 1; it only rolls values 2 through 6. Save
          the file as LoadedDie.java.
       c. Create a program that rolls two Die objects against each other 1,000 times and
          counts the number of times the first Die has a higher value than the other Die.
          Then roll a Die object against a LoadedDie object 1,000 times, and count the
          number of times the Die wins. Display the results. Save the application as
          TestLoadedDie.java. Figure 10-30 shows two typical executions.*/


public class TestLoadedDie
{  public static void main(String[]   args)
      {
         int regularWins = 0;
         int LoadedWins = 0;
 
          for(int i = 1; i <= 1000; ++i)
             {  
                   Die obj1 = new Die();
                   Die obj2 = new Die();

                if(obj1.getRandomValue() > obj2.getRandomMine())
                  {
                    regularWins++;
                  }
              }
          System.out.println("With two regular dice, the Computer die won " + regularWins + " times out of 1000");

           for(int i = 1; i <= 1000; ++i)
             {
                 Die obj3 = new Die();
                 LoadedDie obj4 = new LoadedDie(); 

                if(obj3.getRandomValue() > obj4.getRandomMine())
                  {
                    LoadedWins++;
                  }

              }
          System.out.println("With one regular die and one loaded die, the Computer die won " + LoadedWins +
                         " times out of 1000");
       }
}