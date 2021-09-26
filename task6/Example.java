import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Example extends JFrame {
//    JTextField jta = new JTextField(10);
//    Font fnt = new Font("Times new roman", Font.BOLD,20); Example() {
//        super("Example");
//        setLayout(new FlowLayout());
//        setSize(250,100);
//        add(jta);
//        jta.setForeground(Color.PINK);
//        jta.setFont(fnt);
//        setVisible(true);
//    }

    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button = new JButton(" Add them up");
    Font fnt = new Font("Times new roman",Font.BOLD,20); Example() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(250,150);
        add(new JLabel("1st Number"));
        add(jta1);
        add(new JLabel("2nd Number"));
        add(jta2);
        add(button);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Result = "+(x1+x2),"Alert",JOptionPane.INFORMATION_MESSAGE);
                }
                catch(Exception e) {
                    JOptionPane.showMessageDialog(null, "Error in Numbers !","alert" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
     }
    public static void main(String[]args) {
        new Example();
    }
}
