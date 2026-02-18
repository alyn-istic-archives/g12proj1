package g12proj1;

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Font;
import javax.swing.Timer;


public class Intro extends JFrame implements ActionListener, KeyListener{


    JLabel intro_txt, background, icon, yap, star1, star2,event, itxt2,itxt3, itxt4;
    Font f = new Font("Handjet", Font.BOLD, 80);
    Font g = new Font("Gravitas One", Font.BOLD, 75);
    JButton iconb, yapb, userb;
    int introx, textw, texth, temp, max, a;
    ImageIcon abt_me, abt_me_clear, starb;
    Icon[] star = new Icon[17];
    String l;
    boolean clear, popup_click;
    Timer animationTimer, fadeoutTimer, fadeinTimer;
    String intro;
    JTextField user;
    Selfie self;
    public Intro() {
        this.setTitle("Primary Window !!");
        setBounds(0, 0, 1920, 1080);
        setLayout(null);

        popup_click=false;
        intro = "INTRO 01: ALYN";
        introx = 200;
        textw = 2000;
        texth = 100;

        addKeyListener(this);

        intro_txt = new JLabel(intro);
        intro_txt.setBounds(introx, 50, textw, texth);
        intro_txt.setForeground(new Color(191, 221, 243));
        intro_txt.setFont(g);
        this.add(intro_txt);

        loadframes();

        event = new JLabel("click me ^^^");
        event.setBounds(125, 400, 1000, 100);
        event.setForeground(new Color(191, 221, 243));
        event.setFont(f);
        this.add(event);

        star1 = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/star1.png"));
        star1.setBounds(1025,500, 200,200 );
        star2 = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/star1.5.png"));
        star2.setBounds(300,300, 200,200 );
        star2.setVisible(true);

        this.add(star1);
        this.add(star2);

        icon = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/icon.png"));
        icon.setBounds(100, 100, 300, 300);

        iconb = new JButton("marketable alyns");
        iconb.setBackground(new Color(208, 217, 220));
        iconb.setBounds(125, 125, 250, 250);
        iconb.addActionListener(this);
        iconb.setOpaque(false);

        this.add(icon);
        this.add(iconb);

        yap = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/yap_rect_v.png"));
        yap.setBounds(775, 250, 400, 400);

        abt_me = (new ImageIcon("C:/Users/alyss/Downloads/about me.png"));
        abt_me_clear =(new ImageIcon("C:/Users/alyss/Downloads/yap_rect_v.png"));

        user = new JTextField("title text !!");
        user.setBounds(350,500,300,100);
        user.setForeground(new Color(191, 221, 243));
        user.setFont(f);
        this.add(user);

        userb = new JButton("save title");
        userb.setBounds(650, 500, 300, 100);
        userb.setForeground(new Color(191, 221, 243));
        userb.setFont(f);
        userb.addActionListener(this);
        userb.setOpaque(false);
        this.add(userb);

        yapb = new JButton("yap");
        yapb.setBounds(835, 285, 280, 320);
        yapb.addActionListener(this);
        yapb.setOpaque(false);

        this.add(yap);
        this.add(yapb);

        itxt2 = new JLabel(intro);
        itxt2.setBounds(introx, 125, textw, texth);
        itxt2.setForeground(new Color(191, 221, 243, 150));
        itxt2.setFont(g);
        this.add(itxt2);


        itxt3 = new JLabel(intro);
        itxt3.setBounds(introx, 190, textw, texth);
        itxt3.setForeground(new Color(191, 221, 243, 150));
        itxt3.setFont(g);
        this.add(itxt3);


        itxt4 = new JLabel(intro);
        itxt4.setBounds(introx, 255, textw, texth);
        itxt4.setForeground(new Color(191, 221, 243, 150));
        itxt4.setFont(g);
        this.add(itxt4);


        background = new JLabel(new ImageIcon("C:/Users/alyss/Downloads/bg (1).png"));
        background.setBounds(0, 0, 1920, 900);
        add(background);



        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void loadframes(){
        star[0] = new ImageIcon("C:/Users/alyss/Downloads/star1.png");
        star[1] = new ImageIcon("C:/Users/alyss/Downloads/star1.2.png");
        star[2] = new ImageIcon("C:/Users/alyss/Downloads/star1.3.png");
        star[3] = new ImageIcon("C:/Users/alyss/Downloads/star1.4.png");
        star[4] = new ImageIcon("C:/Users/alyss/Downloads/star1.5.png");
        star[5] = new ImageIcon("C:/Users/alyss/Downloads/star1.6.png");
        star[6] = new ImageIcon("C:/Users/alyss/Downloads/star1.7.png");
        star[7] = new ImageIcon("C:/Users/alyss/Downloads/star1.8.png");
        star[8] = new ImageIcon("C:/Users/alyss/Downloads/star1.9.png");
        star[9] = new ImageIcon("C:/Users/alyss/Downloads/star2.png");
        star[10] = new ImageIcon("C:/Users/alyss/Downloads/star2.1.png");
        star[11] = new ImageIcon("C:/Users/alyss/Downloads/star2.2.png");
        star[12] = new ImageIcon("C:/Users/alyss/Downloads/star2.3.png");
        star[13] = new ImageIcon("C:/Users/alyss/Downloads/star2.4.png");
        star[14] = new ImageIcon("C:/Users/alyss/Downloads/star2.5.png");
        star[15] = new ImageIcon("C:/Users/alyss/Downloads/star2.6.png");
        star[16] = new ImageIcon("C:/Users/alyss/Downloads/star2.7.png");
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == iconb){
            TextUpdate("click");
            requestFocusInWindow();
            if (!popup_click) {
                popup_click = true;
                new Selfie();
            }
            else{
                popup_click = false;
            }
        }
        if (e.getSource() == yapb){
            TextUpdate("about me");
            if (!clear) {
                clear = true;
                yap.setIcon(abt_me);
                requestFocusInWindow();
            }
            else{
                clear = false;
                yap.setIcon(abt_me_clear);
                requestFocusInWindow();
            }
        }
        if (e.getSource()=="userb"){
            event.setText("new title pending fade..");
            requestFocusInWindow();
        }
    }

