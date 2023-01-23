/*6. Create a class that extends JPanel and whose constructor accepts two colors, a Font,
    and a String. Use the colors for the background and foreground of the panel and
    display the string using the font parameter. Create an application named JPanelDemo.
    Use GridLayout to display four sample panels. Save the files as JFlexiblePanel.java
    and JPanelDemo.java. */

    import java.awt.Color;
    import java.awt.*;
    import javax.swing.*;

    
    public class JFlexiblePanel extends JPanel
    {
        JLabel label = new JLabel("");   

        public JFlexiblePanel(Color color1, Color color2, Font font, String string)
        {
            this.setBackground(color1);
            this.setForeground(color2);
            label.setText(string);
            label.setFont(font);
            this.add(label);
            
        }
    }