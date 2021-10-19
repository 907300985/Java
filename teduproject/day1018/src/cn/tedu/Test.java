package cn.tedu;

import javax.swing.*;
import java.awt.*;

/**
 * @Date:2021/10/18 19:35
 * @Author:NANDI_GUO
 */
public class Test extends JFrame{

    public Test(){
        setVisible(true);
        setTitle("HelloWorld");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocation(800,200);

        Container c = getContentPane();
        c.setBackground(Color.WHITE);

        JLabel l = new JLabel("Hello World!");
        JButton b = new JButton("上一首");
        JButton b1 = new JButton("下一首");
        setLayout(null);
        b.setBounds(50,300,100,30);
        b1.setBounds(200,300,100,30);



        c.add(l);
        c.add(b);
        c.validate();
        //f.setContentPane(c);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Test();
    }
}