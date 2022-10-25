public class ApartmentException extends Exception
{
    public ApartmentException()
      {
         super("Street Address: Kolobot Road \nApartment Number: 345" +
                             "\nNumber of bedrooms: 2 \nRent: $3000");
      }
}