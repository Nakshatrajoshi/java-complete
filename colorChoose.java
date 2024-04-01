import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class colorChoose extends JFrame implements ActionListener {
    JButton b ; 
    Container c ;

    colorChoose(){
        c =getContentPane() ;
        c.setLayout( new FlowLayout());
        b = new JButton("color");
        b.addActionListener(this);
        c.add(b);
    }
    public  void actionPerformed(ActionEvent e){
        Color initiaColor = Color.RED;
        Color color = JColorChooser.showDialog(this, "Select a color", initiaColor);
        c.setBackground(color);
    }

    public static void main(String[] args) {
        colorChoose ch =new colorChoose();
        ch.setSize(400,400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
