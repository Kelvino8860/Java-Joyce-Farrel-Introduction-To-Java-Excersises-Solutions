/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jcolorpanel;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

/**
 *
 * @author kelvino
 */
public class JColorPanel extends JPanel {

      int count = 0;
      String colorString;
      
      public JColorPanel(Color color)
      {
          if(color.equals(Color.RED))
             colorString = "red";
          else
              colorString = "blue";
          
          setBackground(color);
      }
    
      @Override
      public void paintComponent(Graphics g)
      {
          super.paintComponent(g);
          ++count;
          System.out.println("In paintComponent() method _ _" +
                  colorString + " " + count);
      }
    }
