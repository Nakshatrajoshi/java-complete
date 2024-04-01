import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class choiceexpmaple {

    
choiceexpmaple (){
    Frame f = new Frame();

    final Label l = new  Label();

    l.setAlignment(Label.CENTER);
    l.setSize(400,100);
    Button b = new Button("Show");
    b.setBounds(200,100,50,20);


    final Choice c = new Choice();
     
    c.setBounds(100, 100, 75, 75);

    c.add("C");
    c.add("C++");
    c.add("Java");
    c.add("Python");

    f.add(c);
    f.add(l);
    f.add(b);

    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);


    b.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String data = "Programming Language Selected "+c.getSelectedIndex();
            l.setText(data);
        }
    });
}


public static void main(String[] args) {
    new choiceexpmaple();
}
}
