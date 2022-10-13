import javax.swing.*;

public class OnlineNewspaperSubscription extends NewspaperSubscription
{
    @Override
    public void setAddress(String add)
      {
         boolean digit = false;
         for(int i = 0; i < add.length(); ++i)
           {
               char ch = add.charAt(i);
               if(ch == '@')
                 {
                    digit = true;
                    break;
                 }
           }

          if(digit == true)
            {
               rate = 9;
               address = add;
            }
          else if(digit == false)
            {
                JOptionPane.showMessageDialog(null, "INVALID ADDRESS!!!");
                rate = 0;  
            }
      }
}