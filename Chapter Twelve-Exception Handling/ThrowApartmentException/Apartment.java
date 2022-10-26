public class Apartment
{
   private String streetAdd;
   private String apartNum;
   private int numBed;
   private double rent;

   public Apartment(String street, String apart, int bedNum, double rent) throws ApartmentException
      {
         int i;
         int count = 0;

         streetAdd = street;

        //throw exception if appartment number does not consist of three digits
         for(i = 0; i < apart.length(); ++i)
           {
               if(Character.isDigit(apart.charAt(i)))
                  {
                    count++;
                  }
           }
         if(count != 3)
           throw(new ApartmentException()); 
         else
          apartNum = apart;  

       //throw an exception if number of bedrooms is less than one
          if(bedNum < 1 || bedNum > 4)
              throw(new ApartmentException()); 
         else
          numBed = bedNum;

        //throw an exception if rent is less than $500 or over $2500
           if(rent < 500 || rent > 2500)
               throw(new ApartmentException()); 
           else
             this.rent = rent;
      }
}