public class Participants
{
   protected String name;
   protected int age;
   protected String streetAddress;

   public Participants(String name, int age, String address)
     {
        this.name = name;
        this.age = age;
        streetAddress = address;   
     }

   @Override
   public String toString()
     {
         return("\nName: " + name +
                "\nAge: " + age +
                "\nStreet Address: " + streetAddress);
     }

   @Override
   public boolean equals(Object obj)
     {
        Participants obj1 = (Participants)obj;
        boolean result;

        if(name.equalsIgnoreCase(obj1.name) && age == obj1.age && streetAddress.equalsIgnoreCase(obj1.streetAddress))
             {
                 result = true;
             }  
        else
          result = false;

       return result;
     }
}