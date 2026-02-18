package g12proj1;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Selfie extends JFrame implements ActionListener{
    Font f = new Font("Handjet", Font.BOLD, 50);
    JLabel background, yap, yap2, yap3;
    JButton self;
    int self_h, self_w;
    boolean inarea;
    public Selfie(){
        this.setTitle("you've reached alyn !!");
        inarea = true;
        setBounds(800, 50, 400, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setAlwaysOnTop(true);

        self_h = 300;
        self_w = 300;

        self = new JButton("self!!");
        self.setIcon(new ImageIcon((new ImageIcon("C:/Users/alyss/Downloads/selfiecore.png")).getImage().getScaledInstance(self_w, self_h, Image.SCALE_SMOOTH)));
        self.setBounds(50, 50, self_w, self_h);
        self.addActionListener(this);
        this.add(self);

        yap = new JLabel("woahhhhh irl photo !!");
        yap.setBounds(10, 350, 1000, 50);
        yap.setVisible(false);
        yap.setForeground(new Color(191, 221, 243, 150));
        yap.setFont(f);
        this.add(yap);

        yap2 = new JLabel("f - fade in, j - fade out");
        yap2.setBounds(10, 400, 1000, 50);
        yap2.setVisible(false);
        yap2.setForeground(new Color(191, 221, 243, 150));
        yap2.setFont(f);
        this.add(yap2);

        yap3 = new JLabel("down+up arrows, explore !!");
        yap3.setBounds(10, 450, 1000, 50);
        yap3.setVisible(false);
        yap3.setForeground(new Color(191, 221, 243, 150));
        yap3.setFont(f);
        this.add(yap3);

        background = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/deepblue.png"));
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);

        setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==self){
            yap.setVisible(true);
            yap2.setVisible(true);
            yap3.setVisible(true);
            requestFocusInWindow();
            new pastProjects();
        }
    }
}
