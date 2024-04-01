import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;

public class firstswing {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton();
        b.setText("Click Me");
        b.setBounds(130, 100, 100, 40);

        f.add(b);
        f.setSize(400, 500);
        f.setLayout(new BorderLayout());
        f.setVisible(true);
    }
}