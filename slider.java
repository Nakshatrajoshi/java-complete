import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class slider extends JFrame {
    public slider(){
        JSlider s = new JSlider();
        s.setMinorTickSpacing(2);
        s.setMajorTickSpacing(10);
        s.setPaintLabels(true);
        s.setPaintTicks(true);

        JPanel p = new JPanel();
        p.add(s);
        add(p);
    }
    public static void main(String[] args) {
        slider f = new slider();
        f.pack();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
}
