public class ScentedCandle extends Candle
{
    private String scent;
  
    public String getScent()
      {
         return scent;
      }
    public void setScent(String scent)
      {
         this.scent = scent;
      }

    @Override
    public void setHeight(double height)
      {
         super.setHeight(height);
         price = 3 * height; 
      }
}