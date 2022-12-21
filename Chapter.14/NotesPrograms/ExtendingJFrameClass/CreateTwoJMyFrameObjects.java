import javax.swing.*;
public class CreateTwoJMyFrameObjects
{
    public static void main(String[] args)
       {
           JMyFrame myFrame = new JMyFrame();
           JMyFrame mySecondFrame = new JMyFrame();
           mySecondFrame.setBounds(200,0,250,100);
           myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           mySecondFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       }
}