import javax.swing.*;

public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
    @Override
    public void setAddress(String add)
      {
        boolean digit = false;
        for(int i = 0; i < add.length(); ++i)
           {
              char ch = add.charAt(i);
              if(Character.isDigit(ch))
                {
                   digit = true;
                   break;
                }
           }

        if(digit == true)
          {
             rate = 15; 
             address = add;
          }
        else if(digit == false)
          {
             JOptionPane.showMessageDialog(null, "INVALID ADDRESS!!!");
             rate = 0;
          }
        
      }
}