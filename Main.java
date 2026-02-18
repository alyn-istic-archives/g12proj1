package g12proj1;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Font handjet = Font.createFont(Font.TRUETYPE_FONT, new File("/C://Users//alyss//Downloads//handjet//Handjet-VariableFont_ELGR,ELSH,wght.ttf/"));
            Font gravitas = Font.createFont(Font.TRUETYPE_FONT, new File("C:/Users/alyss/Downloads/gravitas-one/GravitasOne.ttf"));
            //lowkenuinely i dont know how this works im sorry i js need my pretty font0
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(handjet);

            ge.registerFont(gravitas);

        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
        }
        System.out.println("hello !!");
        new Intro();
    }
}