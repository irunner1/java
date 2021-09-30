import java.awt.*;
import javax.swing.*;
import java.util.Random;



public class Frame extends JFrame {
    public Shape shape = null;
    final Random random = new Random();

    Frame() {
        super("Main window");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    @Override
    public void paint(Graphics g){ 
        // g.setColor(Color.white);
        // g.fillRect(0, 0, getWidth(), getHeight());
        Rectangle first = new Rectangle();
        Circle second = new Circle();
        Triangle tri = new Triangle();
        Square four = new Square();

        // for (int i = 0; i < 20; i++) {
            switch (random.nextInt(5) + 1) {
                case(1):
                    first = new Rectangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 500, 800, 50, 100);
                    first.draw(g);
                    first = new Rectangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 300, 200, 50, 100);
                    first.draw(g);
                    first = new Rectangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 920, 880, 50, 100);
                    first.draw(g);
                    first = new Rectangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 650, 200, 50, 100);
                    first.draw(g);
                    break;
                case(2):
                    second = new Circle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 400, 400, 100, 100);
                    second.draw(g);
                    second = new Circle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 50, 260, 100, 100);
                    second.draw(g);
                    second = new Circle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 880, 50, 100, 100);
                    second.draw(g);
                    second = new Circle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 880, 500, 100, 100);
                    second.draw(g);
                    second = new Circle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 650, 800, 100, 100);
                    second.draw(g);
                    break;
                case(3):
                    tri = new Triangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 50, 100, 150, 200, 50, 200);
                    tri.draw(g);
                    tri = new Triangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 250, 300, 350, 100, 50, 200);
                    tri.draw(g);
                    tri = new Triangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 50, 100, 150, 200, 50, 200);
                    tri.draw(g);
                    tri = new Triangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 50, 100, 150, 200, 50, 200);
                    tri.draw(g);
                    tri = new Triangle(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 50, 100, 150, 200, 50, 200);
                    tri.draw(g);
                    break;
                case(4):
                    four = new Square(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 500, 200, 50);
                    four.draw(g);
                    four = new Square(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 800, 200, 90);
                    four.draw(g);
                    four = new Square(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 150, 500, 100);
                    four.draw(g);
                    four = new Square(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 600, 600, 100);
                    four.draw(g);
                    four = new Square(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)), 300, 900, 60);
                    four.draw(g);
                    break;
                default:
                    break;
            }
        }
    // }

    public static void main(String[] args) {
        new Frame();
    }
}

    