import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menunotepad implements ActionListener{
    JFrame f ;
    JMenuBar mb;
    JMenu file , edit, help;
    JMenuItem cut , copy ,paste, selectAll;
    JTextArea ta;
    menunotepad(){
        f = new JFrame();
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        selectAll = new JMenuItem("select all");

        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);
        mb = new JMenuBar();
        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);
        edit.add(selectAll);
        mb.add(file);mb.add(edit);mb.add(help);
        ta = new JTextArea();
        ta.setBounds(5,5,360,320);
        f.add(mb);f.add(ta);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

    public void actionperformed(ActionEvent e){
        if(e.getSource() == cut) {
            ta.cut();
        }
        if(e.getSource()== copy) {
            ta.copy();
        }
        if(e.getSource()== paste) {
            ta.paste();
            }
        if(e.getSource()== selectAll) {
            ta.selectAll();
        }
        }
        public static void main(String[] args) {
            new menunotepad();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    }