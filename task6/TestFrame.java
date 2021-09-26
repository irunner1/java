import java.awt.Dimension;

import javax.swing.*;

public class TestFrame {

    public static void createGUI() {
//        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Test label");
        frame.getContentPane().add(label);
        frame.setPreferredSize(new Dimension(200, 100));
        frame.add(new JLabel(new ImageIcon("java.png")));
        frame.setBounds(0,0,500,250);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createGUI();
            }
        });
    }
}
