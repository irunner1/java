package lab5;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Gif extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    Gif() {
        super("Test");
        setLayout(new FlowLayout());
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 800, 600, null);
    }

    public static void main(String[] args) {
        for (int fr = 0; fr <= 27; fr++){
            framlist.add(new ImageIcon("gif/" + fr + ".png").getImage());
        }

        Gif animImg = new Gif();
        while (true) {
            for (int i = 0; i <= 27; i++) {
                image = framlist.get(i);
                animImg.repaint();
                try {
                    Thread.sleep(30);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}