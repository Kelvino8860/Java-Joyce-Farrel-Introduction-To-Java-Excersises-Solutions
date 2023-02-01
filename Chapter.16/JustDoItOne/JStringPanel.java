/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.justdoitone.graphics;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

/**
 *
 * @author kelvino
 */
public class JStringPanel extends JPanel
{
    private String string;
    private Font font;
    private Color color;
    private int horizontal;
    private int vertical;
    
    public JStringPanel(String s, Font f, Color c, int x, int y)
    {
        string = s;
        font = f;
        color = c;
        horizontal = x;
        vertical = y;
        
        setBackground(Color.WHITE);
    }
 
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(font);
        g.setColor(color);
        g.drawString(string, horizontal, vertical);
    }
}
