package Lib;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.swing.event.*;

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
    int x= 300 ; int y =100 ; int start = 0;
    public Draw1(){
        Timer timer1 = new Timer(10, this);
        timer1.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,y, 100, 100);
        g.fillArc(x, y, 100 ,100, start, 180);
    }

    public void actionPerformed(ActionEvent e) {
        x -= 10;
        start += 10;
        if (x == -60) {
            x = 300;
        }

        paintComponent(this.getGraphics());
    }
    }
}




