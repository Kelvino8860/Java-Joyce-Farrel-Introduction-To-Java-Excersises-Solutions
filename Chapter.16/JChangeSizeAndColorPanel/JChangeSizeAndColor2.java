/*b. Modify the JChangeSizeAndColorPanel application so that it continuously
     changes the size, color, and location of a phrase as long as the user continues to
     click the button. Save the application as JChangeSizeAndColorPanel2.java. */

          import javax.swing.*;
          import java.awt.*;
          import java.awt.event.*;
          import java.awt.Color;
          
          public class JChangeSizeAndColor2 extends JPanel implements ActionListener{
              
              Color color = Color.GREEN;
              String strColor = "blue";
              String phrase = "Welcome home Kelvino";
              JButton button = new JButton("Press Me");
              int x = 10;
              int y = 20;
              int count = 0;
              int size = 16;
              
              public JChangeSizeAndColor2(){
          
                  this.setLayout(new BorderLayout());
                  add(button,BorderLayout.SOUTH);
                  button.addActionListener(this);
              }
              
              @Override
              public void actionPerformed(ActionEvent e)
              {
                  count++;
          
                   if(strColor.equals("blue"))
                   {
                          color = Color.RED;
                          strColor = "red";
                   }
                   else
                   if(strColor.equals("red"))
                   {
                      color = Color.BLUE;
                      strColor = "blue";
                   }
          
                   repaint();
              }
          
              @Override
              public void paintComponent(Graphics g)
              {
                  super.paintComponent(g);
                  g.setColor(color);
                  g.setFont(new Font("Arial",Font.BOLD,size-=1));
                  g.drawString(phrase, x, y);
                  x+=g.getFontMetrics().getHeight();
              }
          
              public static void main(String[] args) {
                  JFrame frame = new JFrame();
                 JChangeSizeAndColor2 p1 = new JChangeSizeAndColor2();
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.add(p1);  
                 frame.setBounds(300,300,300,300);
                 frame.setVisible(true); 
              }
          }
          
