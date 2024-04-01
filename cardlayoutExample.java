import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;

public class cardlayoutExample  extends JFrame implements ActionListener {

    CardLayout cr ;
    JButton  b1,b2,b3;
    Container cPane;


    cardlayoutExample(){
        cPane = getContentPane();
        cr = new CardLayout(40,30);
        cPane.setLayout(cr);

        b1 = new JButton("Apple") ;
        b2 = new JButton("Boy") ;
        b3 = new JButton("Cat");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        cPane.add("a",b1);
        cPane.add("b",b2);
        cPane.add("c",b3);
    }

    public void actionPerformed(ActionEvent e){
        cr.next(cPane);
    }

    public static void main(String[] args) {
       cardlayoutExample cl = new cardlayoutExample();

       cl.setSize(300,300);
       cl.setVisible(true);
       cl.setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
}