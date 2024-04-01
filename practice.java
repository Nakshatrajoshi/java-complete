import java.awt.*;

public class practice extends Frame {


    practice(){
        Button b = new Button("close me");

        b.setBounds(60,100,160,60);

        add(b);
        setSize(600,600);

        setTitle(" This is our gmsil");

        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        practice p = new practice();
    }
}
