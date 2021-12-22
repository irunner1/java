package task8;

import javax.swing.*;

public class Main extends image {
    public static void main(String[] args) {
        String path = "D:\\Proga\\java\\mirea\\lab5\\gif\\";
        new image();
        for (int fr = 1; fr <= 181; fr++ ){
            if (fr < 10)
                framlist.add(new ImageIcon(path + "000" + fr + ".png").getImage());
            else if (fr < 100) {
                framlist.add(new ImageIcon(path + "00" + fr + ".png").getImage());
            }
            else {
                framlist.add(new ImageIcon(path + "0" + fr + ".png").getImage());
            }
        }

        image animImg = new image();
        while (true) {
            for (int i = 1; i <= 181; i++) {
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