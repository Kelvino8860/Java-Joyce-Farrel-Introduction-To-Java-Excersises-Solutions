/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.drawingstrings.graphics;

import javax.swing.JFrame;
import java.awt.*;

/**
 *
 * @author kelvino
 */
public class JDemoPanelWithButton extends JFrame{

    JPanelWithButton p1 = new JPanelWithButton();
    
    public JDemoPanelWithButton()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(p1,BorderLayout.CENTER);
    }
    
    public static void main(String[] args) {
        
        JDemoPanelWithButton frame = new JDemoPanelWithButton();
        frame.setBounds(300,300,300,300);
        frame.setVisible(true);
    }
}
