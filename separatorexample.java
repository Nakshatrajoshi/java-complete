import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class separatorexample {
   JMenu menu ,subMenu ;
   JMenuItem i1,i2 ,i3 ,i4,i5;
   separatorexample(){
    JFrame f = new JFrame();
    JMenuBar mb = new JMenuBar() ;
    menu = new JMenu("Menu");
    i1 = new JMenuItem("item 1");
    i2 = new JMenuItem("item 2");
    menu.add(i1);
    menu.addSeparator();
    menu.add(i2);
    mb.add(menu);
    f.setJMenuBar(mb);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

}
public static void main(String args[]){
    new separatorexample();
}
}
