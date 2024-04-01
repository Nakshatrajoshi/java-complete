import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ColorChooserExample extends JFrame implements ActionListener {
    JFrame f;
    JButton b;
    JTextArea ta;

    ColorChooserExample() {
        f = new JFrame("Color Chooser Example.");
        b = new JButton("Choose color");
        b.addActionListener(this);
        ta = new JTextArea("Hello, World!");
        ta.setEditable(true);
        f.add(b, BorderLayout.NORTH);
        f.add(ta, BorderLayout.CENTER);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        Color c = JColorChooser.showDialog(this, "Choose", Color.CYAN);
        if (c != null) {
            ta.setBackground(c);
            ta.repaint();
        }
    }

    public static void main(String[] args) {
        new ColorChooserExample();
    }
}