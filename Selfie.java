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
    JLabel background, yap;
    JButton self;
    int self_h, self_w;
    boolean inarea;
    public Selfie(){
        this.setTitle("you've reached alyn !!");
        inarea = true;
        setBounds(900, 100, 400, 600);
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

        background = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/deepblue.png"));
        background.setBounds(0, 0, 1920, 1080);
        this.add(background);

        setVisible(true);
        setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==self){
            yap.setVisible(true);
            requestFocusInWindow();
            new pastProjects();
        }
    }
}
