import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class panel {
    
    panel(){
      

        Frame f = new Frame() ;
        Panel p = new Panel() ;
        p.setBackground(Color.BLACK);
        p.setBounds(40, 80, 200, 200);

       
        Button b = new Button("Button 1");
        b.setBounds(50,100,80,30);
        b.setBackground(Color.CYAN);
        Button b2 = new Button("Button 2");
        b.setBackground(Color.GRAY);
        b.setBounds(100, 100, 80, 30);

        p.add(b);
        p.add(b2);
        f.add(p);
        
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

       f. addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });

    }
    public static void main(String[] args) {
        new panel();
    }
}
