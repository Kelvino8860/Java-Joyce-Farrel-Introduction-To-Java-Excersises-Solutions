import javax.swing.*;

public class DemoVehicles
{
   public static void main(String[] args)
      {
        SailBoat aBoat = new SailBoat();
        Bicycle aBike = new Bicycle();

        JOptionPane.showMessageDialog(null,
           "\nVehicle descriptions:\n" +
           aBoat.toString() + "\n" + aBike.toString());
      }
}