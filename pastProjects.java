package g12proj1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class pastProjects extends JFrame implements ActionListener, KeyListener {
    //add scroll panel
    JScrollPane scroll;
    JLabel games;
    public pastProjects(){
        this.setTitle("Past Conquests !!");
        setBounds(100, 400, 600, 600);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setAlwaysOnTop(true);



        games = new JLabel(new ImageIcon("/C://Users//alyss//Downloads//proje.png/"));
        games.setBounds(0,0, 3000,2000);

        scroll = new JScrollPane(games);
        scroll.setBounds(0,0, 600, 600);

        this.add(scroll);

        setVisible(true);
    }
    public void actionPerformed (ActionEvent e){

    }
    public void keyPresed(KeyEvent e){

    }
    public void keyTyped(KeyEvent e){

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void keyReleaed(KeyEvent e){

    }
}
