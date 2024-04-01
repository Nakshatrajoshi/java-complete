import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MENU {

    MENU(){
        Frame f = new Frame("Menu and Menuitem Example");

        MenuBar mb = new MenuBar();
        Menu m = new Menu("Menu");
        Menu m2 = new Menu("SubMenu") ;
        MenuItem i1 = new MenuItem("item 1 ");
        MenuItem i2 = new MenuItem("item 2");
        MenuItem i3 = new MenuItem("item 3");
        MenuItem i4 = new MenuItem("item 4 ");
        MenuItem i5 = new MenuItem("item 5");
        MenuItem i6 = new MenuItem("item 6");
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m.add(m2);
        m2.add(i5);
        m2.add(i6);
        mb.add(m);
        f.setMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MENU();
    }
    
}
