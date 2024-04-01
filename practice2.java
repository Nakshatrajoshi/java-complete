import org.w3c.dom.Text;

import java.awt.*;

public class practice2 {

    practice2 (){
        Frame f = new Frame();

      Label l = new Label("Employee id ");

      Button b = new Button("Submit");

        TextField t =new TextField();

        l.setBounds(20,80,80,30);
        t.setBounds(20,100,80,30);
        b.setBounds(100,100,80,30);

        f.add(b);
        f.add(l);
        f.add(t);

        f.setLayout(null);
        f.setSize(400,400);
        f.setTitle("employee info");
        f.setVisible(true);
    }

    public static void main(String[] args) {
        practice2 obj = new practice2();
    }

}