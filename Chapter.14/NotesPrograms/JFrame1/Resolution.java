public class Resolution
{
   public static void main(String[] args)
   {
           double limit = 410.000;
	   double waveLength = 400.000;
	   double resolution = 0.94;
	   double resolving = 0;
	   
	   for(double i = 400.000; i <= 410.000; i += 0.1)
	   {
	       resolving = i / resolution;
		   System.out.println("Resolving power at wavelength " + i + " is " + resolving);
	   }
   }
}