    public void animate(Icon[] i, JLabel j, int ind){
        temp = ind;
        max = ind+16;
        if (animationTimer != null && animationTimer.isRunning()) {
            return; // Prevent multiple animations running simultaneously
        }
        animationTimer = new Timer(15, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (max>16){
                    if (temp>=0&&temp<16) {
                        j.setIcon(i[temp]);
                        temp++;
                        System.out.println(i[temp]);
                    }else if (temp>=16&&temp<21){
                        j.setIcon(i[temp-16]);
                        System.out.println(i[temp-16]);
                        temp++;
                    }
                    else{
                        animationTimer.stop();
                        temp = 0;
                    }
                }
                else{
                    if (temp<max){
                        j.setIcon(i[temp]);
                        temp++;
                        System.out.println(i[temp]);
                    }
                    else {
                        animationTimer.stop(); // Stop after one complete cycle
                        temp = 0; // Reset for next animation
                    }
                }
            }
        });
        animationTimer.start();
    }

    public void fadeout(JLabel j, int r, int g, int b, String l){
        a=255;
        if (fadeoutTimer != null && fadeoutTimer.isRunning()) {
            return;
        }
        if (fadeinTimer != null && fadeinTimer.isRunning()) {
            return;
        }
        String finalL = l;
        fadeoutTimer = new Timer(30, new ActionListener() {
            public void actionPerformed(ActionEvent i) {
                if (a > 0) {
                    j.setForeground(new Color(r, g, b, a));
                    j.setText(finalL);
                    introUpdate(finalL);
                    requestFocusInWindow();
                    a -= 10;
                } else {
                    fadeoutTimer.stop();
                    a = 255;
                }
            }
        });
        fadeoutTimer.start();
    }

    public void fadein(JLabel j, int r, int g, int b, String l){
        if (fadeinTimer != null && fadeinTimer.isRunning()) {
            return;
        }
        if (fadeoutTimer != null && fadeoutTimer.isRunning()) {
            return;
        }
        a=0;
        fadeinTimer = new Timer(30, new ActionListener() {
            public void actionPerformed(ActionEvent i) {
                if (a < 250) {
                    j.setForeground(new Color(r, g, b, a));
                    introUpdate(l);
                    requestFocusInWindow();
                    a += 10;
                } else {
                    fadeinTimer.stop();
                    a = 0;
                }
            }
        });
        fadeinTimer.start();
    }

    public void TextUpdate(String ev){
        switch (ev){
            case "down" -> event.setText("down arrow");
            case "about me" -> event.setText("lore drop 1!");
            case "click" -> event.setText("selfie core");
            case "up" -> event.setText("up arrow");
            case "fadein" -> event.setText("fadeeeee in");
            case "fadeout" -> event.setText("fadeeeee out");
            default -> event.setText("interaction: ??");

        }
    }

    public void keyPressed(KeyEvent ev) {
        if (ev.getKeyCode()== KeyEvent.VK_DOWN){
            TextUpdate("down");
            animate(star, star1, 0);
        }
        if (ev.getKeyCode() == KeyEvent.VK_UP){
            TextUpdate("up");
            animate(star, star2, 4);
        }
        if (ev.getKeyCode()== KeyEvent.VK_J){
            TextUpdate("fadeout");
            fadeout(intro_txt, 191, 221, 243, user.getText());
            fadeout(itxt2, 191, 221, 243, user.getText());
            fadeout(itxt3, 191, 221, 243, user.getText());
            fadeout(itxt4, 191, 221, 243, user.getText());
            requestFocusInWindow();
        }
        if (ev.getKeyCode()==KeyEvent.VK_F){
            TextUpdate("fadein");
            fadein(intro_txt, 191, 221, 243, user.getText());
            requestFocusInWindow();
            fadein(itxt2, 191, 221, 243, user.getText());
            requestFocusInWindow();
            fadein(itxt3, 191, 221, 243, user.getText());
            fadein(itxt4, 191, 221, 243, user.getText());
        }
    }

    public void introUpdate(String u){
        if (u.equals("cny")){
            intro = "shin nian quai leu";
            intro_txt.setText(intro);
            itxt2.setText(intro);
            itxt3.setText(intro);
            itxt4.setText(intro);
        }else {
            intro = u;
            intro_txt.setText(intro);
            itxt2.setText(intro);
            itxt3.setText(intro);
            itxt4.setText(intro);
        }
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }
}
