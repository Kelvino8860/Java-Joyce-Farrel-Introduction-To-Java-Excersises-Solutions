public class ElectricBlanket extends Blanket
{
    private int heatSetting;
    private String autoShutOff;

    public ElectricBlanket()
      {
         heatSetting = 1;
         autoShutOff = "NO";
      }

    public void setHeatSetting(int setting)
      {
         if(setting > 0 && setting < 6)
             {
                heatSetting = setting;
             }
      }
    public void setAutoShutOff(int shut)
      {
         if(shut == 1)
          {
             autoShutOff = "YES";
             double price = getBlanketPrice();
             blanketPrice = price + 5.75;
          }
      }

    public int getHeatSetting()
       {
          return heatSetting;
       }
    public String getAutoShutOff()
       {
          return autoShutOff;
       }

    @Override
    public String toString()
      {
          return("\nBlanket Size: " + getBlanketSize() +
               "\nBlanket Color: " + getBlanketColor() +
               "\nBlanket Material: " + getBlanketMaterial() +
               "\nBlanket Price: $" + getBlanketPrice() +
               "\nHeat Setting: " + getHeatSetting() +
               "\nAuto ShutOff: " + getAutoShutOff());
      }
}