import java.awt.*;


public class AWTExample extends Frame{

    AWTExample(){
        Button b = new Button("Close");
        b.setBounds(30, 100, 80, 30);

        add(b);
        setSize(300,300);

        setTitle("This is a closing button");

        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {
        AWTExample A = new AWTExample();
    }
}
