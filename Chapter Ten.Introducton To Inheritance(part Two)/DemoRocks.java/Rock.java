public class Rock
{
   protected int numSamples;
   protected String description;
   protected double weight;

   public Rock(int samples, double weight)
       {
            numSamples = samples;
            this.weight = weight;
            description = "Unclassified";
       }
  
   public int getNumSamples()
      {
         return numSamples;
      }
   public double getWeight()
      {
         return weight;
      }
   public String getDescription()
      {
         return description;
      }
}