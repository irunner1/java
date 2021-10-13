import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class image extends JFrame {
    protected static Image image;
    protected static ArrayList<Image> framlist = new ArrayList<>();

    image() {
        super("Test");
        setLayout(new FlowLayout());
        setSize(600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.drawImage(image,0,0, 600, 600, null);
    }

}