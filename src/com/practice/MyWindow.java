package com.practice;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    private JLabel heading;
    private JLabel clockLabel;
    private Font font = new Font("", Font.BOLD, 35);

    public MyWindow() {
        super.setTitle("My Clock");
        super.setSize(400, 400);
        super.setLocation(300, 100);
        this.createGUI();
        super.setVisible(true);

    }
    public void createGUI(){
        heading= new JLabel("My Clock");
        clockLabel=new JLabel("clock");
        heading.setFont(font);
        clockLabel.setFont(font);
        
    }
}

