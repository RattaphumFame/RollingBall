package Lib;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.*;

public class Form1 extends JFrame {
    public Form1(){
        Draw1 b = new Draw1();
        //this.getContentPane().add(new RollingBall());
        getContentPane().add(b,BorderLayout.CENTER);
        this.setSize(300,300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    class Draw1 extends JPanel implements ActionListener {
    int x= 10 ; int y =10 ;
    public Draw1(){
        Timer timer1 = new Timer(500, this);
        timer1.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(100,100, 100, 100);
        g.fillArc(100, 100, 100 ,100, 0, 180);
    }

    public void actionPerformed(ActionEvent e) {
        paintComponent(this.getGraphics());
    }
    }
}




