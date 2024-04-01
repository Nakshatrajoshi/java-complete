import javax.swing.*;
import java.awt.event.*;
import javax.swing.JButton;

public class passwordfield {

    
    public static void main(String[] args) {
        
    
    JFrame f = new JFrame("Password  Field");
    final JLabel l = new JLabel();
    l.setBounds(20,150,200,50);
    final JPasswordField v = new JPasswordField();
    v.setBounds(100,75,100,30);
    JLabel l1 = new JLabel("Username");
    l1.setBounds(20,20,80,30);
    JLabel l2 = new JLabel("Password");
    l2.setBounds(20,75,80, 30);
    JButton b = new JButton("Login");
    b.setBounds(100,120,80,30);
    final JTextField t = new JTextField();
    t.setBounds(100, 20, 100, 30);

    f.add(t);
    f.add(v);
    f.add(l);
    f.add(l1);
    f.add(l2);
    f.add(b);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    f. addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e){
            f.dispose();
        }
    });
    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            String data = "Username " + t.getText();
            data += " Passward: " + new String(v.getPassword());
            l.setText(data);
        }
    });
}
}
