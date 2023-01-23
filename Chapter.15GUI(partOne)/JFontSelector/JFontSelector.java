/*3. Create a JFrame that holds five buttons with the names of five different fonts. Include
    a sixth button that the user can click to make a font larger or smaller. Display a
    demonstration JLabel using the font and size that the user selects. Save the file as
    JFontSelector.java. */

    import java.awt.*;
    import java.awt.event.*;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

    public class JFontSelector extends JFrame implements ActionListener
    {
        private JButton bold = new JButton("BOLD");
        private JButton italic = new JButton("ITALIC");
        private JButton plain = new JButton("PLAIN");
        private JButton roman = new JButton("ROMAN_BASELINE");
        private JButton center = new JButton("HANGING_BASELINE");
        private JButton addSize = new JButton("FontSize(+)");
        private JButton minusSize = new JButton("FontSize(-)");
        private JLabel display = new JLabel("Font Selector");
        private JPanel butts = new JPanel();
        private JPanel buttsSize = new JPanel();
        private JPanel dispPanel = new JPanel();
        private Container con = getContentPane();

        private int sizeFont = 16;
        private String family = "Arial";
        private int fontType = Font.BOLD;
        private Font font = new Font(family,fontType,sizeFont);

        public JFontSelector()
        {
            setTitle("JFontSelector");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            con.setLayout(new GridLayout(2,2,5,5));
            con.setBackground(Color.YELLOW);
            butts.setLayout(new GridLayout(2,2,2,2));
            buttsSize.setLayout(new GridLayout(1,2));
            dispPanel.setLayout(new FlowLayout());
            dispPanel.setBackground(Color.PINK);
            con.add(butts);
            butts.add(bold);
            butts.add(italic);
            butts.add(plain);
            butts.add(roman);
            butts.add(center);
            buttsSize.add(addSize);
            buttsSize.add(minusSize);
            dispPanel.add(display);
            con.add(dispPanel);
            con.add(buttsSize);

            bold.addActionListener(this);
            italic.addActionListener(this);
            plain.addActionListener(this);
            roman.addActionListener(this);
            center.addActionListener(this);
            addSize.addActionListener(this);
            minusSize.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent e)
        {
            Object source = e.getSource();
            if(source == bold)
            {   
                family = "Arial";
                fontType = Font.BOLD;
                sizeFont = 16;
                font = new Font(family,fontType,sizeFont);
                display.setFont(font);
            }
            else
            if(source == italic)
            {
                family = "Arial";
                fontType = Font.ITALIC;
                sizeFont = 16;
                font = new Font(family,fontType,sizeFont);
                display.setFont(font);
            }
            else
            if(source == plain)
            {
                family = "Arial";
                fontType = Font.PLAIN;
                sizeFont = 16;
                font = new Font(family,fontType,sizeFont);
                display.setFont(font);
            }
            else
            if(source == roman)
            {
                family = "Arial";
                fontType = Font.ROMAN_BASELINE;
                sizeFont = 16;
                font = new Font(family,fontType,sizeFont);
                display.setFont(font);
            }
            else
            if(source == center)
            {
                family = "Arial";
                fontType = Font.HANGING_BASELINE;
                sizeFont = 16;
                font = new Font(family,fontType,sizeFont);
                display.setFont(font);
            }

            if(source == addSize)
            {
                sizeFont++;
                font = new Font(family, fontType, sizeFont);
                display.setFont(font);
            }
            else
            if(source == minusSize)
            {
                sizeFont--;
                font = new Font(family, fontType, sizeFont);
                display.setFont(font);
            }
        }

        public static void main(String[] args)
        {
            JFontSelector aFrame = new JFontSelector();
            aFrame.setBounds(300,300,800,400);
            aFrame.setVisible(true);
        }
    }






















