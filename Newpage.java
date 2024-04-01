import javax.swing.*;
import java.awt.*;

class Newpage extends JFrame {
    Newpage(){
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("welcome");
        Font f = new Font("welcome",Font.PLAIN,40);
        JTextField textField = new JTextField();
        textField.setFont(f);
        setSize(600,200);
    }
}
