import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class cheeckboxMenu {
    public static void main(String[] args) {
        JFrame f = new JFrame("Jmenu Example ");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar mb = new JMenuBar();
        JMenu fm =  new JMenu("File");
        fm.setMnemonic(KeyEvent.VK_F);
        mb.add(fm);
        JMenuItem mi =  new JMenuItem("Open", KeyEvent.VK_N);
        fm.add(mi);

        JCheckBoxMenuItem casMenuItem = new JCheckBoxMenuItem();
        casMenuItem.setMnemonic(KeyEvent.VK_C);
        fm.add(casMenuItem);

    ActionListener al = new ActionListener() {
        public  void actionPerformed(ActionEvent event) {
            AbstractButton  ab = (AbstractButton) event.getSource();
            boolean selected = ab .getModel().isSelected();
            String newLabel;
            Icon newIcon;
            if(selected){
                newLabel = "Value-1";
            }
            else{
                newLabel= "Value-2";
            }
            ab.setText(newLabel);
        }
    };
  
    casMenuItem.addActionListener(al);
    f.setJMenuBar(mb);
    f.setSize(350,250);
    f.setVisible(true);

  
}
}
