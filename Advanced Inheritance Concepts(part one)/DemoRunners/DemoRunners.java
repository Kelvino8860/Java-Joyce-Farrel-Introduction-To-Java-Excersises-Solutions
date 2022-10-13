/* 13. Create an interface called Runner. The interface has an abstract method called
       run() that displays a message describing the meaning of “run” to the class. Create
       classes called Machine, Athlete, and PoliticalCandidate that all implement
       Runner. Create an application that demonstrates the use of the classes. Save the
       files as Runner.java, Machine.java, Athlete.java, PoliticalCandidate.java, and
       DemoRunners.java.*/

public class DemoRunners
{
   public static void main(String[] args)
      {
          Athlete obj1 = new Athlete();
          Machine obj2 = new Machine();
          PoliticalCandidate obj3 = new PoliticalCandidate();

          obj1.run();
          obj2.run();
          obj3.run();
      }
}