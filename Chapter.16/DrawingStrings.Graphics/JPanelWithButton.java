/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.drawingstrings.graphics;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.Color;

/**
 *
 * @author kelvino
 */
public class JPanelWithButton extends JPanel implements ActionListener{
    
    JButton button = new JButton("Press Me");
    Color color;
    String colorString;
    
    public JPanelWithButton()
    {
        color = Color.RED;
        colorString = "red";
        setBackground(color);
        add(button);
        button.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(color.equals(Color.RED))
        {
            color = Color.BLUE;
            colorString = "blue";
        }
        else
        {
            color = Color.RED;
            colorString = "red";
        }
        setBackground(color);
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.drawString("The panel is " + colorString, 20,80);
    }
}
