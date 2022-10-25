public class UsedCar
{ 
    private final String[] makeArray = {"Ford", "Honda", "Toyota", "Chrysler", "Other"};
    public static final String MAKE_DISPLAY = "\n1.Ford \n2.Honda \n3.Toyota \n4.Chrysler" +
                                              "\n5.Other";
    private String vin;
    private String make;
    private int year;
    private double mileage;
    private double price;

    public UsedCar(String vin, int make, int year, double mileage, double price) throws UsedCarException
       {
          //Throw an exception if VIN is not four digits
            int i, count = 0;
            for(i = 0; i < vin.length(); ++i)
               {
                  if(Character.isDigit(vin.charAt(i)))
                     {
                        count++;
                     }
               }
             if(count == 4)
               this.vin = vin;
             else
               throw(new UsedCarException());

         //Throw an exception if make is not in the array
            if(make >= 1 && make <= 5)
               this.make = makeArray[make - 1];
            else
             throw(new UsedCarException());

        //Throw an exception if year is not between 1990-2014 inclusive
           if(year > 1990 && year <= 2014)
              this.year = year;
           else
            throw(new UsedCarException());
        //Throw an exception if mileage or price is negative
           if(mileage > 0)
             this.mileage = mileage;
            else
             throw(new UsedCarException());
      
           if(price > 0)
             this.price = price;
            else
             throw(new UsedCarException());
       }

  public String getVin()
    { 
         return vin;
    }
  public String getMake()
    {
        return make;
    }
  public int getYear()
    {
       return year;
    }
  public double getMileage()
    {
       return mileage;
    }
  public double getPrice()
    {
       return price;
    }
}









